package org.dressdiscover.lib.stores.collection;

import org.dressdiscover.lib.stores.AbstractStoreFactoryRegistry;
import org.thryft.native_.Uri;

import com.google.inject.Singleton;

@Singleton
public class CollectionStoreFactoryRegistry extends AbstractStoreFactoryRegistry<CollectionStoreFactory> {
    public final synchronized CollectionStoreFactory getCollectionStoreFactory(final Uri uri) {
        return _getStoreFactory(uri);
    }

    public final synchronized void registerCollectionStoreFactory(final CollectionStoreFactory factory,
            final String uriScheme) {
        _registerStoreFactory(factory, uriScheme);
    }
}
