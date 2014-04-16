package com.fedevela.core.flexjson;

/**
 * Created by fvelazquez on 16/04/14.
 */
public class JSONException extends RuntimeException
{
    public JSONException() {}

    public JSONException(String message)
    {
        super(message);
    }

    public JSONException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public JSONException(Throwable cause)
    {
        super(cause);
    }
}
