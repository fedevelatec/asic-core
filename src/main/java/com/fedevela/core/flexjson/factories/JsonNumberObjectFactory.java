package com.fedevela.core.flexjson.factories;

/**
 * Created by Federico on 16/04/14.
 */
import com.fedevela.core.flexjson.JsonNumber;
import com.fedevela.core.flexjson.ObjectBinder;
import com.fedevela.core.flexjson.ObjectFactory;

import java.lang.reflect.Type;

/**
 * This class exists because it possible we don't have any type information to guide us
 * to what object we should instantiate when dealing with type-less collections.  When
 * this happens its possible a JsonNumber can come through, and since we will default
 * to the underlying type found in the JSON stream in these situations we need to convert
 * the JsonNumber to something valid: Double or Long.
 */
public class JsonNumberObjectFactory implements ObjectFactory {
    public Object instantiate(ObjectBinder context, Object value, Type targetType, Class targetClass) {
        JsonNumber number = (JsonNumber) value;
        if( number.isDecimal() ) {
            return number.doubleValue();
        } else {
            return number.longValue();
        }
    }
}
