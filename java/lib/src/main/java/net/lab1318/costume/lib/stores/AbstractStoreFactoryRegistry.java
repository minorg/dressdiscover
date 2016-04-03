package net.lab1318.costume.lib.stores;

import static com.google.common.base.Preconditions.checkState;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.python.util.PythonInterpreter;
import org.thryft.native_.Uri;

import net.lab1318.costume.lib.CostumeProperties;

public abstract class AbstractStoreFactoryRegistry<StoreFactoryT extends StoreFactory> {
    protected AbstractStoreFactoryRegistry(final CostumeProperties properties) {
        final Properties pythonInterpreterProperties = new Properties();
        pythonInterpreterProperties.setProperty("python.path",
                new File(new File(new File(properties.getHomeDirectoryPath()), "py"), "src").toString());
        PythonInterpreter.initialize(System.getProperties(), pythonInterpreterProperties, new String[] { "" });
        pythonInterpreter = new PythonInterpreter();
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

    protected final void _registerPythonStoreFactories() {
        final String[] packageNameSplit = getClass().getPackage().getName().split("\\.");
        pythonInterpreter.exec("import costume.lib.stores." + packageNameSplit[packageNameSplit.length - 1]);
    }

    protected final synchronized void _registerStoreFactory(final StoreFactoryT factory, String uriScheme) {
        uriScheme = uriScheme.toLowerCase();
        checkState(registry.get(uriScheme) == null, uriScheme);
        registry.put(uriScheme, factory);
    }

    private final Map<String, StoreFactoryT> registry = new HashMap<>();
    private final PythonInterpreter pythonInterpreter;

}
