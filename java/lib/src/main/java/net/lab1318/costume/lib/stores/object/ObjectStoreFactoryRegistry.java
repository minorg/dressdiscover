package net.lab1318.costume.lib.stores.object;

import static com.google.common.base.Preconditions.checkState;

import java.util.HashMap;
import java.util.Map;

import org.thryft.native_.Url;

import com.google.common.base.Optional;

public final class ObjectStoreFactoryRegistry {
    public static ObjectStoreFactoryRegistry getInstance() {
        return instance;
    }

    public synchronized Optional<ObjectStoreFactory> getObjectStoreFactory(final Url url) {
        final String urlScheme = url.getScheme().toLowerCase();
        return Optional.fromNullable(registry.get(urlScheme));
    }

    public synchronized void registerObjectStoreFactory(final ObjectStoreFactory factory, String urlScheme) {
        urlScheme = urlScheme.toLowerCase();
        checkState(registry.get(urlScheme) == null, urlScheme);
        registry.put(urlScheme, factory);
    }

    private final Map<String, ObjectStoreFactory> registry = new HashMap<>();
    private final static ObjectStoreFactoryRegistry instance = new ObjectStoreFactoryRegistry();
}
