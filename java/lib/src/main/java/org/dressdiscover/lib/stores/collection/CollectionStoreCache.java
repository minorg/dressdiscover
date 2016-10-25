package org.dressdiscover.lib.stores.collection;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.concurrent.ExecutionException;

import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.configuration.InstitutionConfiguration;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.configuration.ConfigurationQueryService;
import org.dressdiscover.api.services.institution.NoSuchInstitutionException;
import org.dressdiscover.lib.properties.StoreProperties;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class CollectionStoreCache {
    @Inject
    public CollectionStoreCache(final CollectionStoreFactoryRegistry collectionStoreFactoryRegistry,
            final ConfigurationQueryService configurationQueryService, final StoreProperties storeProperties) {
        this.collectionStoreFactoryRegistry = checkNotNull(collectionStoreFactoryRegistry);
        this.configurationQueryService = checkNotNull(configurationQueryService);
        this.storeProperties = checkNotNull(storeProperties);
    }

    public final CollectionStore getCollectionStore(final CollectionId collectionId)
            throws IoException, NoSuchInstitutionException {
        return getCollectionStore(collectionId.getInstitutionId());
    }

    public final CollectionStore getCollectionStore(final InstitutionId institutionId)
            throws IoException, NoSuchInstitutionException {
        try {
            return cache.get(institutionId);
        } catch (final ExecutionException e) {
            if (e.getCause() instanceof IoException) {
                throw (IoException) e.getCause();
            } else if (e.getCause() instanceof NoSuchInstitutionException) {
                throw (NoSuchInstitutionException) e.getCause();
            } else {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    private final LoadingCache<InstitutionId, CollectionStore> cache = CacheBuilder.newBuilder()
            .build(new CacheLoader<InstitutionId, CollectionStore>() {
                @Override
                public CollectionStore load(final InstitutionId key) throws IoException {
                    final InstitutionConfiguration institutionConfiguration = configurationQueryService
                            .getInstitutionConfiguration(key);
                    final CollectionStoreFactory factory = collectionStoreFactoryRegistry.getCollectionStoreFactory(
                            institutionConfiguration.getCollectionStoreConfiguration().getType());
                    CollectionStore collectionStore = factory
                            .createCollectionStore(institutionConfiguration.getCollectionStoreConfiguration());
                    if (storeProperties.getCacheCollections()) {
                        collectionStore = new CachingCollectionStore(collectionStore);
                    }
                    return collectionStore;
                }
            });

    private final CollectionStoreFactoryRegistry collectionStoreFactoryRegistry;
    private final ConfigurationQueryService configurationQueryService;
    private final StoreProperties storeProperties;
}
