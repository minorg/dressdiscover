package org.dressdiscover.lib.stores;

import java.io.File;
import java.io.IOException;

import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.lib.properties.GlobalProperties;
import org.dressdiscover.lib.services.IoExceptions;
import org.slf4j.Marker;
import org.thryft.protocol.OutputProtocolException;
import org.thryft.waf.api.models.Model;
import org.thryft.waf.lib.stores.fs.AbstractFileSystem;

import com.google.common.collect.ImmutableList;

public abstract class AbstractInstitutionCollectionObjectFileSystem<ModelT extends Model, NoSuchModelExceptionT extends Exception>
        extends AbstractFileSystem<IoException, ModelT, NoSuchModelExceptionT> {
    protected AbstractInstitutionCollectionObjectFileSystem(final File dataDirectoryPath,
            final GlobalProperties globalProperties) {
        super(new File(dataDirectoryPath, globalProperties.getEnvironment().name().toLowerCase()));
    }

    protected final File _getCollectionDirectoryPath(final CollectionId collectionId) {
        return new File(_getInstitutionDirectoryPath(collectionId.getInstitutionId()),
                _encodeFileName(collectionId.getUnqualifiedCollectionId()));
    }

    protected final File _getInstitutionDirectoryPath(final InstitutionId institutionId) {
        return new File(_getInstitutionsDirectoryPath(), _encodeFileName(institutionId.toString()));
    }

    protected final ImmutableList<File> _getInstitutionDirectoryPaths(final Marker logMarker) {
        return _getSubdirectoryPaths(_getInstitutionsDirectoryPath(), logMarker);
    }

    protected final File _getInstitutionsDirectoryPath() {
        return _getRootDirectoryPath();
    }

    @Override
    protected final IoException _newIoException(final IOException cause) {
        return IoExceptions.wrap(cause, "");
    }

    @Override
    protected final IoException _newIoException(final OutputProtocolException cause) {
        return IoExceptions.wrap(cause, "");
    }

    @Override
    protected final IoException _newIoException(final String message) {
        return IoException.create(message);
    }
}
