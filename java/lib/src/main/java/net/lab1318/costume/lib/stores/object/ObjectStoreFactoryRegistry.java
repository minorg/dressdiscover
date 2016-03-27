package net.lab1318.costume.lib.stores.object;

import static com.google.common.base.Preconditions.checkState;

import java.util.HashMap;
import java.util.Map;

import org.python.util.PythonInterpreter;
import org.thryft.native_.Url;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.lib.CostumeProperties;

@Singleton
public class ObjectStoreFactoryRegistry {
    @Inject
    public ObjectStoreFactoryRegistry(final CostumeProperties properties) {
        pythonInterpreter.exec("import costume.lib.stores.object");
    }

    public synchronized ObjectStoreFactory getObjectStoreFactory(final Url url) {
        final String urlScheme = url.getScheme().toLowerCase();
        final ObjectStoreFactory result = registry.get(urlScheme);
        if (result != null) {
            return result;
        } else {
            throw new IllegalStateException("missing factory for URL scheme " + urlScheme);
        }
    }

    public synchronized void registerObjectStoreFactory(final ObjectStoreFactory factory, String urlScheme) {
        urlScheme = urlScheme.toLowerCase();
        checkState(registry.get(urlScheme) == null, urlScheme);
        registry.put(urlScheme, factory);
    }

    private final Map<String, ObjectStoreFactory> registry = new HashMap<>();
    private final PythonInterpreter pythonInterpreter = new PythonInterpreter();
}
