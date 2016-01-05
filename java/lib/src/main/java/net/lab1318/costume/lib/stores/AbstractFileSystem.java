package net.lab1318.costume.lib.stores;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.thryft.Struct;
import org.thryft.protocol.JacksonJsonOutputProtocol;
import org.thryft.protocol.OutputProtocol;
import org.thryft.protocol.OutputProtocolException;

import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.lib.CostumeProperties;

public abstract class AbstractFileSystem {
    protected AbstractFileSystem(final CostumeProperties properties) {
        rootDirectoryPath = new File(new File(new File(properties.getHomeDirectoryPath()), "data"), "loaded");
        if (!rootDirectoryPath.isDirectory()) {
            if (!rootDirectoryPath.mkdirs()) {
                throw new RuntimeException("error creating directory " + rootDirectoryPath);
            }
        }
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

    protected final File _getInstitutionDirectoryPath(final InstitutionId institutionId) {
        return new File(_getInstitutionsDirectoryPath(), institutionId.toString());
    }

    protected final File _getInstitutionsDirectoryPath() {
        return rootDirectoryPath;
    }

    protected final void _putModel(final File filePath, final Logger logger, final Marker logMarker, final Struct model)
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

    private final File rootDirectoryPath;
}
