package net.lab1318.costume.lib.services.object;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import org.elasticsearch.index.query.FilterBuilders;
import org.elasticsearch.index.query.QueryBuilders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.object.Object;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.models.object.ObjectSummary;
import net.lab1318.costume.api.models.object.ObjectSummaryEntry;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.object.ObjectCommandService;
import net.lab1318.costume.lib.services.ServiceExceptionHelper;
import net.lab1318.costume.lib.services.object.LoggingObjectCommandService.Markers;
import net.lab1318.costume.lib.stores.object.ObjectElasticSearchIndex;
import net.lab1318.costume.lib.stores.object.ObjectSummaryElasticSearchIndex;

@Singleton
public class ElasticSearchObjectCommandService implements ObjectCommandService {
    @Inject
    public ElasticSearchObjectCommandService(final ObjectElasticSearchIndex objectElasticSearchIndex,
            final ObjectSummaryElasticSearchIndex objectSummaryElasticSearchIndex) {
        this.objectElasticSearchIndex = checkNotNull(objectElasticSearchIndex);
        this.objectSummaryElasticSearchIndex = checkNotNull(objectSummaryElasticSearchIndex);
    }

    @Override
    public void deleteObjects() throws IoException {
        try {
            objectElasticSearchIndex.deleteIndex(logger, Markers.DELETE_OBJECTS);
            objectElasticSearchIndex.createIndex(logger, Markers.DELETE_OBJECTS);
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error deleting objects");
        }

        try {
            objectSummaryElasticSearchIndex.deleteIndex(logger, Markers.DELETE_OBJECTS);
            objectSummaryElasticSearchIndex.createIndex(logger, Markers.DELETE_OBJECTS);
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error deleting object summaries");
        }
    }

    @Override
    public void deleteObjectsByCollectionId(final CollectionId collectionId) throws IoException {
        try {
            objectElasticSearchIndex
                    .deleteModels(logger, Markers.DELETE_OBJECTS_BY_COLLECTION_ID,
                            QueryBuilders.filteredQuery(QueryBuilders.matchAllQuery(),
                                    FilterBuilders.termFilter(Object.FieldMetadata.COLLECTION_ID.getThriftProtocolKey(),
                                            collectionId.toString())));
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error deleting objects by collection id");
        }

        try {
            objectSummaryElasticSearchIndex
                    .deleteModels(logger, Markers.DELETE_OBJECTS_BY_COLLECTION_ID,
                            QueryBuilders.filteredQuery(QueryBuilders.matchAllQuery(),
                                    FilterBuilders.termFilter(
                                            ObjectSummary.FieldMetadata.COLLECTION_ID.getThriftProtocolKey(),
                                            collectionId.toString())));
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error deleting object summaries by collection id");
        }
    }

    @Override
    public void deleteObjectsByInstitutionId(final InstitutionId institutionId) throws IoException {
        try {
            objectElasticSearchIndex
                    .deleteModels(logger, Markers.DELETE_OBJECTS_BY_INSTITUTION_ID,
                            QueryBuilders.filteredQuery(QueryBuilders.matchAllQuery(),
                                    FilterBuilders.termFilter(
                                            Object.FieldMetadata.INSTITUTION_ID.getThriftProtocolKey(),
                                            institutionId.toString())));
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error deleting objects by institution id");
        }

        try {
            objectSummaryElasticSearchIndex
                    .deleteModels(logger, Markers.DELETE_OBJECTS_BY_INSTITUTION_ID,
                            QueryBuilders.filteredQuery(QueryBuilders.matchAllQuery(),
                                    FilterBuilders.termFilter(
                                            ObjectSummary.FieldMetadata.INSTITUTION_ID.getThriftProtocolKey(),
                                            institutionId.toString())));
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error deleting object summaries by institution id");
        }
    }

    @Override
    public void putObject(final ObjectId id, final Object object) throws IoException {
        try {
            objectElasticSearchIndex.putModel(logger, Markers.PUT_OBJECT, new ObjectEntry(id, object));
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error putting object");
        }

        try {
            objectSummaryElasticSearchIndex.putModel(logger, Markers.PUT_OBJECT,
                    new ObjectSummaryEntry(id, ObjectSummarizer.getInstance().summarizeObject(object)));
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error putting object summary");
        }
    }

    @Override
    public void putObjects(final ImmutableList<ObjectEntry> objects) throws IoException {
        try {
            objectElasticSearchIndex.putModels(logger, Markers.PUT_OBJECTS, objects);
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error putting objects");
        }

        final ImmutableList.Builder<ObjectSummaryEntry> objectSummariesBuilder = ImmutableList.builder();
        for (final ObjectEntry objectEntry : objects) {
            objectSummariesBuilder.add(new ObjectSummaryEntry(objectEntry.getId(),
                    ObjectSummarizer.getInstance().summarizeObject(objectEntry.getModel())));
        }
        try {
            objectSummaryElasticSearchIndex.putModels(logger, Markers.PUT_OBJECTS, objectSummariesBuilder.build());
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error putting object summaries");
        }
    }

    private final ObjectElasticSearchIndex objectElasticSearchIndex;
    private final ObjectSummaryElasticSearchIndex objectSummaryElasticSearchIndex;
    private final static Logger logger = LoggerFactory.getLogger(ElasticSearchObjectCommandService.class);
}
