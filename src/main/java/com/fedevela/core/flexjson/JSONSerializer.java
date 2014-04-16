package com.fedevela.core.flexjson;

/**
 * Created by fvelazquez on 16/04/14.
 */
import flexjson.transformer.Transformer;
import flexjson.transformer.TransformerWrapper;
import flexjson.transformer.TypeTransformerMap;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONSerializer
{
    public static final char[] HEX = "0123456789ABCDEF".toCharArray();
    private TypeTransformerMap typeTransformerMap = new TypeTransformerMap(TransformerUtil.getDefaultTypeTransformers());
    private Map<Path, Transformer> pathTransformerMap = new HashMap();
    private List<PathExpression> pathExpressions = new ArrayList();
    private boolean prettyPrint;
    private String rootName;
    private Map<String, String> alias;

    public JSONSerializer prettyPrint(boolean prettyPrint)
    {
        this.prettyPrint = prettyPrint;
        return this;
    }

    public JSONSerializer rootName(String rootName)
    {
        this.rootName = rootName;
        return this;
    }

    public String serialize(Object target)
    {
        return serialize(target, SerializationType.SHALLOW, new StringBuilderOutputHandler(new StringBuilder()));
    }

    public void serialize(Object target, Writer out)
    {
        serialize(target, SerializationType.SHALLOW, new WriterOutputHandler(out));
    }

    public String serialize(Object target, StringBuilder out)
    {
        return serialize(target, SerializationType.SHALLOW, new StringBuilderOutputHandler(out));
    }

    public String serialize(Object target, StringBuffer out)
    {
        return serialize(target, SerializationType.SHALLOW, new StringBufferOutputHandler(out));
    }

    public String serialize(Object target, OutputHandler out)
    {
        return serialize(target, SerializationType.SHALLOW, out);
    }

    public String deepSerialize(Object target)
    {
        return serialize(target, SerializationType.DEEP, new StringBuilderOutputHandler(new StringBuilder()));
    }

    public void deepSerialize(Object target, Writer out)
    {
        serialize(target, SerializationType.DEEP, new WriterOutputHandler(out));
    }

    public String deepSerialize(Object target, StringBuilder out)
    {
        return serialize(target, SerializationType.DEEP, new StringBuilderOutputHandler(out));
    }

    public String deepSerialize(Object target, StringBuffer out)
    {
        return serialize(target, SerializationType.DEEP, new StringBufferOutputHandler(out));
    }

    public String deepSerialize(Object target, OutputHandler out)
    {
        return serialize(target, SerializationType.DEEP, out);
    }

    protected String serialize(Object target, SerializationType serializationType, OutputHandler out)
    {
        String output = "";

        JSONContext context = JSONContext.get();
        context.setRootName(this.rootName);
        context.setPrettyPrint(this.prettyPrint);
        context.setOut(out);
        context.serializationType(serializationType);
        context.setTypeTransformers(this.typeTransformerMap);
        context.setPathTransformers(this.pathTransformerMap);
        context.setPathExpressions(this.pathExpressions);
        context.setFieldsNameAlias(this.alias);
        try
        {
            String rootName = context.getRootName();
            if ((rootName == null) || (rootName.trim().equals("")))
            {
                context.transform(target);
            }
            else
            {
                context.writeOpenObject();
                context.writeName(rootName);
                context.transform(target);
                context.writeCloseObject();
            }
            output = context.getOut().toString();
        }
        finally
        {
            JSONContext.cleanup();
        }
        return output;
    }

    public JSONSerializer transform(Transformer transformer, String... fields)
    {
        transformer = new TransformerWrapper(transformer);
        for (String field : fields) {
            if (field.length() == 0) {
                this.pathTransformerMap.put(new Path(), transformer);
            } else {
                this.pathTransformerMap.put(new Path(field.split("\\.")), transformer);
            }
        }
        return this;
    }

    public JSONSerializer transform(Transformer transformer, Class... types)
    {
        transformer = new TransformerWrapper(transformer);
        for (Class type : types) {
            this.typeTransformerMap.put(type, transformer);
        }
        return this;
    }

    protected void addExclude(String field)
    {
        int index = field.lastIndexOf('.');
        if (index > 0)
        {
            PathExpression expression = new PathExpression(field.substring(0, index), true);
            if (!expression.isWildcard()) {
                this.pathExpressions.add(expression);
            }
        }
        this.pathExpressions.add(new PathExpression(field, false));
    }

    protected void addInclude(String field)
    {
        this.pathExpressions.add(new PathExpression(field, true));
    }

    public JSONSerializer exclude(String... fields)
    {
        for (String field : fields) {
            addExclude(field);
        }
        return this;
    }

    public JSONSerializer include(String... fields)
    {
        for (String field : fields) {
            addInclude(field);
        }
        return this;
    }

    public List<PathExpression> getIncludes()
    {
        List<PathExpression> expressions = new ArrayList();
        for (PathExpression expression : this.pathExpressions) {
            if (expression.isIncluded()) {
                expressions.add(expression);
            }
        }
        return expressions;
    }

    public List<PathExpression> getExcludes()
    {
        List<PathExpression> excludes = new ArrayList();
        for (PathExpression expression : this.pathExpressions) {
            if (!expression.isIncluded()) {
                excludes.add(expression);
            }
        }
        return excludes;
    }

    public void setIncludes(List<String> fields)
    {
        for (String field : fields) {
            this.pathExpressions.add(new PathExpression(field, true));
        }
    }

    public void setExcludes(List<String> fields)
    {
        for (String field : fields) {
            addExclude(field);
        }
    }

    public void setAlias(Map<String, String> alias)
    {
        this.alias = alias;
    }
}
