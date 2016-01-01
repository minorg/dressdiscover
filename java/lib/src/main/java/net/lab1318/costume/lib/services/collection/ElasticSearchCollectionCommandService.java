package net.lab1318.costume.lib.services.collection;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import org.elasticsearch.index.query.QueryBuilders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thryft.waf.lib.stores.NoSuchModelException;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.collection.CollectionCommandService;
import net.lab1318.costume.api.services.collection.NoSuchCollectionException;
import net.lab1318.costume.api.services.object.ObjectCommandService;
import net.lab1318.costume.lib.services.ServiceExceptionHelper;
import net.lab1318.costume.lib.services.collection.LoggingCollectionCommandService.Markers;
import net.lab1318.costume.lib.stores.collection.CollectionElasticSearchIndex;

@Singleton
public class ElasticSearchCollectionCommandService implements CollectionCommandService {
    @Inject
    public ElasticSearchCollectionCommandService(final CollectionElasticSearchIndex elasticSearchIndex,
            final ObjectCommandService objectCommandService) {
        this.elasticSearchIndex = checkNotNull(elasticSearchIndex);
        this.objectCommandService = checkNotNull(objectCommandService);
    }

    @Override
    public void deleteCollectionById(final CollectionId id) throws IoException, NoSuchCollectionException {
        try {
            elasticSearchIndex.deleteModelById(id, logger, Markers.DELETE_COLLECTION_BY_ID);
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error deleting collection by id");
        } catch (final NoSuchModelException e) {
            throw new NoSuchCollectionException();
        }
    }

    @Override
    public void deleteCollections() throws IoException {
        try {
            elasticSearchIndex.deleteIndex(logger, Markers.DELETE_COLLECTIONS);
            elasticSearchIndex.createIndex(logger, Markers.DELETE_COLLECTIONS);
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error deleting collections");
        }

        objectCommandService.deleteObjects();
    }

    @Override
    public void deleteCollectionsByInstitutionId(final InstitutionId institutionId) throws IoException {
        try {
            elasticSearchIndex.deleteModels(logger,
                    Markers.DELETE_COLLECTIONS_BY_INSTITUTION_ID, QueryBuilders.boolQuery()
                            .filter(QueryBuilders.termQuery(
                                    Collection.FieldMetadata.INSTITUTION_ID.getThriftProtocolKey(),
                                    institutionId.toString())));
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error deleting collections by institution ID");
        }

        objectCommandService.deleteObjectsByInstitutionId(institutionId);
    }

    @Override
    public void putCollection(final CollectionId id, final Collection collection) throws IoException {
        try {
            elasticSearchIndex.putModel(logger, Markers.PUT_COLLECTION, new CollectionEntry(id, collection));
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error posting collection");
        }
    }

    private final CollectionElasticSearchIndex elasticSearchIndex;
    private final ObjectCommandService objectCommandService;
    private final static Logger logger = LoggerFactory.getLogger(ElasticSearchCollectionCommandService.class);
}
