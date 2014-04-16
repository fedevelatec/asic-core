package com.fedevela.core.flexjson;

/**
 * Created by fvelazquez on 16/04/14.
 */
import java.util.LinkedList;
import java.util.List;

public class Path
{
    LinkedList<String> path = new LinkedList();

    public Path() {}

    public Path(String... fields)
    {
        for (String field : fields) {
            this.path.add(field);
        }
    }

    public Path enqueue(String field)
    {
        this.path.add(field);
        return this;
    }

    public String pop()
    {
        return (String)this.path.removeLast();
    }

    public List<String> getPath()
    {
        return this.path;
    }

    public int length()
    {
        return this.path.size();
    }

    public String toString()
    {
        StringBuilder builder = new StringBuilder("[ ");
        boolean afterFirst = false;
        for (String current : this.path)
        {
            if (afterFirst) {
                builder.append(".");
            }
            builder.append(current);
            afterFirst = true;
        }
        builder.append(" ]");
        return builder.toString();
    }

    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if ((o == null) || (getClass() != o.getClass())) {
            return false;
        }
        Path path1 = (Path)o;
        if (!this.path.equals(path1.path)) {
            return false;
        }
        return true;
    }

    public int hashCode()
    {
        return this.path.hashCode();
    }

    public static Path parse(String path)
    {
        return path != null ? new Path(path.split("\\.")) : new Path();
    }
}
