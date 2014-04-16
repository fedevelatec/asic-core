package com.fedevela.core.flexjson;

/**
 * Created by Federico on 16/04/14.
 */
import com.fedevela.core.flexjson.transformer.Transformer;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is used by {@link JSONSerializer} to include
 * or exclude fields from the JSON serialization process.  You may
 * annotate fields or methods with this, but be consistent if you start
 * doing one vs. the other.  Typically this will be used to exclude
 * fields that should never be included in the serialization.  For
 * example the password of a User.
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.METHOD})
public @interface JSON {
    String name() default "";
    boolean include() default true;
    Class<? extends Transformer> transformer() default Transformer.class;
    Class<? extends ObjectFactory> objectFactory() default ObjectFactory.class;

}
