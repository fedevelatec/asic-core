package com.fedevela.core.flexjson.transformer;

/**
 * Created by Federico on 16/04/14.
 */
/**
 * Transformers are used to alter the values written to a Flexjson stream.
 * This allows you to modify your data for use with HTML, security like stripping
 * out &lt;script&gt; tags, or rendering HTML from simple markups like markdown or other
 * technologies.  Use {@link com.fedevela.core.flexjson.JSONSerializer#transform} to register a Transformer to with
 * a JSONSerializer.
 */
public interface Transformer {

    public void transform(Object object);

}