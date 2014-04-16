package com.fedevela.core.flexjson;

/**
 * Created by Federico on 16/04/14.
 */
public interface ClassLocator {
    public Class locate(ObjectBinder context, Path currentPath) throws ClassNotFoundException;
}
