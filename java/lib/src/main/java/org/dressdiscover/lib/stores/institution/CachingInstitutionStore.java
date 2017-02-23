package org.dressdiscover.lib.stores.institution;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.api.models.institution.Institution;
import org.dressdiscover.api.models.institution.InstitutionEntry;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.institution.NoSuchInstitutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.thryft.waf.lib.stores.InvalidModelException;

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
    public final synchronized boolean deleteInstitutionById(final InstitutionId institutionId, final Marker logMarker)
            throws IoException {
        __clear(logMarker);
        return underlyingInstitutionStore.deleteInstitutionById(institutionId, logMarker);
    }

    @Override
    public final synchronized void deleteInstitutions(final Marker logMarker) throws IoException {
        __clear(logMarker);
        underlyingInstitutionStore.deleteInstitutions(logMarker);
    }

    @Override
    public final synchronized Institution getInstitutionById(final InstitutionId institutionId, final Marker logMarker)
            throws InvalidModelException, IoException, NoSuchInstitutionException {
        __fill(logMarker);
        final Institution institution = institutionsById.get(institutionId);
        if (institution != null) {
            return institution;
        } else {
            throw new NoSuchInstitutionException();
        }
    }

    @Override
    public final synchronized ImmutableList<InstitutionEntry> getInstitutions(final Marker logMarker)
            throws IoException {
        __fill(logMarker);
        return institutions;
    }

    @Override
    public final synchronized void putInstitution(final Institution institution, final InstitutionId institutionId,
            final Marker logMarker) throws IoException {
        __clear(logMarker);
        underlyingInstitutionStore.putInstitution(institution, institutionId, logMarker);
    }

    private void __clear(final Marker logMarker) {
        logger.debug(logMarker, "clearing institution cache");
        institutions = ImmutableList.of();
        institutionsById = ImmutableMap.of();
    }

    private void __fill(final Marker logMarker) throws IoException {
        if (!institutions.isEmpty()) {
            return;
        }

        logger.debug(logMarker, "filling institution cache");

        institutions = underlyingInstitutionStore.getInstitutions(logMarker);

        final ImmutableMap.Builder<InstitutionId, Institution> institutionsByIdBuilder = ImmutableMap.builder();
        for (final InstitutionEntry institutionEntry : institutions) {
            institutionsByIdBuilder.put(institutionEntry.getId(), institutionEntry.getModel());
        }
        institutionsById = institutionsByIdBuilder.build();
    }

    private ImmutableList<InstitutionEntry> institutions = ImmutableList.of();
    private ImmutableMap<InstitutionId, Institution> institutionsById = ImmutableMap.of();
    private final InstitutionStore underlyingInstitutionStore;
    private final static Logger logger = LoggerFactory.getLogger(CachingInstitutionStore.class);
}
