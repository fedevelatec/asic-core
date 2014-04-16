package com.fedevela.core.flexjson.locators;

/**
 * Created by Federico on 16/04/14.
 */

import com.fedevela.core.flexjson.ClassLocator;
import com.fedevela.core.flexjson.Path;
import com.fedevela.core.flexjson.ObjectBinder;

import java.util.Map;

/**
 * Simple implementation for translating an object path to a single class.
 * Normally you would not use this class directly and use the
 * {@link flexjson.JSONDeserializer#use(String, Class)} method
 * instead.
 */
public class StaticClassLocator implements ClassLocator {
    private Class target;

    public StaticClassLocator(Class clazz) {
        target = clazz;
    }

    public Class locate(ObjectBinder context, Path currentPath) {
        return target;
    }
}
