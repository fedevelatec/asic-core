package com.fedevela.core.flexjson.factories;

/**
 * Created by Federico on 16/04/14.
 */
import com.fedevela.core.flexjson.ObjectFactory;
import com.fedevela.core.flexjson.ObjectBinder;
import com.fedevela.core.flexjson.JSONException;

import java.lang.reflect.Type;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class BeanObjectFactory implements ObjectFactory {

    public Object instantiate(ObjectBinder context, Object value, Type targetType, Class targetClass) {
        try {
            Object target = instantiate( targetClass );
            return context.bindIntoObject( (Map)value, target, targetType );
        } catch (InstantiationException e) {
            throw new JSONException(context.getCurrentPath() + ":There was an exception trying to instantiate an instance of " + targetClass.getName(), e );
        } catch (IllegalAccessException e) {
            throw new JSONException(context.getCurrentPath() + ":There was an exception trying to instantiate an instance of " + targetClass.getName(), e );
        } catch (InvocationTargetException e) {
            throw new JSONException(context.getCurrentPath() + ":There was an exception trying to instantiate an instance of " + targetClass.getName(), e );
        } catch (NoSuchMethodException e) {
            throw new JSONException(context.getCurrentPath() + ": " + targetClass.getName() + " lacks a no argument constructor.  Flexjson will instantiate any protected, private, or public no-arg constructor.", e );
        }
    }

    protected Object instantiate( Class clazz ) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible( true );
        return constructor.newInstance();
    }
}
