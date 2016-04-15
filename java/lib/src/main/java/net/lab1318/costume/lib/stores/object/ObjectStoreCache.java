package net.lab1318.costume.lib.stores.object;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.concurrent.ExecutionException;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.collection.NoSuchCollectionException;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.api.services.institution.NoSuchInstitutionException;
import net.lab1318.costume.lib.CostumeProperties;

@Singleton
public class ObjectStoreCache {
    @Inject
    public ObjectStoreCache(final CollectionQueryService collectionQueryService,
            final FileSystemObjectStore defaultObjectStore, final InstitutionQueryService institutionQueryService,
            final ObjectStoreFactoryRegistry objectStoreFactoryRegistry, final CostumeProperties properties) {
        this.collectionQueryService = checkNotNull(collectionQueryService);
        this.defaultObjectStore = checkNotNull(defaultObjectStore);
        this.institutionQueryService = checkNotNull(institutionQueryService);
        this.objectStoreFactoryRegistry = checkNotNull(objectStoreFactoryRegistry);
        this.properties = checkNotNull(properties);
    }

    public final ObjectStore getObjectStore(final CollectionId collectionId)
            throws IoException, NoSuchCollectionException, NoSuchInstitutionException {
        try {
            return cache.get(collectionId);
        } catch (final ExecutionException e) {
            if (e.getCause() instanceof IoException) {
                throw (IoException) e.getCause();
            } else if (e.getCause() instanceof NoSuchCollectionException) {
                throw (NoSuchCollectionException) e.getCause();
            } else if (e.getCause() instanceof NoSuchInstitutionException) {
                throw (NoSuchInstitutionException) e.getCause();
            } else {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public final ObjectStore getObjectStore(final ObjectId objectId)
            throws IoException, NoSuchCollectionException, NoSuchInstitutionException {
        return getObjectStore(objectId.getCollectionId());
    }

    private final LoadingCache<CollectionId, ObjectStore> cache = CacheBuilder.newBuilder()
            .build(new CacheLoader<CollectionId, ObjectStore>() {
                @Override
                public ObjectStore load(final CollectionId key)
                        throws IoException, NoSuchCollectionException, NoSuchInstitutionException {
                    final Collection collection = collectionQueryService.getCollectionById(key);
                    final Institution institution = institutionQueryService.getInstitutionById(key.getInstitutionId());
                    if (collection.getObjectStoreUri().isPresent()) {
                        final ObjectStoreFactory factory = objectStoreFactoryRegistry
                                .getObjectStoreFactory(collection.getObjectStoreUri().get());
                        return factory.createObjectStore(institution.getStoreParameters().or(ImmutableMap.of()),
                                properties, collection.getObjectStoreUri().get());
                    } else {
                        return defaultObjectStore;
                    }
                }
            });

    private final CollectionQueryService collectionQueryService;
    private final FileSystemObjectStore defaultObjectStore;
    private final InstitutionQueryService institutionQueryService;
    private final ObjectStoreFactoryRegistry objectStoreFactoryRegistry;
    private final CostumeProperties properties;
}
