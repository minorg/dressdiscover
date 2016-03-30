package net.lab1318.costume.lib.stores.collection;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.Marker;
import org.thryft.protocol.InputProtocol;
import org.thryft.protocol.InputProtocolException;
import org.thryft.waf.lib.stores.InvalidModelException;
import org.thryft.waf.lib.stores.NoSuchModelException;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.collection.InvalidCollectionIdException;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.lib.CostumeProperties;
import net.lab1318.costume.lib.stores.AbstractInstitutionCollectionObjectFileSystem;
import net.logstash.logback.encoder.org.apache.commons.lang.exception.ExceptionUtils;

@Singleton
public class CollectionFileSystem extends AbstractInstitutionCollectionObjectFileSystem<Collection>
        implements CollectionStore {
    @Inject
    public CollectionFileSystem(final CostumeProperties properties) {
        super(properties);
    }

    @Override
    public final boolean deleteCollectionById(final CollectionId collectionId, final Logger logger,
            final Marker logMarker) throws IOException {
        return _deleteDirectory(_getCollectionDirectoryPath(collectionId), logger, logMarker) > 0;
    }

    // @Override
    // public final void deleteCollections(final Logger logger, final Marker
    // logMarker) throws IOException {
    // for (final File institutionDirectoryPath :
    // _getInstitutionDirectoryPaths(logger, logMarker)) {
    // _deleteDirectoryContents(true, institutionDirectoryPath, logger,
    // logMarker);
    // }
    // }

    @Override
    public final void deleteCollectionsByInstitutionId(final InstitutionId institutionId, final Logger logger,
            final Marker logMarker) throws IOException {
        for (final File collectionDirectoryPath : _getSubdirectoryPaths(_getInstitutionDirectoryPath(institutionId),
                logger, logMarker)) {
            _deleteDirectory(collectionDirectoryPath, logger, logMarker);
        }
    }

    @Override
    public final Collection getCollectionById(final CollectionId collectionId, final Logger logger,
            final Marker logMarker) throws InvalidModelException, IOException, NoSuchModelException {
        return _getModel(__getCollectionFilePath(collectionId), logger, logMarker);
    }

    @Override
    public final ImmutableList<CollectionEntry> getCollections(final Logger logger, final Marker logMarker)
            throws IOException {
        final ImmutableList.Builder<CollectionEntry> resultBuilder = ImmutableList.builder();
        for (final File institutionDirectoryPath : _getInstitutionDirectoryPaths(logger, logMarker)) {
            __getCollectionsByInstitution(institutionDirectoryPath, logger, logMarker, resultBuilder);
        }
        return resultBuilder.build();
    }

    @Override
    public final ImmutableList<CollectionEntry> getCollectionsByInstitutionId(final InstitutionId institutionId,
            final Logger logger, final Marker logMarker) throws IOException {
        final ImmutableList.Builder<CollectionEntry> resultBuilder = ImmutableList.builder();
        __getCollectionsByInstitution(_getInstitutionDirectoryPath(institutionId), logger, logMarker, resultBuilder);
        return resultBuilder.build();
    }

    @Override
    public final void putCollection(final Collection collection, final CollectionId collectionId, final Logger logger,
            final Marker logMarker) throws IOException {
        _putModel(__getCollectionFilePath(collectionId), logger, logMarker, collection);
    }

    @Override
    protected Collection _readModel(final InputProtocol iprot) throws InputProtocolException {
        return Collection.readAsStruct(iprot);
    }

    private File __getCollectionFilePath(final CollectionId collectionId) {
        return new File(_getCollectionDirectoryPath(collectionId), FILE_NAME);
    }

    private final void __getCollectionsByInstitution(final File institutionDirectoryPath, final Logger logger,
            final Marker logMarker, final ImmutableList.Builder<CollectionEntry> resultBuilder) throws IOException {
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
            } catch (InvalidModelException | NoSuchModelException e) {
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

            resultBuilder.add(new CollectionEntry(collectionId, collection));
        }
    }

    final static String FILE_NAME = ".collection.json";
}
