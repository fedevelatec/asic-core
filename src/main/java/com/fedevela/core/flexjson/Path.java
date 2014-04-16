package com.fedevela.core.flexjson;

/**
 * Created by Federico on 16/04/14.
 */
import java.util.LinkedList;
import java.util.List;

/**
 * Internal class used by Flexjson to represent a path to a field within a serialized stream.
 */
public class Path {
    LinkedList<String> path = new LinkedList<String>();

    public Path() {
    }

    public Path(String... fields) {
        for (String field : fields) {
            path.add(field);
        }
    }

    public Path enqueue(String field) {
        path.add(field);
        return this;
    }

    public String pop() {
        return path.removeLast();
    }

    public List<String> getPath() {
        return path;
    }

    public int length() {
        return path.size();
    }

    public String toString() {
        StringBuilder builder = new StringBuilder("[ ");
        boolean afterFirst = false;
        for (String current : path) {
            if (afterFirst) {
                builder.append(".");
            }
            builder.append(current);
            afterFirst = true;
        }
        builder.append(" ]");
        return builder.toString();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Path path1 = (Path) o;

        if (!path.equals(path1.path)) return false;

        return true;
    }

    public int hashCode() {
        return path.hashCode();
    }

    public static Path parse(String path) {
        return path != null ? new Path( path.split("\\." ) ) : new Path();
    }
}
