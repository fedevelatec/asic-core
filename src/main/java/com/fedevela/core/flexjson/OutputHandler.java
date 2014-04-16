package com.fedevela.core.flexjson;

/**
 * Created by Federico on 16/04/14.
 */
public interface OutputHandler {

    public OutputHandler write(String value);

    public int write(String value, int start, int end, String append);

    public int write(String value, int start, int end);
}
