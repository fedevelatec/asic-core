package com.fedevela.core.flexjson.transformer;

/**
 * Created by Federico on 16/04/14.
 */
import java.util.Date;

public class BasicDateTransformer extends AbstractTransformer {

    public void transform(Object object) {
        getContext().write(String.valueOf(((Date) object).getTime()));
    }

}

