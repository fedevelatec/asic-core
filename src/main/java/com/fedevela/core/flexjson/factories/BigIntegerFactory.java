package com.fedevela.core.flexjson.factories;

/**
 * Created by Federico on 16/04/14.
 */
import com.fedevela.core.flexjson.JsonNumber;
import com.fedevela.core.flexjson.ObjectBinder;
import com.fedevela.core.flexjson.ObjectFactory;

import java.lang.reflect.Type;
import java.math.BigInteger;

public class BigIntegerFactory implements ObjectFactory {

    public Object instantiate(ObjectBinder context, Object value, Type targetType, Class targetClass) {
        if( value instanceof JsonNumber ) {
            return ((JsonNumber)value).toBigInteger();
        } else {
            return new BigInteger( value.toString() );
        }
    }
}
