package com.fedevela.core.cod.json;

/**
 * Created by Federico on 20/04/14.
 */
public class TInclude {

    private String[] path = null;
    private String alias = null;

    public TInclude(String propertyName) {
        path = propertyName.split("\\.");
        alias = path[path.length - 1];
    }

    public TInclude(String propertyName, String alias) {
        path = propertyName.split("\\.");
        this.alias = alias;
    }

    /**
     * @return the alias
     */
    public String field() {
        return alias;
    }

    public String path(int idx) {
        return path[idx];
    }

    public int size() {
        return path.length;
    }
}