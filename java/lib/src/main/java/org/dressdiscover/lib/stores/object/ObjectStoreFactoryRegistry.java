package org.dressdiscover.lib.stores.object;

import org.dressdiscover.lib.stores.AbstractStoreFactoryRegistry;

import com.google.inject.Singleton;

@Singleton
public class ObjectStoreFactoryRegistry extends AbstractStoreFactoryRegistry<ObjectStoreFactory> {
    public final synchronized ObjectStoreFactory getObjectStoreFactory(final String type) {
        return _getStoreFactory(type);
    }

    public final synchronized void registerObjectStoreFactory(final ObjectStoreFactory factory,
            final String type) {
        _registerStoreFactory(factory, type);
    }
}
