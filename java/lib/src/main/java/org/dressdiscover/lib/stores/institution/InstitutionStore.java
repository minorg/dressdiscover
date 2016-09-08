package org.dressdiscover.lib.stores.institution;

import org.dressdiscover.api.models.institution.Institution;
import org.dressdiscover.api.models.institution.InstitutionEntry;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.institution.NoSuchInstitutionException;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.thryft.waf.lib.stores.InvalidModelException;

import com.google.common.collect.ImmutableList;

public interface InstitutionStore {
    public boolean deleteInstitutionById(final InstitutionId institutionId, final Logger logger, final Marker logMarker)
            throws IoException;

    public void deleteInstitutions(final Logger logger, final Marker logMarker) throws IoException;

    public Institution getInstitutionById(final InstitutionId institutionId, final Logger logger,
            final Marker logMarker) throws InvalidModelException, IoException, NoSuchInstitutionException;

    public ImmutableList<InstitutionEntry> getInstitutions(final Logger logger, final Marker logMarker)
            throws IoException;

    public void putInstitution(final Institution institution, final InstitutionId institutionId, final Logger logger,
            final Marker logMarker) throws IoException;
}
