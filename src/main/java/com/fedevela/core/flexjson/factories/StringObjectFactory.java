package com.fedevela.core.flexjson.factories;

/**
 * Created by Federico on 16/04/14.
 */
import com.fedevela.core.flexjson.ObjectFactory;
import com.fedevela.core.flexjson.ObjectBinder;

import java.lang.reflect.Type;

public class StringObjectFactory implements ObjectFactory {
    public Object instantiate(ObjectBinder context, Object value, Type targetType, Class targetClass) {
        return value;
    }
}
