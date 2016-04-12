package net.lab1318.costume.lib.stores.object;

import org.thryft.native_.Uri;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.lib.CostumeProperties;
import net.lab1318.costume.lib.python.PythonInterpreterFactory;
import net.lab1318.costume.lib.stores.AbstractStoreFactoryRegistry;

@Singleton
public class ObjectStoreFactoryRegistry extends AbstractStoreFactoryRegistry<ObjectStoreFactory> {
    @Inject
    public ObjectStoreFactoryRegistry(final CostumeProperties properties,
            final PythonInterpreterFactory pythonInterpreterFactory) {
        super(properties, pythonInterpreterFactory);
        _registerPythonStoreFactories();
    }

    public final synchronized ObjectStoreFactory getObjectStoreFactory(final Uri uri) {
        return _getStoreFactory(uri);
    }

    public final synchronized void registerObjectStoreFactory(final ObjectStoreFactory factory,
            final String uriScheme) {
        _registerStoreFactory(factory, uriScheme);
    }
}
