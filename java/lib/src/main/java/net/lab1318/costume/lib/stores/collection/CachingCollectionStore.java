package net.lab1318.costume.lib.stores.collection;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.Marker;
import org.thryft.waf.lib.stores.InvalidModelException;
import org.thryft.waf.lib.stores.NoSuchModelException;

import com.google.common.collect.ImmutableList;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.InstitutionId;

public class CachingCollectionStore implements CollectionStore {
    public CachingCollectionStore(final CollectionStore underlyingCollectionStore) {
        this.underlyingCollectionStore = checkNotNull(underlyingCollectionStore);
    }

    @Override
    public synchronized boolean deleteCollectionById(final CollectionId collectionId, final Logger logger,
            final Marker logMarker) throws IOException {
        __clear(logger, logMarker);
        return underlyingCollectionStore.deleteCollectionById(collectionId, logger, logMarker);
    }

    @Override
    public synchronized void deleteCollectionsByInstitutionId(final InstitutionId institutionId, final Logger logger,
            final Marker logMarker) throws IOException {
        __clear(logger, logMarker);
        underlyingCollectionStore.deleteCollectionsByInstitutionId(institutionId, logger, logMarker);
    }

    @Override
    public synchronized Collection getCollectionById(final CollectionId collectionId, final Logger logger,
            final Marker logMarker) throws InvalidModelException, IOException, NoSuchModelException {
        Collection result = collectionsById.get(collectionId);
        if (result != null) {
            return result;
        }
        result = underlyingCollectionStore.getCollectionById(collectionId, logger, logMarker);
        collectionsById.put(collectionId, result);
        return result;
    }

    @Override
    public synchronized ImmutableList<CollectionEntry> getCollectionsByInstitutionId(final InstitutionId institutionId,
            final Logger logger, final Marker logMarker) throws IOException {
        ImmutableList<CollectionEntry> result = collectionsByInstitutionId.get(institutionId);
        if (result != null) {
            return result;
        }
        result = underlyingCollectionStore.getCollectionsByInstitutionId(institutionId, logger, logMarker);
        collectionsByInstitutionId.put(institutionId, result);
        return result;
    }

    @Override
    public synchronized void putCollection(final Collection collection, final CollectionId collectionId,
            final Logger logger, final Marker logMarker) throws IOException {
        __clear(logger, logMarker);
        underlyingCollectionStore.putCollection(collection, collectionId, logger, logMarker);
    }

    private void __clear(final Logger logger, final Marker logMarker) {
        logger.debug(logMarker, "clearing collection cache");
        collectionsById.clear();
        collectionsByInstitutionId.clear();
    }

    private final Map<CollectionId, Collection> collectionsById = new HashMap<>();
    private final Map<InstitutionId, ImmutableList<CollectionEntry>> collectionsByInstitutionId = new HashMap<>();
    private final CollectionStore underlyingCollectionStore;
}
