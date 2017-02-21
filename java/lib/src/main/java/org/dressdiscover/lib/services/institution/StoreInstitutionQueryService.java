package org.dressdiscover.lib.services.institution;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.api.models.institution.Institution;
import org.dressdiscover.api.models.institution.InstitutionEntry;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.institution.InstitutionQueryService;
import org.dressdiscover.api.services.institution.NoSuchInstitutionException;
import org.dressdiscover.lib.services.institution.LoggingInstitutionQueryService.Markers;
import org.dressdiscover.lib.stores.institution.InstitutionStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thryft.waf.lib.stores.InvalidModelException;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
class StoreInstitutionQueryService implements InstitutionQueryService {
    @Inject
    public StoreInstitutionQueryService(final InstitutionStore store) {
        this.store = checkNotNull(store);
    }

    @Override
    public final Institution getInstitutionById(final InstitutionId id) throws IoException, NoSuchInstitutionException {
        try {
            return store.getInstitutionById(id, Markers.GET_INSTITUTION_BY_ID);
        } catch (final InvalidModelException e) {
            logger.warn(Markers.GET_INSTITUTION_BY_ID, "invalid institution model {}: ", id, e);
            throw new NoSuchInstitutionException();
        }
    }

    @Override
    public final ImmutableList<InstitutionEntry> getInstitutions() throws IoException {
        return store.getInstitutions(Markers.GET_INSTITUTIONS);
    }

    @Override
    public final ImmutableList<Institution> getInstitutionsByIds(final ImmutableList<InstitutionId> ids)
            throws IoException, NoSuchInstitutionException {
        if (ids.isEmpty()) {
            return ImmutableList.of();
        }
        final ImmutableList.Builder<Institution> resultBuilder = ImmutableList.builder();
        for (final InstitutionId institutionId : ids) {
            try {
                resultBuilder.add(store.getInstitutionById(institutionId, Markers.GET_INSTITUTIONS_BY_IDS));
            } catch (final InvalidModelException e) {
                logger.warn(Markers.GET_INSTITUTIONS_BY_IDS, "invalid institution model {}: ", institutionId, e);
                throw NoSuchInstitutionException.create(institutionId);
            }
        }
        return resultBuilder.build();
    }

    private final InstitutionStore store;
    private final static Logger logger = LoggerFactory.getLogger(StoreInstitutionQueryService.class);
}
