package net.lab1318.costume.lib.services.institution;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thryft.waf.lib.stores.InvalidModelException;
import org.thryft.waf.lib.stores.NoSuchModelException;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.api.services.institution.NoSuchInstitutionException;
import net.lab1318.costume.lib.services.ServiceExceptionHelper;
import net.lab1318.costume.lib.services.institution.LoggingInstitutionQueryService.Markers;
import net.lab1318.costume.lib.stores.institution.InstitutionFileSystem;

@Singleton
public class FsInstitutionQueryService implements InstitutionQueryService {
    @Inject
    public FsInstitutionQueryService(final InstitutionFileSystem fileSystem) {
        this.fileSystem = checkNotNull(fileSystem);
    }

    @Override
    public Institution getInstitutionById(final InstitutionId id) throws IoException, NoSuchInstitutionException {
        try {
            return fileSystem.getInstitutionById(id, logger, Markers.GET_INSTITUTION_BY_ID);
        } catch (final InvalidModelException e) {
            logger.warn(Markers.GET_INSTITUTION_BY_ID, "invalid institution model {}: ", id, e);
            throw new NoSuchInstitutionException();
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting institution" + id);
        } catch (final NoSuchModelException e) {
            throw new NoSuchInstitutionException();
        }
    }

    @Override
    public ImmutableList<InstitutionEntry> getInstitutions() throws IoException {
        try {
            return fileSystem.getInstitutions(logger, Markers.GET_INSTITUTIONS);
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting institutions");
        }
    }

    @Override
    public ImmutableList<Institution> getInstitutionsByIds(final ImmutableList<InstitutionId> ids)
            throws IoException, NoSuchInstitutionException {
        if (ids.isEmpty()) {
            return ImmutableList.of();
        }
        try {
            final ImmutableList.Builder<Institution> resultBuilder = ImmutableList.builder();
            for (final InstitutionId institutionId : ids) {
                try {
                    resultBuilder
                            .add(fileSystem.getInstitutionById(institutionId, logger, Markers.GET_INSTITUTIONS_BY_IDS));
                } catch (final InvalidModelException e) {
                    logger.warn(Markers.GET_INSTITUTIONS_BY_IDS, "invalid institution model {}: ", institutionId, e);
                    throw new NoSuchInstitutionException(institutionId);
                } catch (final NoSuchModelException e) {
                    throw new NoSuchInstitutionException(institutionId);
                }
            }
            return resultBuilder.build();
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting institutions");
        }
    }

    private final InstitutionFileSystem fileSystem;
    private final static Logger logger = LoggerFactory.getLogger(FsInstitutionQueryService.class);
}
