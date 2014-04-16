package com.fedevela.core.flexjson;

/**
 * Created by fvelazquez on 16/04/14.
 */
import java.lang.reflect.Type;

public abstract interface ObjectFactory
{
    public abstract Object instantiate(ObjectBinder paramObjectBinder, Object paramObject, Type paramType, Class paramClass);
}
