package com.fedevela.core.flexjson.transformer;

/**
 * Created by Federico on 16/04/14.
 */
import com.fedevela.core.flexjson.TypeContext;

import java.lang.reflect.Array;

public class ArrayTransformer extends AbstractTransformer {

    public void transform(Object object) {
        TypeContext typeContext = getContext().writeOpenArray();
        int length = Array.getLength(object);
        for (int i = 0; i < length; ++i) {
            if (!typeContext.isFirst()) getContext().writeComma();
            typeContext.increment();
            getContext().transform(Array.get(object, i));
        }
        getContext().writeCloseArray();
    }

}
