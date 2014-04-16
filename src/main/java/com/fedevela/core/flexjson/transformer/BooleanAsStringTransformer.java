package com.fedevela.core.flexjson.transformer;

/**
 * Created by Federico on 16/04/14.
 */
public class BooleanAsStringTransformer extends AbstractTransformer {

    private String truthValue;
    private String falseValue;

    public BooleanAsStringTransformer(String truthValue, String falseValue) {
        this.truthValue = truthValue;
        this.falseValue = falseValue;
    }

    public void transform(Object object) {
        getContext().writeQuoted(((Boolean) object) ? truthValue : falseValue);
    }
}
