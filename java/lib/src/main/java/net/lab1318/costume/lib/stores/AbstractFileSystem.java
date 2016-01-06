package net.lab1318.costume.lib.stores;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.thryft.protocol.InputProtocol;
import org.thryft.protocol.InputProtocolException;
import org.thryft.protocol.JacksonJsonInputProtocol;
import org.thryft.protocol.JacksonJsonOutputProtocol;
import org.thryft.protocol.OutputProtocol;
import org.thryft.protocol.OutputProtocolException;
import org.thryft.waf.api.models.Model;
import org.thryft.waf.lib.stores.FileNameCodec;
import org.thryft.waf.lib.stores.InvalidModelException;
import org.thryft.waf.lib.stores.NoSuchModelException;

import com.google.common.collect.ImmutableList;

import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.lib.CostumeProperties;
import net.logstash.logback.encoder.org.apache.commons.lang.exception.ExceptionUtils;

public abstract class AbstractFileSystem<ModelT extends Model> {
    protected AbstractFileSystem(final CostumeProperties properties) {
        rootDirectoryPath = new File(new File(new File(new File(properties.getHomeDirectoryPath()), "data"), "loaded"),
                properties.getEnvironment());
        if (!rootDirectoryPath.isDirectory()) {
            if (!rootDirectoryPath.mkdirs()) {
                throw new RuntimeException("error creating directory " + rootDirectoryPath);
            }
        }
    }

    protected final String _decodeFileName(final String fileName) {
        return FileNameCodec.decodeFileName(fileName);
    }

    protected final boolean _deleteDirectory(final File directoryPath, final Logger logger, final Marker logMarker)
            throws IOException {
        if (!directoryPath.isDirectory()) {
            logger.debug(logMarker, "directory {} does not exist to delete", directoryPath);
            return false;
        }
        FileUtils.deleteDirectory(directoryPath);
        logger.debug(logMarker, "recursively deleted directory {}", directoryPath);
        return true;
    }

    protected final void _deleteDirectoryContents(final File directoryPath, final Logger logger, final Marker logMarker)
            throws IOException {
        final File[] files = directoryPath.listFiles();
        if (files == null || files.length == 0) {
            logger.debug(logMarker, "directory {} does not exist or is empty, not deleting contents", directoryPath);
            return;
        }
        for (final File file : files) {
            if (file.isDirectory()) {
                _deleteDirectory(file, logger, logMarker);
            } else if (!file.delete()) {
                throw new IOException("error deleting " + file);
            } else {
                logger.debug(logMarker, "deleted file {}", file);
            }
        }
    }

    protected final String _encodeFileName(final String fileName) {
        return FileNameCodec.encodeFileName(fileName);
    }

    protected final File _getCollectionDirectoryPath(final CollectionId collectionId) {
        return new File(_getInstitutionDirectoryPath(collectionId.getInstitutionId()),
                _encodeFileName(collectionId.getUnqualifiedCollectionId()));
    }

    protected final File _getInstitutionDirectoryPath(final InstitutionId institutionId) {
        return new File(_getInstitutionsDirectoryPath(), _encodeFileName(institutionId.toString()));
    }

    protected final ImmutableList<File> _getInstitutionDirectoryPaths(final Logger logger, final Marker logMarker) {
        return _getSubdirectoryPaths(_getInstitutionsDirectoryPath(), logger, logMarker);
    }

    protected final File _getInstitutionsDirectoryPath() {
        return rootDirectoryPath;
    }

    protected final ModelT _getModel(final File filePath, final Logger logger, final Marker logMarker)
            throws InvalidModelException, IOException, NoSuchModelException {
        try (FileReader fileReader = new FileReader(filePath)) {
            final JacksonJsonInputProtocol iprot = new JacksonJsonInputProtocol(fileReader);
            final ModelT model = _readModel(iprot);
            logger.debug(logMarker, "read file {}", filePath);
            return model;
        } catch (final FileNotFoundException e) {
            throw new NoSuchModelException();
        } catch (final InputProtocolException e) {
            throw new InvalidModelException("", ExceptionUtils.getRootCauseMessage(e));
        }
    }

    protected final ImmutableList<File> _getSubdirectoryPaths(final File parentDirectoryPath, final Logger logger,
            final Marker logMarker) {
        final File[] subdirectoryPaths = parentDirectoryPath.listFiles();
        if (subdirectoryPaths != null) {
            final ImmutableList.Builder<File> resultBuilder = ImmutableList.builder();
            for (final File subdirectoryPath : subdirectoryPaths) {
                if (!subdirectoryPath.isDirectory()) {
                    continue;
                }
                resultBuilder.add(subdirectoryPath);
            }
            return resultBuilder.build();
        } else {
            logger.warn(logMarker, "error listing institution directory {}", _getInstitutionsDirectoryPath());
            return ImmutableList.of();
        }
    }

    protected final void _putModel(final File filePath, final Logger logger, final Marker logMarker, final Model model)
            throws IOException {
        final File directoryPath = filePath.getParentFile();
        if (!directoryPath.isDirectory()) {
            if (!directoryPath.mkdirs()) {
                throw new IOException("error creating directory " + directoryPath);
            }
            logger.debug(logMarker, "created directory {}", directoryPath);
        }

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            final OutputProtocol oprot = new JacksonJsonOutputProtocol(fileWriter);
            model.writeAsStruct(oprot);
            oprot.flush();
            logger.debug(logMarker, "wrote file {}", filePath);
        } catch (final OutputProtocolException e) {
            throw new IOException(e);
        }
    }

    protected abstract ModelT _readModel(final InputProtocol iprot) throws InputProtocolException;

    private final File rootDirectoryPath;
}
