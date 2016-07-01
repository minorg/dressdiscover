package org.dressdiscover.lib.stores;

import static com.google.common.base.Preconditions.checkState;

import java.util.HashMap;
import java.util.Map;

import org.thryft.native_.Uri;

public abstract class AbstractStoreFactoryRegistry<StoreFactoryT extends StoreFactory> {
    protected AbstractStoreFactoryRegistry() {
    }

    protected final synchronized StoreFactoryT _getStoreFactory(final Uri uri) {
        final String uriScheme = uri.getScheme().toLowerCase();
        final StoreFactoryT result = registry.get(uriScheme);
        if (result != null) {
            return result;
        } else {
            throw new IllegalStateException("missing factory for URI scheme " + uriScheme);
        }
    }

    protected final synchronized void _registerStoreFactory(final StoreFactoryT factory, String uriScheme) {
        uriScheme = uriScheme.toLowerCase();
        checkState(registry.get(uriScheme) == null, uriScheme);
        registry.put(uriScheme, factory);
    }

    private final Map<String, StoreFactoryT> registry = new HashMap<>();
}
