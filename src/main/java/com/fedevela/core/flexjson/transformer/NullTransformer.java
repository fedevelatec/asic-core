package com.fedevela.core.flexjson.transformer;

/**
 * Created by Federico on 16/04/14.
 */
public class NullTransformer extends AbstractTransformer {

    /**
     * This is the default tranformer for handling nulls. This class
     * functions according to the JSON specification.
     *
     * @param object
     * @return
     */
    public void transform(Object object) {
        getContext().write("null");
    }

}
