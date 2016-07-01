package org.dressdiscover.lib.services.institution;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import org.dressdiscover.api.models.institution.Institution;
import org.dressdiscover.api.models.institution.InstitutionEntry;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.lib.services.IoExceptions;
import org.dressdiscover.lib.services.institution.LoggingInstitutionQueryService.Markers;
import org.dressdiscover.lib.stores.institution.InstitutionStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thryft.waf.lib.stores.InvalidModelException;
import org.thryft.waf.lib.stores.NoSuchModelException;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.institution.InstitutionQueryService;
import org.dressdiscover.api.services.institution.NoSuchInstitutionException;

@Singleton
public class StoreInstitutionQueryService implements InstitutionQueryService {
    @Inject
    public StoreInstitutionQueryService(final InstitutionStore store) {
        this.store = checkNotNull(store);
    }

    @Override
    public final Institution getInstitutionById(final InstitutionId id) throws IoException, NoSuchInstitutionException {
        try {
            return store.getInstitutionById(id, logger, Markers.GET_INSTITUTION_BY_ID);
        } catch (final InvalidModelException e) {
            logger.warn(Markers.GET_INSTITUTION_BY_ID, "invalid institution model {}: ", id, e);
            throw new NoSuchInstitutionException();
        } catch (final IOException e) {
            throw IoExceptions.wrap(e, "error getting institution" + id);
        } catch (final NoSuchModelException e) {
            throw new NoSuchInstitutionException();
        }
    }

    @Override
    public final ImmutableList<InstitutionEntry> getInstitutions() throws IoException {
        try {
            return store.getInstitutions(logger, Markers.GET_INSTITUTIONS);
        } catch (final IOException e) {
            throw IoExceptions.wrap(e, "error getting institutions");
        }
    }

    @Override
    public final ImmutableList<Institution> getInstitutionsByIds(final ImmutableList<InstitutionId> ids)
            throws IoException, NoSuchInstitutionException {
        if (ids.isEmpty()) {
            return ImmutableList.of();
        }
        try {
            final ImmutableList.Builder<Institution> resultBuilder = ImmutableList.builder();
            for (final InstitutionId institutionId : ids) {
                try {
                    resultBuilder.add(store.getInstitutionById(institutionId, logger, Markers.GET_INSTITUTIONS_BY_IDS));
                } catch (final InvalidModelException e) {
                    logger.warn(Markers.GET_INSTITUTIONS_BY_IDS, "invalid institution model {}: ", institutionId, e);
                    throw new NoSuchInstitutionException(institutionId);
                } catch (final NoSuchModelException e) {
                    throw new NoSuchInstitutionException(institutionId);
                }
            }
            return resultBuilder.build();
        } catch (final IOException e) {
            throw IoExceptions.wrap(e, "error getting institutions");
        }
    }

    private final InstitutionStore store;
    private final static Logger logger = LoggerFactory.getLogger(StoreInstitutionQueryService.class);
}
