package net.lab1318.costume.lib.stores;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.Marker;
import org.thryft.waf.api.models.Model;
import org.thryft.waf.lib.stores.AbstractFileSystem;

import com.google.common.collect.ImmutableList;

import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.lib.CostumeProperties;

public abstract class AbstractInstitutionCollectionObjectFileSystem<ModelT extends Model> extends AbstractFileSystem<ModelT> {
    protected AbstractInstitutionCollectionObjectFileSystem(final CostumeProperties properties) {
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
