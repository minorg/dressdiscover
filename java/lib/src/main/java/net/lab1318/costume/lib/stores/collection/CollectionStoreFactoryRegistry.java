package net.lab1318.costume.lib.stores.collection;

import org.thryft.native_.Uri;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.lib.CostumeProperties;
import net.lab1318.costume.lib.python.PythonInterpreterFactory;
import net.lab1318.costume.lib.stores.AbstractStoreFactoryRegistry;

@Singleton
public class CollectionStoreFactoryRegistry extends AbstractStoreFactoryRegistry<CollectionStoreFactory> {
    @Inject
    public CollectionStoreFactoryRegistry(final CostumeProperties properties,
            final PythonInterpreterFactory pythonInterpreterFactory) {
        super(properties, pythonInterpreterFactory);
        _registerPythonStoreFactories();
    }

    public final synchronized CollectionStoreFactory getCollectionStoreFactory(final Uri uri) {
        return _getStoreFactory(uri);
    }

    public final synchronized void registerCollectionStoreFactory(final CollectionStoreFactory factory,
            final String uriScheme) {
        _registerStoreFactory(factory, uriScheme);
    }
}
