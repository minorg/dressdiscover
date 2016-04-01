package net.lab1318.costume.lib.stores.collection;

import static com.google.common.base.Preconditions.checkNotNull;

import org.thryft.native_.Uri;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.lib.CostumeProperties;
import net.lab1318.costume.lib.stores.AbstractStoreFactoryRegistry;

@Singleton
public class CollectionStoreFactoryRegistry extends AbstractStoreFactoryRegistry<CollectionStoreFactory> {
    public static CollectionStoreFactoryRegistry getInstance() {
        return checkNotNull(instance);
    }

    @Inject
    public CollectionStoreFactoryRegistry(final CostumeProperties properties) {
        super(properties);
        instance = this;
        _registerPythonStoreFactories();
    }

    public final synchronized CollectionStoreFactory getCollectionStoreFactory(final Uri uri) {
        return _getStoreFactory(uri);
    }

    public final synchronized void registerCollectionStoreFactory(final CollectionStoreFactory factory,
            final String uriScheme) {
        _registerStoreFactory(factory, uriScheme);
    }

    private static CollectionStoreFactoryRegistry instance = null;
}
