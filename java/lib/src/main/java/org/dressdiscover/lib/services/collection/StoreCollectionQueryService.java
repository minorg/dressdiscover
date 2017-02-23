package org.dressdiscover.lib.services.collection;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.api.models.collection.Collection;
import org.dressdiscover.api.models.collection.CollectionEntry;
import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.collection.CollectionQueryService;
import org.dressdiscover.api.services.collection.NoSuchCollectionException;
import org.dressdiscover.api.services.institution.NoSuchInstitutionException;
import org.dressdiscover.lib.python.PythonUtils;
import org.dressdiscover.lib.services.collection.LoggingCollectionQueryService.Markers;
import org.dressdiscover.lib.stores.collection.CollectionStore;
import org.dressdiscover.lib.stores.collection.CollectionStoreCache;
import org.python.core.PyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thryft.waf.lib.stores.InvalidModelException;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
class StoreCollectionQueryService implements CollectionQueryService {
    @Inject
    public StoreCollectionQueryService(final CollectionStoreCache collectionStoreCache) {
        this.collectionStoreCache = checkNotNull(collectionStoreCache);
    }

    @Override
    public final Collection getCollectionById(final CollectionId id)
            throws IoException, NoSuchCollectionException, NoSuchInstitutionException {
        final CollectionStore collectionStore = collectionStoreCache.getCollectionStore(id);
        try {
            return collectionStore.getCollectionById(id, Markers.GET_COLLECTION_BY_ID);
        } catch (final InvalidModelException e) {
            logger.warn(Markers.GET_COLLECTION_BY_ID, "invalid collection model {}: ", id, e);
            throw NoSuchCollectionException.create(id);
        } catch (final PyException e) {
            PythonUtils.log(logger, Markers.GET_COLLECTION_BY_ID, e);
            throw NoSuchCollectionException.create(id);
        }
    }

    @Override
    public final ImmutableList<Collection> getCollectionsByIds(final ImmutableList<CollectionId> ids)
            throws IoException, NoSuchCollectionException, NoSuchInstitutionException {
        if (ids.isEmpty()) {
            return ImmutableList.of();
        }
        final ImmutableList.Builder<Collection> collectionsBuilder = ImmutableList.builder();
        for (final CollectionId collectionId : ids) {
            final CollectionStore collectionStore = collectionStoreCache.getCollectionStore(collectionId);
            try {
                collectionsBuilder.add(collectionStore.getCollectionById(collectionId, Markers.GET_COLLECTIONS_BY_IDS));
            } catch (final InvalidModelException e) {
                logger.warn(Markers.GET_COLLECTIONS_BY_IDS, "invalid collection model {}: ", collectionId, e);
                throw NoSuchCollectionException.create(collectionId);
            } catch (final PyException e) {
                PythonUtils.log(logger, Markers.GET_COLLECTIONS_BY_IDS, e);
                throw NoSuchCollectionException.create(collectionId);
            }
        }
        return collectionsBuilder.build();
    }

    @Override
    public final ImmutableList<CollectionEntry> getCollectionsByInstitutionId(final InstitutionId institutionId)
            throws IoException, NoSuchInstitutionException {
        final CollectionStore collectionStore = collectionStoreCache.getCollectionStore(institutionId);
        try {
            return collectionStore.getCollectionsByInstitutionId(institutionId,
                    Markers.GET_COLLECTIONS_BY_INSTITUTION_ID);
        } catch (final PyException e) {
            PythonUtils.log(logger, Markers.GET_COLLECTIONS_BY_INSTITUTION_ID, e);
            return ImmutableList.of();
        }
    }

    private final CollectionStoreCache collectionStoreCache;
    private final static Logger logger = LoggerFactory.getLogger(StoreCollectionQueryService.class);
}
