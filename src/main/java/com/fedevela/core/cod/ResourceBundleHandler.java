package com.fedevela.core.cod;

/**
 * Created by Federico on 20/04/14.
 */
import java.util.ResourceBundle;

public class ResourceBundleHandler {

    private String source = null;
    private ResourceBundle resourceBundle = null;

    public ResourceBundleHandler(String source) throws CDCException {
        this.source = source;
        try {
            resourceBundle = ResourceBundle.getBundle(source);
        } catch (Exception e) {
            throw new CDCException("File " + source + " is not found.");
        }
    }

    public String getValue(String key) throws CDCException {
        String result = null;
        try {
            result = resourceBundle.getString(key);
        } catch (Exception ex) {
            throw new CDCException("The key " + key + " not found in the file config " + source + ".properties");
        }

        return result;
    }

    public String getValue(String key, String[] params)
            throws CDCException {
        String result = null;
        try {
            result = getValue(key);
            for (int i = 0; i < params.length; ++i) {
                result = result.replaceAll("\\{" + i + "\\}", params[i]);
            }
        } catch (Exception ex) {
            throw new CDCException("The key " + key + " not found in the file config " + source + ".properties");
        }

        return result;
    }
}