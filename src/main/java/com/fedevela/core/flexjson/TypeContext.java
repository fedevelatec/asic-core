package com.fedevela.core.flexjson;

/**
 * Created by fvelazquez on 16/04/14.
 */
public class TypeContext
{
    private BasicType basicType;
    private boolean isFirst;
    private String propertyName;

    public TypeContext(BasicType basicType)
    {
        this.basicType = basicType;
        this.isFirst = true;
    }

    public BasicType getBasicType()
    {
        return this.basicType;
    }

    public void setBasicType(BasicType basicType)
    {
        this.basicType = basicType;
    }

    public boolean isFirst()
    {
        return this.isFirst;
    }

    public void setFirst(boolean first)
    {
        this.isFirst = first;
    }

    public String getPropertyName()
    {
        return this.propertyName;
    }

    public void setPropertyName(String propertyName)
    {
        this.propertyName = propertyName;
    }
}
