package org.dressdiscover.lib.stores.object;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.concurrent.ExecutionException;

import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.configuration.CollectionConfiguration;
import org.dressdiscover.api.models.object.ObjectId;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.collection.NoSuchCollectionException;
import org.dressdiscover.api.services.configuration.ConfigurationQueryService;
import org.dressdiscover.api.services.institution.NoSuchInstitutionException;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class ObjectStoreCache {
    @Inject
    public ObjectStoreCache(final ConfigurationQueryService configurationQueryService,
            final ObjectStoreFactoryRegistry objectStoreFactoryRegistry) {
        this.configurationQueryService = checkNotNull(configurationQueryService);
        this.objectStoreFactoryRegistry = checkNotNull(objectStoreFactoryRegistry);
    }

    public final ObjectStore getObjectStore(final CollectionId collectionId) throws IoException {
        try {
            return cache.get(collectionId);
        } catch (final ExecutionException e) {
            if (e.getCause() instanceof IoException) {
                throw (IoException) e.getCause();
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
                public ObjectStore load(final CollectionId key) throws IoException {
                    final CollectionConfiguration collectionConfiguration = configurationQueryService
                            .getCollectionConfiguration(key);
                    final ObjectStoreFactory factory = objectStoreFactoryRegistry
                            .getObjectStoreFactory(collectionConfiguration.getObjectStoreConfiguration().getType());
                    return factory.createObjectStore(collectionConfiguration.getObjectStoreConfiguration());
                }
            });

    private final ConfigurationQueryService configurationQueryService;
    private final ObjectStoreFactoryRegistry objectStoreFactoryRegistry;
}
