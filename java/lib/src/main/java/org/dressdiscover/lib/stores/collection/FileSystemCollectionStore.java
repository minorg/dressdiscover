package org.dressdiscover.lib.stores.collection;

import java.io.File;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.dressdiscover.api.models.collection.Collection;
import org.dressdiscover.api.models.collection.CollectionEntry;
import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.collection.InvalidCollectionIdException;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.collection.NoSuchCollectionException;
import org.dressdiscover.lib.DressDiscoverProperties;
import org.dressdiscover.lib.stores.AbstractInstitutionCollectionObjectFileSystem;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.thryft.protocol.InputProtocol;
import org.thryft.protocol.InputProtocolException;
import org.thryft.waf.lib.stores.InvalidModelException;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class FileSystemCollectionStore
        extends AbstractInstitutionCollectionObjectFileSystem<Collection, NoSuchCollectionException>
        implements CollectionStore {
    @Inject
    public FileSystemCollectionStore(final DressDiscoverProperties properties) {
        super(properties);
    }

    @Override
    public final boolean deleteCollectionById(final CollectionId collectionId, final Logger logger,
            final Marker logMarker) throws IoException {
        return _deleteDirectory(_getCollectionDirectoryPath(collectionId), logger, logMarker) > 0;
    }

    // @Override
    // public final void deleteCollections(final Logger logger, final Marker
    // logMarker) throws IoException {
    // for (final File institutionDirectoryPath :
    // _getInstitutionDirectoryPaths(logger, logMarker)) {
    // _deleteDirectoryContents(true, institutionDirectoryPath, logger,
    // logMarker);
    // }
    // }

    @Override
    public final void deleteCollectionsByInstitutionId(final InstitutionId institutionId, final Logger logger,
            final Marker logMarker) throws IoException {
        for (final File collectionDirectoryPath : _getSubdirectoryPaths(_getInstitutionDirectoryPath(institutionId),
                logger, logMarker)) {
            _deleteDirectory(collectionDirectoryPath, logger, logMarker);
        }
    }

    @Override
    public final Collection getCollectionById(final CollectionId collectionId, final Logger logger,
            final Marker logMarker) throws InvalidModelException, IoException, NoSuchCollectionException {
        return _getModel(__getCollectionFilePath(collectionId), logger, logMarker);
    }

    // @Override
    // public final ImmutableList<CollectionEntry> getCollections(final Logger
    // logger, final Marker logMarker)
    // throws IoException {
    // final ImmutableList.Builder<CollectionEntry> resultBuilder =
    // ImmutableList.builder();
    // for (final File institutionDirectoryPath :
    // _getInstitutionDirectoryPaths(logger, logMarker)) {
    // __getCollectionsByInstitution(institutionDirectoryPath, logger,
    // logMarker, resultBuilder);
    // }
    // return resultBuilder.build();
    // }

    @Override
    public final ImmutableList<CollectionEntry> getCollectionsByInstitutionId(final InstitutionId institutionId,
            final Logger logger, final Marker logMarker) throws IoException {
        final ImmutableList.Builder<CollectionEntry> resultBuilder = ImmutableList.builder();
        __getCollectionsByInstitution(_getInstitutionDirectoryPath(institutionId), logger, logMarker, resultBuilder);
        return resultBuilder.build();
    }

    @Override
    public final void putCollection(final Collection collection, final CollectionId collectionId, final Logger logger,
            final Marker logMarker) throws IoException {
        _putModel(__getCollectionFilePath(collectionId), logger, logMarker, collection);
    }

    @Override
    protected NoSuchCollectionException _newNoSuchModelException() {
        return new NoSuchCollectionException();
    }

    @Override
    protected Collection _readModel(final InputProtocol iprot) throws InputProtocolException {
        return Collection.readAsStruct(iprot);
    }

    private File __getCollectionFilePath(final CollectionId collectionId) {
        return new File(_getCollectionDirectoryPath(collectionId), FILE_NAME);
    }

    private final void __getCollectionsByInstitution(final File institutionDirectoryPath, final Logger logger,
            final Marker logMarker, final ImmutableList.Builder<CollectionEntry> resultBuilder) throws IoException {
        final File[] collectionDirectoryPaths = institutionDirectoryPath.listFiles();
        if (collectionDirectoryPaths == null || collectionDirectoryPaths.length == 0) {
            logger.info(logMarker, "institution directory {} is empty or inaccessible", institutionDirectoryPath);
            return;
        }

        for (final File collectionDirectoryPath : collectionDirectoryPaths) {
            if (!collectionDirectoryPath.isDirectory()) {
                continue;
            }
            final File collectionFilePath = new File(collectionDirectoryPath, FILE_NAME);
            if (!collectionFilePath.isFile()) {
                logger.info(logMarker, "collection file {} does not exist", collectionFilePath);
                continue;
            }

            final Collection collection;
            try {
                collection = _getModel(collectionFilePath, logger, logMarker);
            } catch (InvalidModelException | NoSuchCollectionException e) {
                logger.warn(logMarker, "error reading collection file {}: {}", collectionFilePath,
                        ExceptionUtils.getRootCauseMessage(e));
                continue;
            }

            final CollectionId collectionId;
            try {
                collectionId = CollectionId.parse(_decodeFileName(institutionDirectoryPath.getName()) + '/'
                        + _decodeFileName(collectionDirectoryPath.getName()));
            } catch (final InvalidCollectionIdException e) {
                throw new IllegalStateException(e);
            }

            resultBuilder.add(CollectionEntry.create(collectionId, collection));
        }
    }

    final static String FILE_NAME = ".collection.json";
}
