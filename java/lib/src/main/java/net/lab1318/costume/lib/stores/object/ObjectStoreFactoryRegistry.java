package net.lab1318.costume.lib.stores.object;

import static com.google.common.base.Preconditions.checkNotNull;

import org.thryft.native_.Url;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.lib.CostumeProperties;
import net.lab1318.costume.lib.stores.AbstractStoreFactoryRegistry;

@Singleton
public class ObjectStoreFactoryRegistry extends AbstractStoreFactoryRegistry<ObjectStoreFactory> {
    public static ObjectStoreFactoryRegistry getInstance() {
        return checkNotNull(instance);
    }

    @Inject
    public ObjectStoreFactoryRegistry(final CostumeProperties properties) {
        super(properties);
        instance = this;
        _registerPythonStoreFactories();
    }

    public final synchronized ObjectStoreFactory getObjectStoreFactory(final Url url) {
        return _getStoreFactory(url);
    }

    public final synchronized void registerObjectStoreFactory(final ObjectStoreFactory factory,
            final String urlScheme) {
        _registerStoreFactory(factory, urlScheme);
    }

    private static ObjectStoreFactoryRegistry instance = null;
}
