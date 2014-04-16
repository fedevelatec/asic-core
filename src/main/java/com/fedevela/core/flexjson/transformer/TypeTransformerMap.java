package com.fedevela.core.flexjson.transformer;

/**
 * Created by Federico on 16/04/14.
 */
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * This class is used to lookup type transformers from specific to generic implementation.
 * For example if an ArrayList transformer is provided
 */
public class TypeTransformerMap extends ConcurrentHashMap<Class, Transformer> {

    private TypeTransformerMap parentTransformerMap;

    protected boolean locked;

    public TypeTransformerMap() {
    }

    public TypeTransformerMap(TypeTransformerMap parentTransformerMap) {
        this.parentTransformerMap = parentTransformerMap;
    }

    @SuppressWarnings("unchecked")
    public Transformer getTransformer(Object key) {
        // look locally;
        LookupContext lookupContext = new LookupContext();
        Class keyClass = (key == null ? void.class : key.getClass());

        Transformer transformer = findTransformer(keyClass, keyClass, lookupContext);

        if (transformer == null && parentTransformerMap != null) {
            // look in parent
            // if no transformers found in child then check parent
            transformer = parentTransformerMap.getTransformer(key);
            if (transformer != null) {
                putTransformer(key == null ? void.class : key.getClass(), transformer);
            }
        }
        if (!lookupContext.isCached()) {
            // If there was not a transformer directly mapped to the key
            // then cache it for future lookups
            putTransformer(keyClass, transformer);
        }

        return transformer;
    }

    private Transformer findTransformer(Class key, Class originalKey, LookupContext lookupContext) {

        if (key == null) return null;

        // if specific type found
        if (containsKey(key)) {
            if (key != originalKey) {
                // this transformer has not been associated with the provided key
                // set cache to false so that the key and transformer are put
                // in the map contents and future lookups occur more quickly
                lookupContext.setCached(false);
            }
            return get(key);
        }

        // handle arrays specially if no specific array type handler
        // Arrays.class is used for this because it would never appear
        // in an object that needs to be serialized.
        if (key.isArray()) {
            // if we have reached this point then
            // this transformer has not been associated with the provided key
            // set cache to false so that the key and transformer are put
            // in the map contents and future lookups occur more quickly
            lookupContext.setCached(false);
            return get(Arrays.class);
        }

        // check for interface transformer
        for (Class interfaze : key.getInterfaces()) {
            Transformer t = findTransformer(interfaze, originalKey, lookupContext);
            if (t != null) return t;
        }

        // if no interface transformers then check superclass
        return findTransformer(key.getSuperclass(), originalKey, lookupContext);

    }

    public Transformer putTransformer(Class aClass, Transformer transformer) {
        // only make changes to the child TypeTransformerMap
        if (!locked) {
            put(aClass, transformer);
        }
        return transformer;
    }

    class LookupContext {

        private boolean cached;

        public boolean isCached() {
            return cached;
        }

        public void setCached(boolean cached) {
            this.cached = cached;
        }
    }
}
