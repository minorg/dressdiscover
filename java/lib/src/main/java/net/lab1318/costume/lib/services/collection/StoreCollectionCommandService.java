package net.lab1318.costume.lib.services.collection;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.collection.CollectionCommandService;
import net.lab1318.costume.api.services.collection.NoSuchCollectionException;
import net.lab1318.costume.api.services.institution.NoSuchInstitutionException;
import net.lab1318.costume.api.services.object.ObjectCommandService;
import net.lab1318.costume.lib.services.IoExceptions;
import net.lab1318.costume.lib.services.collection.LoggingCollectionCommandService.Markers;
import net.lab1318.costume.lib.stores.collection.CollectionStore;
import net.lab1318.costume.lib.stores.collection.CollectionStoreCache;

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
