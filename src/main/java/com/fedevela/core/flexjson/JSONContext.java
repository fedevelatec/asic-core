package com.fedevela.core.flexjson;

/**
 * Created by fvelazquez on 16/04/14.
 */
import flexjson.transformer.Transformer;
import flexjson.transformer.TypeTransformerMap;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class JSONContext
{
    private static ThreadLocal<JSONContext> context = new ThreadLocal()
    {
        protected JSONContext initialValue()
        {
            return new JSONContext();
        }
    };
    private String rootName;
    private OutputHandler out;
    private boolean prettyPrint = false;
    private Stack<TypeContext> typeContextStack = new Stack();
    private int indent = 0;
    private TypeTransformerMap typeTransformerMap;
    private Map<Path, Transformer> pathTransformerMap;
    private List<PathExpression> pathExpressions;
    private SerializationType serializationType = SerializationType.SHALLOW;
    private ChainedSet visits = new ChainedSet(Collections.EMPTY_SET);
    private LinkedList<Object> objectStack = new LinkedList();
    private Path path = new Path();
    private Map<String, String> fieldsNameAlias;

    public void serializationType(SerializationType serializationType)
    {
        this.serializationType = serializationType;
    }

    public void transform(Object object)
    {
        Transformer transformer = getPathTransformer(object);
        if (transformer == null) {
            transformer = getTypeTransformer(object);
        }
        transformer.transform(object);
    }

    public Transformer getTransformer(Object object)
    {
        Transformer transformer = getPathTransformer(object);
        if (transformer == null) {
            transformer = getTypeTransformer(object);
        }
        return transformer;
    }

    private Transformer getPathTransformer(Object object)
    {
        if (null == object) {
            return getTypeTransformer(object);
        }
        return (Transformer)this.pathTransformerMap.get(this.path);
    }

    private Transformer getTypeTransformer(Object object)
    {
        return this.typeTransformerMap.getTransformer(object);
    }

    public void setTypeTransformers(TypeTransformerMap typeTransformerMap)
    {
        this.typeTransformerMap = typeTransformerMap;
    }

    public void setPathTransformers(Map<Path, Transformer> pathTransformerMap)
    {
        this.pathTransformerMap = pathTransformerMap;
    }

    public void setPrettyPrint(boolean prettyPrint)
    {
        this.prettyPrint = prettyPrint;
    }

    public void pushTypeContext(TypeContext contextEnum)
    {
        this.typeContextStack.push(contextEnum);
    }

    public void popTypeContext()
    {
        this.typeContextStack.pop();
    }

    public TypeContext peekTypeContext()
    {
        if (!this.typeContextStack.isEmpty()) {
            return (TypeContext)this.typeContextStack.peek();
        }
        return null;
    }

    public void setOut(OutputHandler out)
    {
        this.out = out;
    }

    public OutputHandler getOut()
    {
        return this.out;
    }

    public void write(String value)
    {
        TypeContext currentTypeContext = peekTypeContext();
        if ((currentTypeContext != null) && (currentTypeContext.getBasicType() == BasicType.ARRAY)) {
            writeIndent();
        }
        this.out.write(value);
    }

    public TypeContext writeOpenObject()
    {
        if (this.prettyPrint)
        {
            TypeContext currentTypeContext = peekTypeContext();
            if ((currentTypeContext != null) && (currentTypeContext.getBasicType() == BasicType.ARRAY)) {
                writeIndent();
            }
        }
        TypeContext typeContext = new TypeContext(BasicType.OBJECT);
        pushTypeContext(typeContext);
        this.out.write("{");
        if (this.prettyPrint)
        {
            this.indent += 4;
            this.out.write("\n");
        }
        return typeContext;
    }

    public void writeCloseObject()
    {
        if (this.prettyPrint)
        {
            this.out.write("\n");
            this.indent -= 4;
            writeIndent();
        }
        this.out.write("}");
        popTypeContext();
    }

    public void writeName(String name)
    {
        if (this.prettyPrint) {
            writeIndent();
        }
        writeQuoted(name);
        this.out.write(":");
        if (this.prettyPrint) {
            this.out.write(" ");
        }
    }

    public void writeComma()
    {
        this.out.write(",");
        if (this.prettyPrint) {
            this.out.write("\n");
        }
    }

    public TypeContext writeOpenArray()
    {
        if (this.prettyPrint)
        {
            TypeContext currentTypeContext = peekTypeContext();
            if ((currentTypeContext != null) && (currentTypeContext.getBasicType() == BasicType.ARRAY)) {
                writeIndent();
            }
        }
        TypeContext typeContext = new TypeContext(BasicType.ARRAY);
        pushTypeContext(typeContext);
        this.out.write("[");
        if (this.prettyPrint)
        {
            this.indent += 4;
            this.out.write("\n");
        }
        return typeContext;
    }

    public void writeCloseArray()
    {
        if (this.prettyPrint)
        {
            this.out.write("\n");
            this.indent -= 4;
            writeIndent();
        }
        this.out.write("]");
        popTypeContext();
    }

    public void writeIndent()
    {
        for (int i = 0; i < this.indent; i++) {
            this.out.write(" ");
        }
    }

    public void writeQuoted(String value)
    {
        if (this.prettyPrint)
        {
            TypeContext currentTypeContext = peekTypeContext();
            if ((currentTypeContext != null) && (currentTypeContext.getBasicType() == BasicType.ARRAY)) {
                writeIndent();
            }
        }
        this.out.write("\"");
        int last = 0;
        int len = value.length();
        for (int i = 0; i < len; i++)
        {
            char c = value.charAt(i);
            if (c == '"')
            {
                last = this.out.write(value, last, i, "\\\"");
            }
            else if (c == '\\')
            {
                last = this.out.write(value, last, i, "\\\\");
            }
            else if (c == '\b')
            {
                last = this.out.write(value, last, i, "\\b");
            }
            else if (c == '\f')
            {
                last = this.out.write(value, last, i, "\\f");
            }
            else if (c == '\n')
            {
                last = this.out.write(value, last, i, "\\n");
            }
            else if (c == '\r')
            {
                last = this.out.write(value, last, i, "\\r");
            }
            else if (c == '\t')
            {
                last = this.out.write(value, last, i, "\\t");
            }
            else if (Character.isISOControl(c))
            {
                last = this.out.write(value, last, i) + 1;
                unicode(c);
            }
        }
        if (last < value.length()) {
            this.out.write(value, last, value.length());
        }
        this.out.write("\"");
    }

    private void unicode(char c)
    {
        this.out.write("\\u");
        int n = c;
        for (int i = 0; i < 4; i++)
        {
            int digit = (n & 0xF000) >> 12;
            this.out.write(String.valueOf(JSONSerializer.HEX[digit]));
            n <<= 4;
        }
    }

    public static JSONContext get()
    {
        return (JSONContext)context.get();
    }

    public static void cleanup()
    {
        context.remove();
    }

    public ChainedSet getVisits()
    {
        return this.visits;
    }

    public void setVisits(ChainedSet visits)
    {
        this.visits = visits;
    }

    public LinkedList<Object> getObjectStack()
    {
        return this.objectStack;
    }

    public String getRootName()
    {
        return this.rootName;
    }

    public void setRootName(String rootName)
    {
        this.rootName = rootName;
    }

    public Path getPath()
    {
        return this.path;
    }

    public void setPathExpressions(List<PathExpression> pathExpressions)
    {
        this.pathExpressions = pathExpressions;
    }

    public void setFieldsNameAlias(Map<String, String> fieldsNameAlias)
    {
        this.fieldsNameAlias = fieldsNameAlias;
    }

    public Map<String, String> getFieldsNameAlias()
    {
        return this.fieldsNameAlias;
    }

    public boolean isIncluded(PropertyDescriptor prop)
    {
        PathExpression expression = matches(this.pathExpressions);
        if (expression != null) {
            return expression.isIncluded();
        }
        Method accessor = prop.getReadMethod();
        if (accessor.isAnnotationPresent(JSON.class)) {
            return ((JSON)accessor.getAnnotation(JSON.class)).include();
        }
        if (this.serializationType == SerializationType.SHALLOW)
        {
            Class propType = prop.getPropertyType();
            return (!propType.isArray()) && (!Iterable.class.isAssignableFrom(propType));
        }
        return true;
    }

    public boolean isIncluded(String key, Object value)
    {
        PathExpression expression = matches(this.pathExpressions);
        if (expression != null) {
            return expression.isIncluded();
        }
        String rootName = ((JSONContext)context.get()).getRootName();
        if (((this.serializationType == SerializationType.SHALLOW) && (rootName != null) && (this.path.length() > 1)) || ((this.serializationType == SerializationType.SHALLOW) && (rootName == null)))
        {
            Class type = value.getClass();
            return (!type.isArray()) && (!Iterable.class.isAssignableFrom(type));
        }
        return true;
    }

    public boolean isIncluded(Field field)
    {
        PathExpression expression = matches(this.pathExpressions);
        if (expression != null) {
            return expression.isIncluded();
        }
        if (field.isAnnotationPresent(JSON.class)) {
            return ((JSON)field.getAnnotation(JSON.class)).include();
        }
        if (this.serializationType == SerializationType.SHALLOW)
        {
            Class type = field.getType();
            return (!type.isArray()) && (!Iterable.class.isAssignableFrom(type));
        }
        return true;
    }

    public boolean isValidField(Field field)
    {
        return (!Modifier.isStatic(field.getModifiers())) && (Modifier.isPublic(field.getModifiers())) && (!Modifier.isTransient(field.getModifiers()));
    }

    protected PathExpression matches(List<PathExpression> expressions)
    {
        for (PathExpression expr : expressions) {
            if (expr.matches(this.path)) {
                return expr;
            }
        }
        return null;
    }
}
