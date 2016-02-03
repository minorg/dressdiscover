package net.lab1318.costume.lib.services.object;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thryft.waf.lib.stores.InvalidModelException;
import org.thryft.waf.lib.stores.NoSuchModelException;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.object.Object;
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.object.NoSuchObjectException;
import net.lab1318.costume.api.services.object.ObjectQueryService;
import net.lab1318.costume.lib.services.IoExceptions;
import net.lab1318.costume.lib.services.object.LoggingObjectQueryService.Markers;
import net.lab1318.costume.lib.stores.object.ObjectFileSystem;

@Singleton
public class FileSystemObjectQueryService implements ObjectQueryService {
    @Inject
    public FileSystemObjectQueryService(final ObjectFileSystem fileSystem) {
        this.fileSystem = checkNotNull(fileSystem);
    }

    @Override
    public Object getObjectById(final ObjectId id) throws IoException, NoSuchObjectException {
        try {
            return fileSystem.getObjectById(logger, Markers.GET_OBJECT_BY_ID, id);
        } catch (final InvalidModelException e) {
            logger.warn(Markers.GET_OBJECT_BY_ID, "invalid object model {}: ", id, e);
            throw new NoSuchObjectException();
        } catch (final IOException e) {
            throw IoExceptions.wrap(e, "error getting object" + id);
        } catch (final NoSuchModelException e) {
            throw new NoSuchObjectException();
        }
    }

    private final ObjectFileSystem fileSystem;
    private final static Logger logger = LoggerFactory.getLogger(FileSystemObjectQueryService.class);
}
