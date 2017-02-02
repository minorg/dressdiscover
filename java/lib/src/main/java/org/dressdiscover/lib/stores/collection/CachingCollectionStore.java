package org.dressdiscover.lib.stores.collection;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.HashMap;
import java.util.Map;

import org.dressdiscover.api.models.collection.Collection;
import org.dressdiscover.api.models.collection.CollectionEntry;
import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.collection.NoSuchCollectionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.thryft.waf.lib.stores.InvalidModelException;

import com.google.common.collect.ImmutableList;

public class CachingCollectionStore implements CollectionStore {
    public CachingCollectionStore(final CollectionStore underlyingCollectionStore) {
        this.underlyingCollectionStore = checkNotNull(underlyingCollectionStore);
    }

    @Override
    public synchronized boolean deleteCollectionById(final CollectionId collectionId, final Marker logMarker)
            throws IoException {
        __clear(logMarker);
        return underlyingCollectionStore.deleteCollectionById(collectionId, logMarker);
    }

    @Override
    public synchronized void deleteCollectionsByInstitutionId(final InstitutionId institutionId, final Marker logMarker)
            throws IoException {
        __clear(logMarker);
        underlyingCollectionStore.deleteCollectionsByInstitutionId(institutionId, logMarker);
    }

    @Override
    public synchronized Collection getCollectionById(final CollectionId collectionId, final Marker logMarker)
            throws InvalidModelException, IoException, NoSuchCollectionException {
        Collection result = collectionsById.get(collectionId);
        if (result != null) {
            return result;
        }
        result = underlyingCollectionStore.getCollectionById(collectionId, logMarker);
        collectionsById.put(collectionId, result);
        return result;
    }

    @Override
    public synchronized ImmutableList<CollectionEntry> getCollectionsByInstitutionId(final InstitutionId institutionId,
            final Marker logMarker) throws IoException {
        ImmutableList<CollectionEntry> result = collectionsByInstitutionId.get(institutionId);
        if (result != null) {
            return result;
        }
        result = underlyingCollectionStore.getCollectionsByInstitutionId(institutionId, logMarker);
        collectionsByInstitutionId.put(institutionId, result);
        return result;
    }

    @Override
    public synchronized void putCollection(final Collection collection, final CollectionId collectionId,
            final Marker logMarker) throws IoException {
        __clear(logMarker);
        underlyingCollectionStore.putCollection(collection, collectionId, logMarker);
    }

    private void __clear(final Marker logMarker) {
        logger.debug(logMarker, "clearing collection cache");
        collectionsById.clear();
        collectionsByInstitutionId.clear();
    }

    private final Map<CollectionId, Collection> collectionsById = new HashMap<>();
    private final Map<InstitutionId, ImmutableList<CollectionEntry>> collectionsByInstitutionId = new HashMap<>();
    private final CollectionStore underlyingCollectionStore;
    private final static Logger logger = LoggerFactory.getLogger(CachingCollectionStore.class);
}
