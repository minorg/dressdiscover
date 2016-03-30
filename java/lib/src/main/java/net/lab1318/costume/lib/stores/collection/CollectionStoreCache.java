package net.lab1318.costume.lib.stores.collection;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.concurrent.ExecutionException;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.api.services.institution.NoSuchInstitutionException;
import net.lab1318.costume.lib.CostumeProperties;

@Singleton
public class CollectionStoreCache {
    @Inject
    public CollectionStoreCache(final FileSystemCollectionStore defaultCollectionStore,
            final CollectionStoreFactoryRegistry collectionStoreFactoryRegistry,
            final InstitutionQueryService institutionQueryService, final CostumeProperties properties) {
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
                    if (institution.getCollectionStoreUrl().isPresent()) {
                        final CollectionStoreFactory factory = collectionStoreFactoryRegistry
                                .getCollectionStoreFactory(institution.getCollectionStoreUrl().get());
                        CollectionStore collectionStore = factory.createCollectionStore(properties,
                                institution.getCollectionStoreUrl().get());
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
    private final CostumeProperties properties;
}
