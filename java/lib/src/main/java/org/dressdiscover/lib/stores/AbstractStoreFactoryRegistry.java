package org.dressdiscover.lib.stores;

import static com.google.common.base.Preconditions.checkState;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractStoreFactoryRegistry<StoreFactoryT extends StoreFactory> {
    protected AbstractStoreFactoryRegistry() {
    }

    protected final synchronized StoreFactoryT _getStoreFactory(String type) {
        type = type.toLowerCase();
        final StoreFactoryT result = registry.get(type);
        if (result != null) {
            return result;
        } else {
            throw new IllegalStateException("missing factory for " + type);
        }
    }

    protected final synchronized void _registerStoreFactory(final StoreFactoryT factory, String type) {
        type = type.toLowerCase();
        checkState(registry.get(type) == null, type);
        registry.put(type, factory);
    }

    private final Map<String, StoreFactoryT> registry = new HashMap<>();
}
