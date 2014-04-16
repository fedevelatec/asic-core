package com.fedevela.core.flexjson.factories;

/**
 * Created by Federico on 16/04/14.
 */
import com.fedevela.core.flexjson.ObjectBinder;
import com.fedevela.core.flexjson.ObjectFactory;

import java.lang.reflect.Type;

public class ByteObjectFactory implements ObjectFactory {

    public Object instantiate(ObjectBinder context, Object value, Type targetType, Class targetClass) {
        if( value instanceof Number ) {
            return ((Number)value).byteValue();
        } else {
            throw context.cannotConvertValueToTargetType( value, Byte.class );
        }
    }
}
