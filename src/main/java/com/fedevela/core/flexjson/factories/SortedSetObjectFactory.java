package com.fedevela.core.flexjson.factories;

/**
 * Created by Federico on 16/04/14.
 */
import com.fedevela.core.flexjson.ObjectBinder;
import com.fedevela.core.flexjson.ObjectFactory;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.TreeSet;

public class SortedSetObjectFactory implements ObjectFactory {
    public Object instantiate(ObjectBinder context, Object value, Type targetType, Class targetClass) {
        if( value instanceof Collection) {
            return context.bindIntoCollection( (Collection)value, new TreeSet(), targetType);
        } else {
            TreeSet<Object> set = new TreeSet<Object>();
            set.add( context.bind( value ) );
            return set;
        }
    }
}
