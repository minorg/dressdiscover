package org.dressdiscover.lib.stores.institution;

import java.io.IOException;

import org.dressdiscover.api.models.institution.Institution;
import org.dressdiscover.api.models.institution.InstitutionEntry;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.thryft.waf.lib.stores.InvalidModelException;
import org.thryft.waf.lib.stores.NoSuchModelException;

import com.google.common.collect.ImmutableList;

public interface InstitutionStore {
    public boolean deleteInstitutionById(final InstitutionId institutionId, final Logger logger, final Marker logMarker)
            throws IOException;

    public void deleteInstitutions(final Logger logger, final Marker logMarker) throws IOException;

    public Institution getInstitutionById(final InstitutionId institutionId, final Logger logger,
            final Marker logMarker) throws InvalidModelException, NoSuchModelException, IOException;

    public ImmutableList<InstitutionEntry> getInstitutions(final Logger logger, final Marker logMarker)
            throws IOException;

    public void putInstitution(final Institution institution, final InstitutionId institutionId, final Logger logger,
            final Marker logMarker) throws IOException;
}