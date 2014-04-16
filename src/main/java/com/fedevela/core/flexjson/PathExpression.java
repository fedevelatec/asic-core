package com.fedevela.core.flexjson;

/**
 * Created by fvelazquez on 16/04/14.
 */
import java.util.Arrays;
import java.util.List;

public class PathExpression
{
    String[] expression;
    boolean wildcard = false;
    boolean included = true;

    public PathExpression(String expr, boolean anInclude)
    {
        this.expression = expr.split("\\.");
        this.wildcard = (expr.indexOf('*') >= 0);
        this.included = anInclude;
    }

    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < this.expression.length; i++)
        {
            builder.append(this.expression[i]);
            if (i < this.expression.length - 1) {
                builder.append(",");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    public boolean matches(Path path)
    {
        int exprCurrentIndex = 0;
        int pathCurrentIndex = 0;
        while (pathCurrentIndex < path.length())
        {
            String current = (String)path.getPath().get(pathCurrentIndex);
            if ((exprCurrentIndex < this.expression.length) && (this.expression[exprCurrentIndex].equals("*")))
            {
                exprCurrentIndex++;
            }
            else if ((exprCurrentIndex < this.expression.length) && (this.expression[exprCurrentIndex].equals(current)))
            {
                pathCurrentIndex++;
                exprCurrentIndex++;
            }
            else if ((exprCurrentIndex - 1 >= 0) && (this.expression[(exprCurrentIndex - 1)].equals("*")))
            {
                pathCurrentIndex++;
            }
            else
            {
                return false;
            }
        }
        if ((exprCurrentIndex > 0) && (this.expression[(exprCurrentIndex - 1)].equals("*"))) {
            return (pathCurrentIndex >= path.length()) && (exprCurrentIndex >= this.expression.length);
        }
        return (pathCurrentIndex >= path.length()) && (path.length() > 0);
    }

    public boolean isWildcard()
    {
        return this.wildcard;
    }

    public boolean isIncluded()
    {
        return this.included;
    }

    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if ((o == null) || (getClass() != o.getClass())) {
            return false;
        }
        PathExpression that = (PathExpression)o;
        if (!Arrays.equals(this.expression, that.expression)) {
            return false;
        }
        return true;
    }

    public int hashCode()
    {
        return this.expression != null ? Arrays.hashCode(this.expression) : 0;
    }
}
