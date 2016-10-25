package org.dressdiscover.lib;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.lib.properties.GlobalProperties;
import org.dressdiscover.lib.python.PythonInterpreterFactory;
import org.dressdiscover.lib.stores.collection.CollectionStoreFactoryRegistry;
import org.dressdiscover.lib.stores.collection.FileSystemCollectionStoreFactory;
import org.dressdiscover.lib.stores.object.FileSystemObjectStoreFactory;
import org.dressdiscover.lib.stores.object.ObjectStoreFactoryRegistry;
import org.python.util.PythonInterpreter;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class Site {
    @Inject
    public Site(final CollectionStoreFactoryRegistry collectionStoreFactoryRegistry,
            final GlobalProperties globalProperties, final ObjectStoreFactoryRegistry objectStoreFactoryRegistry,
            final PythonInterpreterFactory pythonInterpreterFactory) {
        this.collectionStoreFactoryRegistry = checkNotNull(collectionStoreFactoryRegistry);
        this.globalProperties = checkNotNull(globalProperties);
        this.objectStoreFactoryRegistry = checkNotNull(objectStoreFactoryRegistry);
        this.pythonInterpreterFactory = checkNotNull(pythonInterpreterFactory);
    }

    public void init() {
        collectionStoreFactoryRegistry
                .registerCollectionStoreFactory(new FileSystemCollectionStoreFactory(globalProperties), "file");
        objectStoreFactoryRegistry.registerObjectStoreFactory(new FileSystemObjectStoreFactory(globalProperties),
                "file");

        final PythonInterpreter pythonInterpreter = pythonInterpreterFactory.createPythonInterpreter();
        pythonInterpreter.exec("import ddsite");
    }

    private final CollectionStoreFactoryRegistry collectionStoreFactoryRegistry;
    private final GlobalProperties globalProperties;
    private final ObjectStoreFactoryRegistry objectStoreFactoryRegistry;
    private final PythonInterpreterFactory pythonInterpreterFactory;
}
