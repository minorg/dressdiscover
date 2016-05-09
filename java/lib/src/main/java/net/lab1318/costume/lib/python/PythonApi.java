package net.lab1318.costume.lib.python;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.services.collection.CollectionCommandService;
import net.lab1318.costume.api.services.institution.InstitutionCommandService;
import net.lab1318.costume.lib.stores.collection.CollectionStoreFactoryRegistry;
import net.lab1318.costume.lib.stores.object.ObjectStoreFactoryRegistry;

@Singleton
public class PythonApi {
    public static PythonApi getInstance() {
        return instance;
    }

    @Inject
    public PythonApi(final CollectionCommandService collectionCommandService,
            final CollectionStoreFactoryRegistry collectionStoreFactoryRegistry,
            final InstitutionCommandService institutionCommandService,
            final ObjectStoreFactoryRegistry objectStoreFactoryRegistry) {
        checkState(instance == null);
        instance = this;
        this.collectionCommandService = checkNotNull(collectionCommandService);
        this.collectionStoreFactoryRegistry = checkNotNull(collectionStoreFactoryRegistry);
        this.institutionCommandService = checkNotNull(institutionCommandService);
        this.objectStoreFactoryRegistry = checkNotNull(objectStoreFactoryRegistry);
    }

    public CollectionCommandService getCollectionCommandService() {
        return collectionCommandService;
    }

    public final CollectionStoreFactoryRegistry getCollectionStoreFactoryRegistry() {
        return collectionStoreFactoryRegistry;
    }

    public final InstitutionCommandService getInstitutionCommandService() {
        return institutionCommandService;
    }

    public final ObjectStoreFactoryRegistry getObjectStoreFactoryRegistry() {
        return objectStoreFactoryRegistry;
    }

    private final CollectionCommandService collectionCommandService;
    private final CollectionStoreFactoryRegistry collectionStoreFactoryRegistry;
    private final InstitutionCommandService institutionCommandService;
    private final ObjectStoreFactoryRegistry objectStoreFactoryRegistry;
    private static PythonApi instance = null;
}
