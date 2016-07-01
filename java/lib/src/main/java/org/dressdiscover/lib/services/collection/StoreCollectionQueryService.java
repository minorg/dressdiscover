package org.dressdiscover.lib.services.collection;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import org.dressdiscover.api.models.collection.Collection;
import org.dressdiscover.api.models.collection.CollectionEntry;
import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.lib.services.IoExceptions;
import org.dressdiscover.lib.services.collection.LoggingCollectionQueryService.Markers;
import org.dressdiscover.lib.stores.collection.CollectionStoreCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thryft.waf.lib.stores.InvalidModelException;
import org.thryft.waf.lib.stores.NoSuchModelException;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.collection.NoSuchCollectionException;
import net.lab1318.costume.api.services.institution.NoSuchInstitutionException;

@Singleton
public class StoreCollectionQueryService implements CollectionQueryService {
    @Inject
    public StoreCollectionQueryService(final CollectionStoreCache collectionStoreCache) {
        this.collectionStoreCache = checkNotNull(collectionStoreCache);
    }

    @Override
    public Collection getCollectionById(final CollectionId id)
            throws IoException, NoSuchCollectionException, NoSuchInstitutionException {
        try {
            return collectionStoreCache.getCollectionStore(id).getCollectionById(id, logger,
                    Markers.GET_COLLECTION_BY_ID);
        } catch (final InvalidModelException e) {
            logger.warn(Markers.GET_COLLECTION_BY_ID, "invalid collection model {}: ", id, e);
            throw new NoSuchCollectionException();
        } catch (final IOException e) {
            throw IoExceptions.wrap(e, "error getting collection" + id);
        } catch (final NoSuchModelException e) {
            throw new NoSuchCollectionException();
        }
    }

    @Override
    public ImmutableList<Collection> getCollectionsByIds(final ImmutableList<CollectionId> ids)
            throws IoException, NoSuchCollectionException, NoSuchInstitutionException {
        if (ids.isEmpty()) {
            return ImmutableList.of();
        }
        final ImmutableList.Builder<Collection> collectionsBuilder = ImmutableList.builder();
        for (final CollectionId collectionId : ids) {
            try {
                collectionsBuilder.add(collectionStoreCache.getCollectionStore(collectionId)
                        .getCollectionById(collectionId, logger, Markers.GET_COLLECTIONS_BY_IDS));
            } catch (final IOException e) {
                throw IoExceptions.wrap(e, "error getting collections by ids");
            } catch (final InvalidModelException e) {
                logger.warn(Markers.GET_COLLECTIONS_BY_IDS, "invalid collection model {}: ", collectionId, e);
                throw new NoSuchCollectionException(collectionId);
            } catch (final NoSuchModelException e) {
                throw new NoSuchCollectionException();
            }
        }
        return collectionsBuilder.build();
    }

    @Override
    public ImmutableList<CollectionEntry> getCollectionsByInstitutionId(final InstitutionId institutionId)
            throws IoException, NoSuchInstitutionException {
        try {
            return collectionStoreCache.getCollectionStore(institutionId).getCollectionsByInstitutionId(institutionId,
                    logger, Markers.GET_COLLECTIONS_BY_INSTITUTION_ID);
        } catch (final IOException e) {
            throw IoExceptions.wrap(e, "error getting collections");
        }
    }

    private final CollectionStoreCache collectionStoreCache;
    private final static Logger logger = LoggerFactory.getLogger(StoreCollectionQueryService.class);
}