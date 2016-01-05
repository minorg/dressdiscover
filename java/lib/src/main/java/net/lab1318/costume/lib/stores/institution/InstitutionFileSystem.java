package net.lab1318.costume.lib.stores.institution;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.Marker;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.lib.CostumeProperties;
import net.lab1318.costume.lib.stores.AbstractFileSystem;

@Singleton
public class InstitutionFileSystem extends AbstractFileSystem {
    @Inject
    public InstitutionFileSystem(final CostumeProperties properties) {
        super(properties);
    }

    public final boolean deleteInstitutionById(final InstitutionId institutionId, final Logger logger,
            final Marker logMarker) throws IOException {
        return _deleteDirectory(_getInstitutionDirectoryPath(institutionId), logger, logMarker);
    }

    public final void deleteInstitutions(final Logger logger, final Marker logMarker) throws IOException {
        _deleteDirectoryContents(_getInstitutionsDirectoryPath(), logger, logMarker);
    }

    public final void putInstitution(final Institution institution, final InstitutionId institutionId,
            final Logger logger, final Marker logMarker) throws IOException {
        _putModel(__getInstitutionFilePath(institutionId), logger, logMarker, institution);
    }

    private File __getInstitutionFilePath(final InstitutionId institutionId) {
        return new File(_getInstitutionDirectoryPath(institutionId), "institution.json");
    }
}
