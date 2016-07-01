package org.dressdiscover.lib.stores.institution;

import java.io.File;
import java.io.IOException;

import org.dressdiscover.api.models.institution.Institution;
import org.dressdiscover.api.models.institution.InstitutionEntry;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.api.models.institution.InvalidInstitutionIdException;
import org.dressdiscover.lib.DressDiscoverProperties;
import org.dressdiscover.lib.stores.AbstractInstitutionCollectionObjectFileSystem;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.thryft.protocol.InputProtocol;
import org.thryft.protocol.InputProtocolException;
import org.thryft.waf.lib.stores.InvalidModelException;
import org.thryft.waf.lib.stores.NoSuchModelException;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.logstash.logback.encoder.org.apache.commons.lang.exception.ExceptionUtils;

@Singleton
public class FileSystemInstitutionStore extends AbstractInstitutionCollectionObjectFileSystem<Institution>
		implements InstitutionStore {
	@Inject
	public FileSystemInstitutionStore(final DressDiscoverProperties properties) {
		super(properties);
	}

	@Override
	public final boolean deleteInstitutionById(final InstitutionId institutionId, final Logger logger,
			final Marker logMarker) throws IOException {
		return _deleteDirectory(_getInstitutionDirectoryPath(institutionId), logger, logMarker) > 0;
	}

	@Override
	public final void deleteInstitutions(final Logger logger, final Marker logMarker) throws IOException {
		_deleteDirectoryContents(true, _getInstitutionsDirectoryPath(), logger, logMarker);
	}

	@Override
	public final Institution getInstitutionById(final InstitutionId institutionId, final Logger logger,
			final Marker logMarker) throws InvalidModelException, NoSuchModelException, IOException {
		return _getModel(__getInstitutionFilePath(institutionId), logger, logMarker);
	}

	@Override
	public final ImmutableList<InstitutionEntry> getInstitutions(final Logger logger, final Marker logMarker)
			throws IOException {
		final ImmutableList<File> institutionDirectoryPaths = _getInstitutionDirectoryPaths(logger, logMarker);
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
				institution = _getModel(institutionFilePath, logger, logMarker);
			} catch (InvalidModelException | NoSuchModelException e) {
				logger.warn(logMarker, "error reading institution file {}: {}", institutionFilePath,
						ExceptionUtils.getRootCauseMessage(e));
				continue;
			}
			builder.add(new InstitutionEntry(institutionId, institution));
		}
		return builder.build();
	}

	@Override
	public final void putInstitution(final Institution institution, final InstitutionId institutionId,
			final Logger logger, final Marker logMarker) throws IOException {
		_putModel(__getInstitutionFilePath(institutionId), logger, logMarker, institution);
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
