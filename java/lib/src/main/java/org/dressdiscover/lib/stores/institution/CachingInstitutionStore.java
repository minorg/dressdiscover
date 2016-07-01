package org.dressdiscover.lib.stores.institution;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import org.dressdiscover.api.models.institution.Institution;
import org.dressdiscover.api.models.institution.InstitutionEntry;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.thryft.waf.lib.stores.InvalidModelException;
import org.thryft.waf.lib.stores.NoSuchModelException;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class CachingInstitutionStore implements InstitutionStore {
    @Inject
    public CachingInstitutionStore(final FileSystemInstitutionStore underlyingInstitutionStore) {
        this.underlyingInstitutionStore = checkNotNull(underlyingInstitutionStore);
    }

    @Override
    public final synchronized boolean deleteInstitutionById(final InstitutionId institutionId, final Logger logger,
            final Marker logMarker) throws IOException {
        __clear(logger, logMarker);
        return underlyingInstitutionStore.deleteInstitutionById(institutionId, logger, logMarker);
    }

    @Override
    public final synchronized void deleteInstitutions(final Logger logger, final Marker logMarker) throws IOException {
        __clear(logger, logMarker);
        underlyingInstitutionStore.deleteInstitutions(logger, logMarker);
    }

    @Override
    public final synchronized Institution getInstitutionById(final InstitutionId institutionId, final Logger logger,
            final Marker logMarker) throws InvalidModelException, NoSuchModelException, IOException {
        __fill(logger, logMarker);
        final Institution institution = institutionsById.get(institutionId);
        if (institution != null) {
            return institution;
        } else {
            throw new NoSuchModelException();
        }
    }

    @Override
    public final synchronized ImmutableList<InstitutionEntry> getInstitutions(final Logger logger,
            final Marker logMarker) throws IOException {
        __fill(logger, logMarker);
        return institutions;
    }

    @Override
    public final synchronized void putInstitution(final Institution institution, final InstitutionId institutionId,
            final Logger logger, final Marker logMarker) throws IOException {
        __clear(logger, logMarker);
        underlyingInstitutionStore.putInstitution(institution, institutionId, logger, logMarker);
    }

    private void __clear(final Logger logger, final Marker logMarker) {
        logger.debug(logMarker, "clearing institution cache");
        institutions = ImmutableList.of();
        institutionsById = ImmutableMap.of();
    }

    private void __fill(final Logger logger, final Marker logMarker) throws IOException {
        if (!institutions.isEmpty()) {
            return;
        }

        logger.debug(logMarker, "filling institution cache");

        institutions = underlyingInstitutionStore.getInstitutions(logger, logMarker);

        final ImmutableMap.Builder<InstitutionId, Institution> institutionsByIdBuilder = ImmutableMap.builder();
        for (final InstitutionEntry institutionEntry : institutions) {
            institutionsByIdBuilder.put(institutionEntry.getId(), institutionEntry.getModel());
        }
        institutionsById = institutionsByIdBuilder.build();
    }

    private ImmutableList<InstitutionEntry> institutions = ImmutableList.of();
    private ImmutableMap<InstitutionId, Institution> institutionsById = ImmutableMap.of();
    private final InstitutionStore underlyingInstitutionStore;
}
