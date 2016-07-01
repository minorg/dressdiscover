package org.dressdiscover.lib.stores.object;

import org.dressdiscover.lib.stores.AbstractStoreFactoryRegistry;
import org.thryft.native_.Uri;

import com.google.inject.Singleton;

@Singleton
public class ObjectStoreFactoryRegistry extends AbstractStoreFactoryRegistry<ObjectStoreFactory> {
    public final synchronized ObjectStoreFactory getObjectStoreFactory(final Uri uri) {
        return _getStoreFactory(uri);
    }

    public final synchronized void registerObjectStoreFactory(final ObjectStoreFactory factory,
            final String uriScheme) {
        _registerStoreFactory(factory, uriScheme);
    }
}
