package com.fedevela.core.flexjson;

/**
 * Created by fvelazquez on 16/04/14.
 */
import flexjson.factories.ClassLocatorObjectFactory;
import flexjson.locators.StaticClassLocator;
import java.util.HashMap;
import java.util.Map;

public class JSONDeserializer<T>
{
    private Map<Class, ObjectFactory> typeFactories = new HashMap();
    private Map<Path, ObjectFactory> pathFactories = new HashMap();

    public T deserialize(String input)
    {
        ObjectBinder binder = createObjectBinder();
        return binder.bind(new JSONTokener(input).nextValue());
    }

    public T deserialize(String input, Class root)
    {
        ObjectBinder binder = createObjectBinder();
        return binder.bind(new JSONTokener(input).nextValue(), root);
    }

    private ObjectBinder createObjectBinder()
    {
        ObjectBinder binder = new ObjectBinder();
        for (Class clazz : this.typeFactories.keySet()) {
            binder.use(clazz, (ObjectFactory)this.typeFactories.get(clazz));
        }
        for (Path p : this.pathFactories.keySet()) {
            binder.use(p, (ObjectFactory)this.pathFactories.get(p));
        }
        return binder;
    }

    public JSONDeserializer<T> use(String path, ClassLocator locator)
    {
        this.pathFactories.put(Path.parse(path), new ClassLocatorObjectFactory(locator));
        return this;
    }

    public JSONDeserializer<T> use(String path, Class clazz)
    {
        return use(path, new StaticClassLocator(clazz));
    }

    public JSONDeserializer<T> use(Class clazz, ObjectFactory factory)
    {
        this.typeFactories.put(clazz, factory);
        return this;
    }

    public JSONDeserializer<T> use(String path, ObjectFactory factory)
    {
        this.pathFactories.put(Path.parse(path), factory);
        return this;
    }

    public JSONDeserializer<T> use(ObjectFactory factory, String... paths)
    {
        for (String p : paths) {
            use(p, factory);
        }
        return this;
    }
}
