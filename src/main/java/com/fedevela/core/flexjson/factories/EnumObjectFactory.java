package com.fedevela.core.flexjson.factories;

/**
 * Created by Federico on 16/04/14.
 */
import com.fedevela.core.flexjson.ObjectFactory;
import com.fedevela.core.flexjson.JSONException;
import com.fedevela.core.flexjson.ObjectBinder;

import java.lang.reflect.Type;

public class EnumObjectFactory implements ObjectFactory {
    public Object instantiate(ObjectBinder context, Object value, Type targetType, Class targetClass) {
        if( value instanceof String ) {
            return Enum.valueOf( (Class)targetType, value.toString() );
        } else {
            throw new JSONException( String.format("%s:  Don't know how to convert %s to enumerated constant of %s", context.getCurrentPath(), value, targetType ) );
        }
    }
}
