package org.dressdiscover.lib.services.collection;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import org.dressdiscover.api.models.collection.Collection;
import org.dressdiscover.api.models.collection.CollectionEntry;
import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.lib.services.IoExceptions;
import org.dressdiscover.lib.services.collection.LoggingCollectionCommandService.Markers;
import org.dressdiscover.lib.stores.collection.CollectionStore;
import org.dressdiscover.lib.stores.collection.CollectionStoreCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.collection.CollectionCommandService;
import org.dressdiscover.api.services.collection.NoSuchCollectionException;
import org.dressdiscover.api.services.institution.NoSuchInstitutionException;
import org.dressdiscover.api.services.object.ObjectCommandService;

@Singleton
public class StoreCollectionCommandService implements CollectionCommandService {
    @Inject
    public StoreCollectionCommandService(final CollectionStoreCache collectionStoreCache,
            final ObjectCommandService objectCommandService) {
        this.collectionStoreCache = checkNotNull(collectionStoreCache);
        this.objectCommandService = checkNotNull(objectCommandService);
    }

    @Override
    public void deleteCollectionById(final CollectionId id)
            throws IoException, NoSuchCollectionException, NoSuchInstitutionException {
        try {
            if (!collectionStoreCache.getCollectionStore(id).deleteCollectionById(id, logger,
                    Markers.DELETE_COLLECTION_BY_ID)) {
                throw new NoSuchCollectionException();
            }
        } catch (final IOException e) {
            throw IoExceptions.wrap(e, "error deleting collection by id");
        }
    }

    @Override
    public void deleteCollectionsByInstitutionId(final InstitutionId institutionId)
            throws IoException, NoSuchInstitutionException {
        try {
            final CollectionStore collectionStore = collectionStoreCache.getCollectionStore(institutionId);

            for (final CollectionEntry collectionEntry : collectionStore.getCollectionsByInstitutionId(institutionId,
                    logger, Markers.DELETE_COLLECTIONS_BY_INSTITUTION_ID)) {
                try {
                    objectCommandService.deleteObjectsByCollectionId(collectionEntry.getId());
                } catch (final NoSuchCollectionException e) {
                    logger.warn(Markers.DELETE_COLLECTIONS_BY_INSTITUTION_ID, "no such collection {} when deleting?",
                            collectionEntry.getId());
                }
            }

            collectionStore.deleteCollectionsByInstitutionId(institutionId, logger,
                    Markers.DELETE_COLLECTIONS_BY_INSTITUTION_ID);
        } catch (final IOException e) {
            throw IoExceptions.wrap(e, "error deleting collections by institution ID");
        }
    }

    @Override
    public void putCollection(final CollectionId id, final Collection collection)
            throws IoException, NoSuchInstitutionException {
        try {
            collectionStoreCache.getCollectionStore(id).putCollection(collection, id, logger, Markers.PUT_COLLECTION);
        } catch (final IOException e) {
            throw IoExceptions.wrap(e, "error putting collection");
        }
    }

    private final CollectionStoreCache collectionStoreCache;
    private final ObjectCommandService objectCommandService;
    private final static Logger logger = LoggerFactory.getLogger(StoreCollectionCommandService.class);
}
