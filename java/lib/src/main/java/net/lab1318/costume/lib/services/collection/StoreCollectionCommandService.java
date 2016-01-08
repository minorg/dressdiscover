package net.lab1318.costume.lib.services.collection;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.collection.CollectionCommandService;
import net.lab1318.costume.api.services.collection.NoSuchCollectionException;
import net.lab1318.costume.api.services.object.ObjectCommandService;
import net.lab1318.costume.lib.services.ServiceExceptionHelper;
import net.lab1318.costume.lib.services.collection.LoggingCollectionCommandService.Markers;
import net.lab1318.costume.lib.stores.collection.CollectionStore;

abstract class StoreCollectionCommandService implements CollectionCommandService {
    protected StoreCollectionCommandService(final ObjectCommandService objectCommandService,
            final CollectionStore store) {
        this.objectCommandService = checkNotNull(objectCommandService);
        this.store = checkNotNull(store);
    }

    @Override
    public void deleteCollectionById(final CollectionId id) throws IoException, NoSuchCollectionException {
        try {
            if (!store.deleteCollectionById(id, logger, Markers.DELETE_COLLECTION_BY_ID)) {
                throw new NoSuchCollectionException();
            }
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error deleting collection by id");
        }
    }

    @Override
    public void deleteCollections() throws IoException {
        try {
            store.deleteCollections(logger, Markers.DELETE_COLLECTIONS);
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error deleting collections");
        }

        objectCommandService.deleteObjects();
    }

    @Override
    public void deleteCollectionsByInstitutionId(final InstitutionId institutionId) throws IoException {
        try {
            store.deleteCollectionsByInstitutionId(institutionId, logger, Markers.DELETE_COLLECTION_BY_ID);
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error deleting collections by institution ID");
        }

        objectCommandService.deleteObjectsByInstitutionId(institutionId);
    }

    @Override
    public void putCollection(final CollectionId id, final Collection collection) throws IoException {
        try {
            store.putCollection(collection, id, logger, Markers.PUT_COLLECTION);
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error putting collection");
        }
    }

    private final ObjectCommandService objectCommandService;
    private final CollectionStore store;
    private final static Logger logger = LoggerFactory.getLogger(StoreCollectionCommandService.class);
}
