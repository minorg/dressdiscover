package org.dressdiscover.lib.stores.collection;

import org.dressdiscover.lib.stores.AbstractStoreFactoryRegistry;

import com.google.inject.Singleton;

@Singleton
public class CollectionStoreFactoryRegistry extends AbstractStoreFactoryRegistry<CollectionStoreFactory> {
    public final synchronized CollectionStoreFactory getCollectionStoreFactory(final String type) {
        return _getStoreFactory(type);
    }

    public final synchronized void registerCollectionStoreFactory(final CollectionStoreFactory factory,
            final String type) {
        _registerStoreFactory(factory, type);
    }
}
