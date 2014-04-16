package com.fedevela.core.flexjson.transformer;

/**
 * Created by Federico on 16/04/14.
 */
import com.fedevela.core.flexjson.*;

public class ObjectTransformer extends AbstractTransformer {

    public void transform(Object object) {
        JSONContext context = getContext();
        Path path = context.getPath();
        ChainedSet visits = context.getVisits();
        try {
            if (!visits.contains(object)) {
                context.setVisits(new ChainedSet(visits));
                context.getVisits().add(object);
                // traverse object
                BeanAnalyzer analyzer = BeanAnalyzer.analyze( resolveClass(object) );
                TypeContext typeContext = context.writeOpenObject();
                for( BeanProperty prop : analyzer.getProperties() ) {
                    String name = prop.getName();
                    path.enqueue(name);
                    if( context.isIncluded(prop) && prop.isReadable() ) {
                        Object value = prop.getValue( object );
                        if (!context.getVisits().contains(value)) {

                            TransformerWrapper transformer = (TransformerWrapper)context.getTransformer(value);

                            if(!transformer.isInline()) {
                                if (!typeContext.isFirst()) context.writeComma();
                                typeContext.increment();
                                context.writeName(prop.getJsonName());
                            }
                            typeContext.setPropertyName(prop.getJsonName());

                            transformer.transform(value);
                        }
                    }
                    path.pop();
                }
                context.writeCloseObject();
                context.setVisits((ChainedSet) context.getVisits().getParent());

            } else {
                TypeContext parentTypeContext = getContext().peekTypeContext();
                if(parentTypeContext != null) {
                    parentTypeContext.decrement();
                }
            }
        } catch (JSONException e) {
            throw e;
        } catch (Exception e) {
            throw new JSONException(String.format("%s: Error while trying to deepSerialize.", path), e);
        }
    }

    protected Class resolveClass( Object obj ) {
        return obj.getClass();
    }

}
