package org.dressdiscover.lib;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.lib.properties.GlobalProperties;
import org.dressdiscover.lib.python.PythonInterpreterFactory;
import org.dressdiscover.lib.python.PythonUtils;
import org.dressdiscover.lib.stores.collection.CollectionStoreFactoryRegistry;
import org.dressdiscover.lib.stores.collection.FileSystemCollectionStoreFactory;
import org.dressdiscover.lib.stores.object.FileSystemObjectStoreFactory;
import org.dressdiscover.lib.stores.object.ObjectStoreFactoryRegistry;
import org.python.core.PyException;
import org.python.util.PythonInterpreter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.thryft.waf.lib.logging.LoggingUtils;

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
        registerStoreFactories();

        try {
            final PythonInterpreter pythonInterpreter = pythonInterpreterFactory.createPythonInterpreter();
            pythonInterpreter.exec("import ddsite");
        } catch (final PyException e) {
            PythonUtils.log(logger, logMarker, e);
        }
    }

    public void registerStoreFactories() {
        collectionStoreFactoryRegistry
                .registerCollectionStoreFactory(new FileSystemCollectionStoreFactory(globalProperties), "file");
        objectStoreFactoryRegistry.registerObjectStoreFactory(new FileSystemObjectStoreFactory(globalProperties),
                "file");
    }

    private final CollectionStoreFactoryRegistry collectionStoreFactoryRegistry;
    private final GlobalProperties globalProperties;
    private final ObjectStoreFactoryRegistry objectStoreFactoryRegistry;
    private final PythonInterpreterFactory pythonInterpreterFactory;

    private final static Logger logger = LoggerFactory.getLogger(Site.class);
    private final static Marker logMarker = LoggingUtils.getMarker(Site.class);
}
