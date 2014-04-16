package com.fedevela.core.flexjson.transformer;

/**
 * Created by Federico on 16/04/14.
 */
import com.fedevela.core.flexjson.JSONContext;
import com.fedevela.core.flexjson.Path;
import com.fedevela.core.flexjson.TypeContext;

import java.util.Map;

public class MapTransformer extends AbstractTransformer {

    public void transform(Object object) {
        JSONContext context = getContext();
        Path path = context.getPath();
        Map value = (Map) object;

        TypeContext typeContext = getContext().writeOpenObject();
        for (Object key : value.keySet()) {

            path.enqueue(key != null ? key.toString() : null);

            if (context.isIncluded(key != null ? key.toString() : null, value.get(key))) {

                TransformerWrapper transformer = (TransformerWrapper)context.getTransformer(value.get(key));


                if(!transformer.isInline()) {
                    if (!typeContext.isFirst()) getContext().writeComma();
                    typeContext.increment();
                    if( key != null ) {
                        getContext().writeName(key.toString());
                    } else {
                        getContext().writeName(null);
                    }
                }

                if( key != null ) {
                    typeContext.setPropertyName(key.toString());
                } else {
                    typeContext.setPropertyName(null);
                }

                transformer.transform(value.get(key));

            }

            path.pop();

        }
        getContext().writeCloseObject();
    }

}
