package com.fedevela.core.flexjson.transformer;

/**
 * Created by Federico on 16/04/14.
 */
public class ValueTransformer extends AbstractTransformer {
    public void transform(Object object) {
        getContext().writeQuoted( object.toString() );
    }
}
