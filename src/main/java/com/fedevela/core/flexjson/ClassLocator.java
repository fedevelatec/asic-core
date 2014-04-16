package com.fedevela.core.flexjson;

/**
 * Created by fvelazquez on 16/04/14.
 */
public abstract interface ClassLocator
{
    public abstract Class locate(ObjectBinder paramObjectBinder, Path paramPath)
            throws ClassNotFoundException;
}
