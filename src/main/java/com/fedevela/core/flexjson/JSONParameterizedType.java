package com.fedevela.core.flexjson;

/**
 * Created by Federico on 16/04/14.
 */
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class JSONParameterizedType implements ParameterizedType {

    private Class clazz;
    private Type[] types;

    public JSONParameterizedType(Class clazz, Type... types) {
        this.clazz = clazz;
        this.types = types;
    }

    public Type[] getActualTypeArguments() {
        return types;
    }

    public Type getRawType() {
        return clazz;
    }

    public Type getOwnerType() {
        return clazz;
    }
}
