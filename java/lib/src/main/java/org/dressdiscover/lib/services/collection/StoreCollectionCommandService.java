package org.dressdiscover.lib.services.collection;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.api.models.collection.Collection;
import org.dressdiscover.api.models.collection.CollectionEntry;
import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.collection.CollectionCommandService;
import org.dressdiscover.api.services.collection.NoSuchCollectionException;
import org.dressdiscover.api.services.institution.NoSuchInstitutionException;
import org.dressdiscover.api.services.object.ObjectCommandService;
import org.dressdiscover.lib.python.PythonUtils;
import org.dressdiscover.lib.services.collection.LoggingCollectionCommandService.Markers;
import org.dressdiscover.lib.stores.collection.CollectionStore;
import org.dressdiscover.lib.stores.collection.CollectionStoreCache;
import org.python.core.PyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Singleton;

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
        final CollectionStore collectionStore = collectionStoreCache.getCollectionStore(id);
        try {
            if (!collectionStore.deleteCollectionById(id, logger, Markers.DELETE_COLLECTION_BY_ID)) {
                throw NoSuchCollectionException.create(id);
            }
        } catch (final PyException e) {
            PythonUtils.log(logger, Markers.DELETE_COLLECTION_BY_ID, e);
            throw IoException.create("Python exception");
        }
    }

    @Override
    public void deleteCollectionsByInstitutionId(final InstitutionId institutionId)
            throws IoException, NoSuchInstitutionException {
        final CollectionStore collectionStore = collectionStoreCache.getCollectionStore(institutionId);

        ImmutableList<CollectionEntry> collectionEntries;
        try {
            collectionEntries = collectionStore.getCollectionsByInstitutionId(institutionId, logger,
                    Markers.DELETE_COLLECTIONS_BY_INSTITUTION_ID);
        } catch (final PyException e) {
            PythonUtils.log(logger, Markers.DELETE_COLLECTIONS_BY_INSTITUTION_ID, e);
            throw IoException.create("Python exception");
        }

        for (final CollectionEntry collectionEntry : collectionEntries) {
            try {
                objectCommandService.deleteObjectsByCollectionId(collectionEntry.getId());
            } catch (final NoSuchCollectionException e) {
                logger.warn(Markers.DELETE_COLLECTIONS_BY_INSTITUTION_ID, "no such collection {} when deleting?",
                        collectionEntry.getId());
            }
        }

        try {
            collectionStore.deleteCollectionsByInstitutionId(institutionId, logger,
                    Markers.DELETE_COLLECTIONS_BY_INSTITUTION_ID);
        } catch (final PyException e) {
            PythonUtils.log(logger, Markers.DELETE_COLLECTIONS_BY_INSTITUTION_ID, e);
            throw IoException.create("Python exception");
        }
    }

    @Override
    public void putCollection(final Collection collection, final CollectionId id)
            throws IoException, NoSuchInstitutionException {
        final CollectionStore collectionStore = collectionStoreCache.getCollectionStore(id);
        try {
            collectionStore.putCollection(collection, id, logger, Markers.PUT_COLLECTION);
        } catch (final PyException e) {
            PythonUtils.log(logger, Markers.PUT_COLLECTION, e);
            throw IoException.create("Python exception");
        }
    }

    private final CollectionStoreCache collectionStoreCache;
    private final ObjectCommandService objectCommandService;
    private final static Logger logger = LoggerFactory.getLogger(StoreCollectionCommandService.class);
}
