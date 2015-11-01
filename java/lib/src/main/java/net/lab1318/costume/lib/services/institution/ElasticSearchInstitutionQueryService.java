package net.lab1318.costume.lib.services.institution;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.elasticsearch.common.bytes.BytesReference;
import org.elasticsearch.index.query.QueryBuilders;
import org.notaweb.lib.protocols.ElasticSearchInputProtocol;
import org.notaweb.lib.stores.ElasticSearchIndex;
import org.notaweb.lib.stores.InvalidModelException;
import org.notaweb.lib.stores.NoSuchModelException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thryft.protocol.InputProtocolException;

import com.google.common.base.Optional;
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
import net.lab1318.costume.lib.stores.institution.InstitutionElasticSearchIndex;

@Singleton
public class ElasticSearchInstitutionQueryService implements InstitutionQueryService {
    private final static class InstitutionElasticSearchModelFactory
            implements ElasticSearchIndex.ModelFactory<InstitutionEntry> {
        public static InstitutionElasticSearchModelFactory getInstance() {
            return instance;
        }

        private InstitutionElasticSearchModelFactory() {
        }

        @Override
        public InstitutionEntry createModelEntryFromFields(final String id, final Map<String, List<?>> fields)
                throws InvalidModelException {
            throw new UnsupportedOperationException();
        }

        @Override
        public InstitutionEntry createModelEntryFromSource(final String id, final BytesReference document)
                throws InvalidModelException {
            try {
                return new InstitutionEntry(InstitutionId.valueOf(id),
                        Institution.readAsStruct(new ElasticSearchInputProtocol(document)));
            } catch (final InputProtocolException | IllegalArgumentException e) {
                throw new InvalidModelException(id, ServiceExceptionHelper.combineMessages(e,
                        "error deserializing model document from ElasticSearch"), e);
            }
        }

        private final static InstitutionElasticSearchModelFactory instance = new InstitutionElasticSearchModelFactory();
    }

    @Inject
    public ElasticSearchInstitutionQueryService(final InstitutionElasticSearchIndex elasticSearchIndex) {
        this.elasticSearchIndex = checkNotNull(elasticSearchIndex);
    }

    @Override
    public Institution getInstitutionById(final InstitutionId id) throws IoException, NoSuchInstitutionException {
        try {
            return elasticSearchIndex.getModelById(id, Optional.absent(), logger, Markers.GET_INSTITUTION_BY_ID,
                    InstitutionElasticSearchModelFactory.getInstance());
        } catch (final InvalidModelException e) {
            logger.warn(Markers.GET_INSTITUTION_BY_ID, "invalid trial model {}: ", id, e);
            throw new NoSuchInstitutionException();
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting trial" + id);
        } catch (final NoSuchModelException e) {
            throw new NoSuchInstitutionException();
        }
    }

    @Override
    public ImmutableList<InstitutionEntry> getInstitutions() throws IoException {
        try {
            return elasticSearchIndex.getModels(logger, Markers.GET_INSTITUTION_BY_ID,
                    InstitutionElasticSearchModelFactory.getInstance(), elasticSearchIndex.prepareSearchModels()
                            .setQuery(QueryBuilders.matchAllQuery()).setSize(Integer.MAX_VALUE));
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting trials");
        }
    }

    private final InstitutionElasticSearchIndex elasticSearchIndex;
    private final static Logger logger = LoggerFactory.getLogger(ElasticSearchInstitutionQueryService.class);
}
