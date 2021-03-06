package com.fedevela.core.flexjson.factories;

/**
 * Created by Federico on 16/04/14.
 */
import com.fedevela.core.flexjson.ObjectBinder;
import com.fedevela.core.flexjson.ObjectFactory;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

public class ExistingObjectFactory implements ObjectFactory {

    private Object source;

    public ExistingObjectFactory(Object source) {
        this.source = source;
    }

    @Override
    public Object instantiate(ObjectBinder context, Object value, Type targetType, Class targetClass) {
        if( source instanceof Map ) {
            return context.bindIntoMap( (Map)value, (Map<Object,Object>)source, null, null );
        } else if( source instanceof Collection) {
            return context.bindIntoCollection( (Collection)value, (Collection)source, targetType );
        } else {
            return context.bindIntoObject( (Map)value, source, targetType );
        }
    }
}
