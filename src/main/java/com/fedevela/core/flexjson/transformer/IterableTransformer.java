package com.fedevela.core.flexjson.transformer;

/**
 * Created by Federico on 16/04/14.
 */
import com.fedevela.core.flexjson.BasicType;
import com.fedevela.core.flexjson.TypeContext;

public class IterableTransformer extends AbstractTransformer {

    public void transform(Object object) {
        Iterable iterable = (Iterable) object;
        TypeContext typeContext = getContext().writeOpenArray();
        for (Object item : iterable) {
            if (!typeContext.isFirst()) getContext().writeComma();
            typeContext.increment();
            getContext().transform(item);
        }
        getContext().writeCloseArray();
    }

}
