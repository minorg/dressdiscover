package org.dressdiscover.lib.stores.institution;

import java.io.File;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.dressdiscover.api.models.institution.Institution;
import org.dressdiscover.api.models.institution.InstitutionEntry;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.api.models.institution.InvalidInstitutionIdException;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.institution.NoSuchInstitutionException;
import org.dressdiscover.lib.properties.GlobalProperties;
import org.dressdiscover.lib.properties.StoreProperties;
import org.dressdiscover.lib.stores.AbstractInstitutionCollectionObjectFileSystem;
import org.slf4j.Marker;
import org.thryft.protocol.InputProtocol;
import org.thryft.protocol.InputProtocolException;
import org.thryft.waf.lib.stores.InvalidModelException;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class FileSystemInstitutionStore
        extends AbstractInstitutionCollectionObjectFileSystem<Institution, NoSuchInstitutionException>
        implements InstitutionStore {
    @Inject
    public FileSystemInstitutionStore(final GlobalProperties globalProperties, final StoreProperties storeProperties) {
        super(new File(storeProperties.getDataDirectoryPath()), globalProperties);
    }

    @Override
    public final boolean deleteInstitutionById(final InstitutionId institutionId, final Marker logMarker)
            throws IoException {
        return _deleteDirectory(_getInstitutionDirectoryPath(institutionId), logMarker) > 0;
    }

    @Override
    public final void deleteInstitutions(final Marker logMarker) throws IoException {
        _deleteDirectoryContents(true, _getInstitutionsDirectoryPath(), logMarker);
    }

    @Override
    public final Institution getInstitutionById(final InstitutionId institutionId, final Marker logMarker)
            throws InvalidModelException, IoException, NoSuchInstitutionException {
        return _getModel(__getInstitutionFilePath(institutionId), logMarker);
    }

    @Override
    public final ImmutableList<InstitutionEntry> getInstitutions(final Marker logMarker) throws IoException {
        final ImmutableList<File> institutionDirectoryPaths = _getInstitutionDirectoryPaths(logMarker);
        if (institutionDirectoryPaths.isEmpty()) {
            return ImmutableList.of();
        }
        final ImmutableList.Builder<InstitutionEntry> builder = ImmutableList.builder();
        for (final File institutionDirectoryPath : institutionDirectoryPaths) {
            final File institutionFilePath = new File(institutionDirectoryPath, FILE_NAME);
            if (!institutionFilePath.isFile()) {
                continue;
            }
            InstitutionId institutionId;
            try {
                institutionId = InstitutionId.parse(_decodeFileName(institutionDirectoryPath.getName()));
            } catch (final InvalidInstitutionIdException e) {
                logger.warn(logMarker, "invalid institution directory path {}", institutionDirectoryPath.getName());
                continue;
            }
            Institution institution;
            try {
                institution = _getModel(institutionFilePath, logMarker);
            } catch (InvalidModelException | NoSuchInstitutionException e) {
                logger.warn(logMarker, "error reading institution file {}: {}", institutionFilePath,
                        ExceptionUtils.getRootCauseMessage(e));
                continue;
            }
            builder.add(InstitutionEntry.create(institutionId, institution));
        }
        return builder.build();
    }

    @Override
    public final void putInstitution(final Institution institution, final InstitutionId institutionId,
            final Marker logMarker) throws IoException {
        _putModel(__getInstitutionFilePath(institutionId), logMarker, institution);
    }

    @Override
    protected final NoSuchInstitutionException _newNoSuchModelException() {
        return new NoSuchInstitutionException();
    }

    @Override
    protected Institution _readModel(final InputProtocol iprot) throws InputProtocolException {
        return Institution.readAsStruct(iprot);
    }

    private File __getInstitutionFilePath(final InstitutionId institutionId) {
        return new File(_getInstitutionDirectoryPath(institutionId), FILE_NAME);
    }

    private final static String FILE_NAME = ".institution.json";
}
