package net.lab1318.costume.lib.services.institution;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.institution.InstitutionCommandService;
import net.lab1318.costume.lib.services.ServiceExceptionHelper;
import net.lab1318.costume.lib.services.institution.LoggingInstitutionCommandService.Markers;
import net.lab1318.costume.lib.stores.institution.InstitutionElasticSearchIndex;

@Singleton
public class ElasticSearchInstitutionCommandService implements InstitutionCommandService {
    @Inject
    public ElasticSearchInstitutionCommandService(final InstitutionElasticSearchIndex elasticSearchIndex) {
        this.elasticSearchIndex = checkNotNull(elasticSearchIndex);
    }

    @Override
    public void deleteInstitutions() throws IoException {
        try {
            // elasticSearchIndex.deleteModels(logger,
            // Markers.DELETE_INSTITUTIONS);
            elasticSearchIndex.deleteIndex(logger, Markers.DELETE_INSTITUTIONS);
            elasticSearchIndex.createIndex(logger, Markers.DELETE_INSTITUTIONS);
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error deleting objects");
        }
    }

    @Override
    public void putInstitution(final InstitutionId id, final Institution object) throws IoException {
        try {
            elasticSearchIndex.putModel(logger, Markers.PUT_INSTITUTION, new InstitutionEntry(id, object));
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error putting object");
        }
    }

    private final InstitutionElasticSearchIndex elasticSearchIndex;
    private final static Logger logger = LoggerFactory.getLogger(ElasticSearchInstitutionCommandService.class);
}
