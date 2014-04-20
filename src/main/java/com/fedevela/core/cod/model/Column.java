package com.fedevela.core.cod.model;

/**
 * Created by Federico on 20/04/14.
 */
import com.fedevela.core.cod.CDCException;
import com.fedevela.core.cod.TypeCast;
import com.fedevela.core.cod.Types.XLSDataType;



public class Column {

    private String type = "undefined";
    private String typeName = "undefined";
    private String name = "undefined";
    private String alias = "undefined";

    public Column() {
    }

    public Column(String name) {
        this.name = name;
        this.alias = name;
    }

    public Column(String name, String alias) {
        this.name = name;
        this.alias = alias;
    }

    public Column(String name, XLSDataType type) {
        this.name = name;
        this.type = type.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(Object name) throws CDCException {
        this.name = TypeCast.toString(name);
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setType(int type) {
        this.type = TypeCast.toString(type);
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}