package com.fedevela.core.cod.annotation;

/**
 * Created by Federico on 20/04/14.
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.METHOD, ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface CWColumn {

    public String name() default "";

    public double width() default 1.0;

    public String format() default "";

    public String header() default "";

    String headerAlign() default "center";

    String summaryType() default "";

    String summaryRenderer() default "";

    String renderer() default "";

    String backcolor() default "#CCCCCC";

    String expression() default "";

    boolean filter() default false;

    String align() default "left";
}