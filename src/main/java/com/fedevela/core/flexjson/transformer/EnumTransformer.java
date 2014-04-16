package com.fedevela.core.flexjson.transformer;

/**
 * Created by Federico on 16/04/14.
 */
public class EnumTransformer extends AbstractTransformer {

    public void transform(Object object) {
        getContext().writeQuoted(((Enum) object).name());
    }

}
