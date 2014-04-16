package com.fedevela.core.flexjson;

/**
 * Created by fvelazquez on 16/04/14.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONTokener
{
    private int index;
    private Reader reader;
    private char lastChar;
    private boolean useLastChar;

    public JSONTokener(Reader reader)
    {
        this.reader = (reader.markSupported() ? reader : new BufferedReader(reader));

        this.useLastChar = false;
        this.index = 0;
    }

    public JSONTokener(String s)
    {
        this(new StringReader(s));
    }

    public void back()
            throws JSONException
    {
        if ((this.useLastChar) || (this.index <= 0)) {
            throw new JSONException("Stepping back two steps is not supported");
        }
        this.index -= 1;
        this.useLastChar = true;
    }

    public static int dehexchar(char c)
    {
        if ((c >= '0') && (c <= '9')) {
            return c - '0';
        }
        if ((c >= 'A') && (c <= 'F')) {
            return c - '7';
        }
        if ((c >= 'a') && (c <= 'f')) {
            return c - 'W';
        }
        return -1;
    }

    public boolean more()
            throws JSONException
    {
        char nextChar = next();
        if (nextChar == 0) {
            return false;
        }
        back();
        return true;
    }

    public char next()
            throws JSONException
    {
        if (this.useLastChar)
        {
            this.useLastChar = false;
            if (this.lastChar != 0) {
                this.index += 1;
            }
            return this.lastChar;
        }
        int c;
        try
        {
            c = this.reader.read();
        }
        catch (IOException exc)
        {
            throw new JSONException(exc);
        }
        if (c <= 0)
        {
            this.lastChar = '\000';
            return '\000';
        }
        this.index += 1;
        this.lastChar = ((char)c);
        return this.lastChar;
    }

    public char next(char c)
            throws JSONException
    {
        char n = next();
        if (n != c) {
            throw syntaxError("Expected '" + c + "' and instead saw '" + n + "'");
        }
        return n;
    }

    public String next(int n)
            throws JSONException
    {
        if (n == 0) {
            return "";
        }
        char[] buffer = new char[n];
        int pos = 0;
        if (this.useLastChar)
        {
            this.useLastChar = false;
            buffer[0] = this.lastChar;
            pos = 1;
        }
        try
        {
            int len;
            while ((pos < n) && ((len = this.reader.read(buffer, pos, n - pos)) != -1)) {
                pos += len;
            }
        }
        catch (IOException exc)
        {
            throw new JSONException(exc);
        }
        this.index += pos;
        if (pos < n) {
            throw syntaxError("Substring bounds error");
        }
        this.lastChar = buffer[(n - 1)];
        return new String(buffer);
    }

    public char nextClean()
            throws JSONException
    {
        for (;;)
        {
            char c = next();
            if ((c == 0) || (c > ' ')) {
                return c;
            }
        }
    }

    public String nextString(char quote)
            throws JSONException
    {
        StringBuilder sb = new StringBuilder();
        for (;;)
        {
            char c = next();
            switch (c)
            {
                case '\000':
                case '\n':
                case '\r':
                    throw syntaxError("Unterminated string");
                case '\\':
                    c = next();
                    switch (c)
                    {
                        case 'b':
                            sb.append('\b');
                            break;
                        case 't':
                            sb.append('\t');
                            break;
                        case 'n':
                            sb.append('\n');
                            break;
                        case 'f':
                            sb.append('\f');
                            break;
                        case 'r':
                            sb.append('\r');
                            break;
                        case 'u':
                            sb.append((char)Integer.parseInt(next(4), 16));
                            break;
                        case 'x':
                            sb.append((char)Integer.parseInt(next(2), 16));
                            break;
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 's':
                        case 'v':
                        case 'w':
                        default:
                            sb.append(c);
                    }
                    break;
                default:
                    if (c == quote) {
                        return sb.toString();
                    }
                    sb.append(c);
            }
        }
    }

    public String nextTo(char d)
            throws JSONException
    {
        StringBuilder sb = new StringBuilder();
        for (;;)
        {
            char c = next();
            if ((c == d) || (c == 0) || (c == '\n') || (c == '\r'))
            {
                if (c != 0) {
                    back();
                }
                return sb.toString().trim();
            }
            sb.append(c);
        }
    }

    public String nextTo(String delimiters)
            throws JSONException
    {
        StringBuilder sb = new StringBuilder();
        for (;;)
        {
            char c = next();
            if ((delimiters.indexOf(c) >= 0) || (c == 0) || (c == '\n') || (c == '\r'))
            {
                if (c != 0) {
                    back();
                }
                return sb.toString().trim();
            }
            sb.append(c);
        }
    }

    public Object nextValue()
            throws JSONException
    {
        char c = nextClean();
        switch (c)
        {
            case '"':
            case '\'':
                return nextString(c);
            case '{':
                back();
                return parseObject();
            case '(':
            case '[':
                back();
                return parseArray();
        }
        StringBuilder sb = new StringBuilder();
        while ((c >= ' ') && (",:]}/\\\"[{;=#".indexOf(c) < 0))
        {
            sb.append(c);
            c = next();
        }
        back();

        String s = sb.toString().trim();
        if (s.equals("")) {
            throw syntaxError("Missing value");
        }
        return stringToValue(s);
    }

    public char skipTo(char to)
            throws JSONException
    {
        char c;
        try
        {
            int startIndex = this.index;
            this.reader.mark(2147483647);
            do
            {
                c = next();
                if (c == 0)
                {
                    this.reader.reset();
                    this.index = startIndex;
                    return c;
                }
            } while (c != to);
        }
        catch (IOException exc)
        {
            throw new JSONException(exc);
        }
        back();
        return c;
    }

    public JSONException syntaxError(String message)
    {
        return new JSONException(message + toString());
    }

    public String toString()
    {
        return " at character " + this.index;
    }

    private Map<String, Object> parseObject()
    {
        Map<String, Object> jsonObject = new HashMap();
        if (nextClean() != '{') {
            throw syntaxError("A JSONObject text must begin with '{'");
        }
        for (;;)
        {
            char c = nextClean();
            switch (c)
            {
                case '\000':
                    throw syntaxError("A JSONObject text must end with '}'");
                case '}':
                    return jsonObject;
            }
            back();
            String key = nextValue().toString();






            c = nextClean();
            if (c == '=')
            {
                if (next() != '>') {
                    back();
                }
            }
            else if (c != ':') {
                throw syntaxError("Expected a ':' after a key");
            }
            putOnce(jsonObject, key, nextValue());
            switch (nextClean())
            {
                case ',':
                case ';':
                    if (nextClean() == '}') {
                        return jsonObject;
                    }
                    back();
            }
        }
        return jsonObject;

        throw syntaxError("Expected a ',' or '}'");
    }

    private void putOnce(Map<String, Object> jsonObject, String key, Object value)
    {
        if (key != null) {
            if (!jsonObject.containsKey(key)) {
                jsonObject.put(key, value);
            } else {
                throw new JSONException("Duplicate key \"" + key + "\"");
            }
        }
    }

    public List<Object> parseArray()
    {
        List<Object> list = new ArrayList();

        char c = nextClean();
        char q;
        if (c == '[')
        {
            q = ']';
        }
        else
        {
            char q;
            if (c == '(') {
                q = ')';
            } else {
                throw syntaxError("A JSONArray text must start with '['");
            }
        }
        char q;
        if (nextClean() == ']') {
            return list;
        }
        back();
        for (;;)
        {
            if (nextClean() == ',')
            {
                back();
                list.add(null);
            }
            else
            {
                back();
                list.add(nextValue());
            }
            c = nextClean();
            switch (c)
            {
                case ',':
                case ';':
                    if (nextClean() == ']') {
                        return list;
                    }
                    back();
            }
        }
        if (q != c) {
            throw syntaxError("Expected a '" + q + "'");
        }
        return list;

        throw syntaxError("Expected a ',' or ']'");
    }

    private Object stringToValue(String s)
    {
        if (s.equals("")) {
            return s;
        }
        if (s.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (s.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        if (s.equalsIgnoreCase("null")) {
            return null;
        }
        char b = s.charAt(0);
        if (((b >= '0') && (b <= '9')) || (b == '.') || (b == '-') || (b == '+'))
        {
            if (b == '0') {
                if ((s.length() > 2) && ((s.charAt(1) == 'x') || (s.charAt(1) == 'X'))) {
                    try
                    {
                        return Integer.valueOf(Integer.parseInt(s.substring(2), 16));
                    }
                    catch (Exception e) {}
                } else {
                    try
                    {
                        return Integer.valueOf(Integer.parseInt(s, 8));
                    }
                    catch (Exception e) {}
                }
            }
            try
            {
                return new Integer(s);
            }
            catch (Exception e)
            {
                try
                {
                    return new Long(s);
                }
                catch (Exception f)
                {
                    try
                    {
                        return new Double(s);
                    }
                    catch (Exception g) {}
                }
            }
        }
        return s;
    }
}
