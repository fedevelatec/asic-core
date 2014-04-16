package com.fedevela.core.flexjson;

/**
 * Created by fvelazquez on 16/04/14.
 */
import flexjson.transformer.ArrayTransformer;
import flexjson.transformer.BasicDateTransformer;
import flexjson.transformer.BooleanTransformer;
import flexjson.transformer.CharacterTransformer;
import flexjson.transformer.ClassTransformer;
import flexjson.transformer.EnumTransformer;
import flexjson.transformer.HibernateTransformer;
import flexjson.transformer.IterableTransformer;
import flexjson.transformer.MapTransformer;
import flexjson.transformer.NullTransformer;
import flexjson.transformer.NumberTransformer;
import flexjson.transformer.ObjectTransformer;
import flexjson.transformer.StringTransformer;
import flexjson.transformer.Transformer;
import flexjson.transformer.TransformerWrapper;
import flexjson.transformer.TypeTransformerMap;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

public class TransformerUtil
{
    private static final TypeTransformerMap defaultTransformers = new TypeTransformerMap();

    static
    {
        Transformer transformer = new NullTransformer();
        defaultTransformers.put(null, new TransformerWrapper(transformer));

        transformer = new ObjectTransformer();
        defaultTransformers.put(Object.class, new TransformerWrapper(transformer));

        transformer = new ClassTransformer();
        defaultTransformers.put(Class.class, new TransformerWrapper(transformer));

        transformer = new BooleanTransformer();
        defaultTransformers.put(Boolean.TYPE, new TransformerWrapper(transformer));
        defaultTransformers.put(Boolean.class, new TransformerWrapper(transformer));

        transformer = new NumberTransformer();
        defaultTransformers.put(Number.class, new TransformerWrapper(transformer));

        defaultTransformers.put(Integer.class, new TransformerWrapper(transformer));
        defaultTransformers.put(Integer.TYPE, new TransformerWrapper(transformer));

        defaultTransformers.put(Long.class, new TransformerWrapper(transformer));
        defaultTransformers.put(Long.TYPE, new TransformerWrapper(transformer));

        defaultTransformers.put(Double.class, new TransformerWrapper(transformer));
        defaultTransformers.put(Double.TYPE, new TransformerWrapper(transformer));

        defaultTransformers.put(Float.class, new TransformerWrapper(transformer));
        defaultTransformers.put(Float.TYPE, new TransformerWrapper(transformer));

        defaultTransformers.put(BigDecimal.class, new TransformerWrapper(transformer));
        defaultTransformers.put(BigInteger.class, new TransformerWrapper(transformer));

        transformer = new StringTransformer();
        defaultTransformers.put(String.class, new TransformerWrapper(transformer));

        transformer = new CharacterTransformer();
        defaultTransformers.put(Character.class, new TransformerWrapper(transformer));
        defaultTransformers.put(Character.TYPE, new TransformerWrapper(transformer));

        transformer = new BasicDateTransformer();
        defaultTransformers.put(Date.class, new TransformerWrapper(transformer));

        transformer = new EnumTransformer();
        defaultTransformers.put(Enum.class, new TransformerWrapper(transformer));

        transformer = new IterableTransformer();
        defaultTransformers.put(Iterable.class, new TransformerWrapper(transformer));

        transformer = new MapTransformer();
        defaultTransformers.put(Map.class, new TransformerWrapper(transformer));

        transformer = new NullTransformer();
        defaultTransformers.put(Void.TYPE, new TransformerWrapper(transformer));

        transformer = new ArrayTransformer();
        defaultTransformers.put(Arrays.class, new TransformerWrapper(transformer));
        try
        {
            Class hibernateProxy = Class.forName("org.hibernate.proxy.HibernateProxy");
            defaultTransformers.put(hibernateProxy, new TransformerWrapper(new HibernateTransformer()));
        }
        catch (ClassNotFoundException ex) {}
        Collections.unmodifiableMap(defaultTransformers);
    }

    public static TypeTransformerMap getDefaultTypeTransformers()
    {
        return defaultTransformers;
    }
}
