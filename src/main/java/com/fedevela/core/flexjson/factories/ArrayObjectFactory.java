package com.fedevela.core.flexjson.factories;

/**
 * Created by Federico on 16/04/14.
 */
import com.fedevela.core.flexjson.ObjectFactory;
import com.fedevela.core.flexjson.ObjectBinder;
import com.fedevela.core.flexjson.JSONException;

import java.lang.reflect.Type;
import java.lang.reflect.Array;
import java.util.List;

public class ArrayObjectFactory implements ObjectFactory {

    public Object instantiate(ObjectBinder context, Object value, Type targetType, Class targetClass) {
        List list = (List) value;
        context.getCurrentPath().enqueue("values");
        try {
            Class memberClass = targetClass.getComponentType() != null ? targetClass.getComponentType() : context.findClassAtPath( context.getCurrentPath() );
            if( memberClass == null ) throw new JSONException("Missing concrete class for array.  You might require a use() method.");
            Object array = Array.newInstance( memberClass, list.size() );
            for( int i = 0; i < list.size(); i++ ) {
                Object v = context.bind( list.get(i), memberClass );
                Array.set( array, i, v );
            }
            return array;
        } catch( ClassNotFoundException ex ) {
            throw new JSONException( String.format("%s: Could not find class %s", context.getCurrentPath(), ex.getMessage() ), ex );
        } finally {
            context.getCurrentPath().pop();
        }
    }
}
