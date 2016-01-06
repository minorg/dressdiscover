package net.lab1318.costume.lib.services.collection;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thryft.waf.lib.stores.InvalidModelException;
import org.thryft.waf.lib.stores.NoSuchModelException;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.collection.NoSuchCollectionException;
import net.lab1318.costume.lib.services.ServiceExceptionHelper;
import net.lab1318.costume.lib.services.collection.LoggingCollectionQueryService.Markers;
import net.lab1318.costume.lib.stores.collection.CollectionFileSystem;

@Singleton
public class FsCollectionQueryService implements CollectionQueryService {
    @Inject
    public FsCollectionQueryService(final CollectionFileSystem fileSystem) {
        this.fileSystem = checkNotNull(fileSystem);
    }

    @Override
    public Collection getCollectionById(final CollectionId id) throws IoException, NoSuchCollectionException {
        try {
            return fileSystem.getCollectionById(id, logger, Markers.GET_COLLECTION_BY_ID);
        } catch (final InvalidModelException e) {
            logger.warn(Markers.GET_COLLECTION_BY_ID, "invalid collection model {}: ", id, e);
            throw new NoSuchCollectionException();
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting collection" + id);
        } catch (final NoSuchModelException e) {
            throw new NoSuchCollectionException();
        }
    }

    @Override
    public ImmutableList<CollectionEntry> getCollections() throws IoException {
        try {
            return fileSystem.getCollections(logger, Markers.GET_COLLECTIONS);
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting collections");
        }
    }

    @Override
    public ImmutableList<Collection> getCollectionsByIds(final ImmutableList<CollectionId> ids)
            throws IoException, NoSuchCollectionException {
        if (ids.isEmpty()) {
            return ImmutableList.of();
        }
        final ImmutableList.Builder<Collection> collectionsBuilder = ImmutableList.builder();
        for (final CollectionId collectionId : ids) {
            try {
                collectionsBuilder
                        .add(fileSystem.getCollectionById(collectionId, logger, Markers.GET_COLLECTIONS_BY_IDS));
            } catch (final IOException e) {
                throw ServiceExceptionHelper.wrapException(e, "error getting collections by ids");
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
            throws IoException {
        try {
            return fileSystem.getCollectionsByInstitutionId(institutionId, logger,
                    Markers.GET_COLLECTIONS_BY_INSTITUTION_ID);
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting collections");
        }
    }

    private final CollectionFileSystem fileSystem;
    private final static Logger logger = LoggerFactory.getLogger(FsCollectionQueryService.class);
}
