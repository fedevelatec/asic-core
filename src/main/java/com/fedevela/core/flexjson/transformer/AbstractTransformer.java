package com.fedevela.core.flexjson.transformer;

/**
 * Created by Federico on 16/04/14.
 */
import com.fedevela.core.flexjson.JSONContext;

public abstract class AbstractTransformer implements Transformer, Inline {

    public JSONContext getContext() {
        return JSONContext.get();
    }

    public Boolean isInline() {
        return false;
    }

}
