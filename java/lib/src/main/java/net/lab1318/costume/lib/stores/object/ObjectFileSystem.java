package net.lab1318.costume.lib.stores.object;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.thryft.protocol.InputProtocol;
import org.thryft.protocol.InputProtocolException;
import org.thryft.waf.lib.stores.InvalidModelException;
import org.thryft.waf.lib.stores.NoSuchModelException;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.object.InvalidObjectIdException;
import net.lab1318.costume.api.models.object.Object;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.lib.CostumeProperties;
import net.lab1318.costume.lib.stores.AbstractInstitutionCollectionObjectFileSystem;

@Singleton
public class ObjectFileSystem extends AbstractInstitutionCollectionObjectFileSystem<Object> implements ObjectStore {
    @Inject
    public ObjectFileSystem(final CostumeProperties properties) {
        super(properties);
    }

    @Override
    public final long deleteObjects(final Logger logger, final Marker logMarker) throws IOException {
        long count = 0;
        for (final File institutionDirectoryPath : _getInstitutionDirectoryPaths(logger, logMarker)) {
            for (final File collectionDirectoryPath : _getSubdirectoryPaths(institutionDirectoryPath, logger,
                    logMarker)) {
                count += _deleteDirectoryContents(false, collectionDirectoryPath, logger, logMarker);
            }
        }
        return count;
    }

    @Override
    public final long deleteObjectsByCollectionId(final CollectionId collectionId, final Logger logger,
            final Marker logMarker) throws IOException {
        return _deleteDirectoryContents(false, _getCollectionDirectoryPath(collectionId), logger, logMarker);
    }

    @Override
    public final long deleteObjectsByInstitutionId(final InstitutionId institutionId, final Logger logger,
            final Marker logMarker) throws IOException {
        long count = 0;
        final File institutionDirectoryPath = _getInstitutionDirectoryPath(institutionId);
        for (final File collectionDirectoryPath : _getSubdirectoryPaths(institutionDirectoryPath, logger, logMarker)) {
            count += _deleteDirectoryContents(false, collectionDirectoryPath, logger, logMarker);
        }
        return count;
    }

    @Override
    public final Object getObjectById(final Logger logger, final Marker logMarker, final ObjectId objectId)
            throws InvalidModelException, IOException, NoSuchModelException {
        return _getModel(__getObjectFilePath(objectId), logger, logMarker);
    }

    @Override
    public final Iterable<ObjectEntry> getObjects(final Logger logger, final Marker logMarker) {
        return new Iterable<ObjectEntry>() {
            @Override
            public Iterator<ObjectEntry> iterator() {
                return new Iterator<ObjectEntry>() {
                    @Override
                    public boolean hasNext() {
                        return fileIterator.hasNext();
                    }

                    @Override
                    public ObjectEntry next() {
                        final File objectFilePath = fileIterator.next();
                        final File collectionDirectoryPath = objectFilePath.getParentFile();
                        final File institutionDirectoryPath = collectionDirectoryPath.getParentFile();
                        final ObjectId objectId;
                        try {
                            objectId = ObjectId.parse(_decodeFileName(institutionDirectoryPath.getName()) + '/'
                                    + _decodeFileName(collectionDirectoryPath.getName()) + '/'
                                    + _decodeFileName(FilenameUtils.getBaseName(objectFilePath.getName())));
                        } catch (final InvalidObjectIdException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            return new ObjectEntry(objectId, _getModel(objectFilePath, logger, logMarker));
                        } catch (InvalidModelException | IOException | NoSuchModelException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    private final Iterator<File> fileIterator = FileUtils.iterateFiles(_getInstitutionsDirectoryPath(),
                            new IOFileFilter() {
                                @Override
                                public boolean accept(final File file) {
                                    return file.getName().charAt(0) != '.' && file.getName().endsWith(".json");
                                }

                                @Override
                                public boolean accept(final File dir, final String name) {
                                    return name.charAt(0) != '.' && name.endsWith(".json");
                                }
                            }, TrueFileFilter.INSTANCE);
                };
            }
        };
    }

    @Override
    public final void putObject(final Logger logger, final Marker logMarker, final Object object,
            final ObjectId objectId) throws IOException {
        _putModel(__getObjectFilePath(objectId), logger, logMarker, object);
    }

    @Override
    protected final Object _readModel(final InputProtocol iprot) throws InputProtocolException {
        return Object.readAsStruct(iprot);
    }

    private File __getObjectFilePath(final ObjectId objectId) {
        return new File(_getCollectionDirectoryPath(objectId.getCollectionId()),
                _encodeFileName(objectId.getUnqualifiedObjectId()) + ".json");
    }
}
