package com.fedevela.core.flexjson.transformer;

/**
 * Created by Federico on 16/04/14.
 */
public class TransformerWrapper extends AbstractTransformer {

    protected Transformer transformer;
    protected Boolean isInterceptorTransformer = Boolean.FALSE;

    public TransformerWrapper(Transformer transformer) {
        this.transformer = transformer;
    }

    public void transform(Object object) {

        // push object onto stack so object has reference before starting
        getContext().getObjectStack().addFirst(object);

        this.transformer.transform(object);

        // Call FlexJSON interceptors afterTransform last
        getContext().getObjectStack().removeFirst();

    }

    @Override
    public Boolean isInline() {
        return transformer instanceof Inline && ((Inline) transformer).isInline();
    }

}
