package org.dressdiscover.lib.stores.collection;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.concurrent.ExecutionException;

import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.institution.Institution;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.lib.DressDiscoverProperties;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.institution.InstitutionQueryService;
import org.dressdiscover.api.services.institution.NoSuchInstitutionException;

@Singleton
public class CollectionStoreCache {
    @Inject
    public CollectionStoreCache(final FileSystemCollectionStore defaultCollectionStore,
            final CollectionStoreFactoryRegistry collectionStoreFactoryRegistry,
            final InstitutionQueryService institutionQueryService, final DressDiscoverProperties properties) {
        this.defaultCollectionStore = properties.getCacheCollections()
                ? new CachingCollectionStore(defaultCollectionStore) : defaultCollectionStore;
        this.collectionStoreFactoryRegistry = checkNotNull(collectionStoreFactoryRegistry);
        this.institutionQueryService = checkNotNull(institutionQueryService);
        this.properties = checkNotNull(properties);
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
                public CollectionStore load(final InstitutionId key) throws IoException, NoSuchInstitutionException {
                    final Institution institution = institutionQueryService.getInstitutionById(key);
                    if (institution.getCollectionStoreUri().isPresent()) {
                        final CollectionStoreFactory factory = collectionStoreFactoryRegistry
                                .getCollectionStoreFactory(institution.getCollectionStoreUri().get());
                        CollectionStore collectionStore = factory.createCollectionStore(
                                institution.getStoreParameters().or(ImmutableMap.of()), properties,
                                institution.getCollectionStoreUri().get());
                        if (properties.getCacheCollections()) {
                            collectionStore = new CachingCollectionStore(collectionStore);
                        }
                        return collectionStore;
                    } else {
                        return defaultCollectionStore;
                    }
                }
            });

    private final CollectionStore defaultCollectionStore;
    private final CollectionStoreFactoryRegistry collectionStoreFactoryRegistry;
    private final InstitutionQueryService institutionQueryService;
    private final DressDiscoverProperties properties;
}
