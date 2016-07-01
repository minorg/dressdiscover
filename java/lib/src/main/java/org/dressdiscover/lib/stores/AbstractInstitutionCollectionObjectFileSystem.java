package org.dressdiscover.lib.stores;

import java.io.File;

import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.lib.DressDiscoverProperties;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.thryft.waf.api.models.Model;
import org.thryft.waf.lib.stores.AbstractFileSystem;

import com.google.common.collect.ImmutableList;

public abstract class AbstractInstitutionCollectionObjectFileSystem<ModelT extends Model> extends AbstractFileSystem<ModelT> {
    protected AbstractInstitutionCollectionObjectFileSystem(final DressDiscoverProperties properties) {
        super(new File(new File(new File(new File(properties.getHomeDirectoryPath()), "data"), "loaded"),
                properties.getEnvironment()));
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
        return _getRootDirectoryPath();
    }
}
