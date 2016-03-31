package net.lab1318.costume.lib.stores.collection;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.Marker;
import org.thryft.waf.lib.stores.InvalidModelException;
import org.thryft.waf.lib.stores.NoSuchModelException;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Multimap;

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
        __fill(logger, logMarker);
        final Collection result = collectionsById.get(collectionId);
        if (result != null) {
            return result;
        } else {
            throw new NoSuchModelException();
        }
    }

    @Override
    public synchronized ImmutableList<CollectionEntry> getCollections(final Logger logger, final Marker logMarker)
            throws IOException {
        __fill(logger, logMarker);
        return collections;
    }

    @Override
    public synchronized ImmutableList<CollectionEntry> getCollectionsByInstitutionId(final InstitutionId institutionId,
            final Logger logger, final Marker logMarker) throws IOException {
        __fill(logger, logMarker);
        final ImmutableList<CollectionEntry> result = collectionsByInstitutionId.get(institutionId);
        if (result != null) {
            return result;
        } else {
            return ImmutableList.of();
        }
    }

    @Override
    public synchronized void putCollection(final Collection collection, final CollectionId collectionId,
            final Logger logger, final Marker logMarker) throws IOException {
        __clear(logger, logMarker);
        underlyingCollectionStore.putCollection(collection, collectionId, logger, logMarker);
    }

    private void __clear(final Logger logger, final Marker logMarker) {
        logger.debug(logMarker, "clearing collection cache");
        collections = ImmutableList.of();
    }

    private void __fill(final Logger logger, final Marker logMarker) throws IOException {
        if (!collections.isEmpty()) {
            return;
        }

        logger.debug(logMarker, "filling collection cache");

        collections = underlyingCollectionStore.getCollections(logger, logMarker);

        {
            final ImmutableMap.Builder<CollectionId, Collection> collectionsByIdBuilder = ImmutableMap.builder();
            for (final CollectionEntry collectionEntry : collections) {
                collectionsByIdBuilder.put(collectionEntry.getId(), collectionEntry.getModel());
            }
            collectionsById = collectionsByIdBuilder.build();
        }

        {
            final Multimap<InstitutionId, CollectionEntry> collectionsByInstitutionIdMultimap = ArrayListMultimap
                    .create();
            for (final CollectionEntry collectionEntry : collections) {
                collectionsByInstitutionIdMultimap.put(collectionEntry.getModel().getInstitutionId(), collectionEntry);
            }
            final ImmutableMap.Builder<InstitutionId, ImmutableList<CollectionEntry>> collectionsByInstitutionIdBuilder = ImmutableMap
                    .builder();
            for (final Map.Entry<InstitutionId, java.util.Collection<CollectionEntry>> entry : collectionsByInstitutionIdMultimap
                    .asMap().entrySet()) {
                collectionsByInstitutionIdBuilder.put(entry.getKey(), ImmutableList.copyOf(entry.getValue()));
            }
            collectionsByInstitutionId = collectionsByInstitutionIdBuilder.build();
        }
    }

    private ImmutableList<CollectionEntry> collections = ImmutableList.of();
    private ImmutableMap<CollectionId, Collection> collectionsById = ImmutableMap.of();
    private ImmutableMap<InstitutionId, ImmutableList<CollectionEntry>> collectionsByInstitutionId = ImmutableMap.of();
    private final CollectionStore underlyingCollectionStore;
}
