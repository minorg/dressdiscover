package net.lab1318.costume.lib.services.object;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.elasticsearch.index.query.QueryBuilders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.ImmutableList;
import com.google.common.primitives.UnsignedInteger;
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
import net.lab1318.costume.lib.CostumeProperties;
import net.lab1318.costume.lib.services.IoExceptions;
import net.lab1318.costume.lib.services.object.LoggingObjectCommandService.Markers;
import net.lab1318.costume.lib.stores.object.ObjectFileSystem;
import net.lab1318.costume.lib.stores.object.ObjectSummaryElasticSearchIndex;

@Singleton
public class FileSystemObjectCommandService implements ObjectCommandService {
    @Inject
    public FileSystemObjectCommandService(final ObjectFileSystem objectFileSystem,
            final ObjectSummariesResultCache objectSummariesResultCache, final ObjectSummaryCache objectSummaryCache,
            final ObjectSummaryElasticSearchIndex objectSummaryElasticSearchIndex, final CostumeProperties properties) {
        this.objectFileSystem = checkNotNull(objectFileSystem);
        this.objectSummariesResultCache = checkNotNull(objectSummariesResultCache);
        this.objectSummaryCache = checkNotNull(objectSummaryCache);
        this.objectSummaryElasticSearchIndex = checkNotNull(objectSummaryElasticSearchIndex);
        resummarizeObjectsBulkRequestSize = properties.getResummarizeObjectsBulkRequestSize().intValue();
    }

    @Override
    public final UnsignedInteger deleteObjects() throws IoException {
        __invalidateCaches();

        UnsignedInteger result;
        try {
            result = UnsignedInteger.valueOf(objectFileSystem.deleteObjects(logger, Markers.DELETE_OBJECTS));
        } catch (final IOException e) {
            throw IoExceptions.wrap(e, "error deleting objects");
        }

        try {
            objectSummaryElasticSearchIndex.deleteModels(logger, Markers.DELETE_OBJECTS);
        } catch (final IOException e) {
            throw IoExceptions.wrap(e, "error deleting object summaries");
        }

        return result;
    }

    @Override
    public final UnsignedInteger deleteObjectsByCollectionId(final CollectionId collectionId) throws IoException {
        __invalidateCaches();

        UnsignedInteger result;
        try {
            result = UnsignedInteger.valueOf(objectFileSystem.deleteObjectsByCollectionId(collectionId, logger,
                    Markers.DELETE_OBJECTS_BY_COLLECTION_ID));
        } catch (final IOException e) {
            throw IoExceptions.wrap(e, "error deleting objects by collection id");
        }

        try {
            objectSummaryElasticSearchIndex.deleteModels(logger, Markers.DELETE_OBJECTS_BY_COLLECTION_ID,
                    QueryBuilders.boolQuery()
                            .filter(QueryBuilders.termQuery(
                                    ObjectSummary.FieldMetadata.COLLECTION_ID.getThriftProtocolKey(),
                                    collectionId.toString())));
        } catch (final IOException e) {
            throw IoExceptions.wrap(e, "error deleting object summaries by collection id");
        }

        return result;
    }

    @Override
    public final UnsignedInteger deleteObjectsByInstitutionId(final InstitutionId institutionId) throws IoException {
        __invalidateCaches();

        UnsignedInteger result;
        try {
            result = UnsignedInteger.valueOf(objectFileSystem.deleteObjectsByInstitutionId(institutionId, logger,
                    Markers.DELETE_OBJECTS_BY_INSTITUTION_ID));
        } catch (final IOException e) {
            throw IoExceptions.wrap(e, "error deleting objects by institution id");
        }

        try {
            objectSummaryElasticSearchIndex.deleteModels(logger, Markers.DELETE_OBJECTS_BY_INSTITUTION_ID,
                    QueryBuilders.boolQuery()
                            .filter(QueryBuilders.termQuery(
                                    ObjectSummary.FieldMetadata.INSTITUTION_ID.getThriftProtocolKey(),
                                    institutionId.toString())));
        } catch (final IOException e) {
            throw IoExceptions.wrap(e, "error deleting object summaries by institution id");
        }

        return result;
    }

    @Override
    public final void putObject(final ObjectId id, final Object object) throws IoException {
        __invalidateCaches();

        try {
            objectFileSystem.putObject(logger, Markers.PUT_OBJECT, object, id);
        } catch (final IOException e) {
            throw IoExceptions.wrap(e, "error putting object");
        }

        try {
            objectSummaryElasticSearchIndex.putModel(logger, Markers.PUT_OBJECT,
                    new ObjectSummaryEntry(id, ObjectSummarizer.getInstance().summarizeObject(object)));
        } catch (final IOException e) {
            throw IoExceptions.wrap(e, "error putting object summary");
        }
    }

    @Override
    public final void putObjects(final ImmutableList<ObjectEntry> objects) throws IoException {
        __invalidateCaches();

        for (final ObjectEntry objectEntry : objects) {
            try {
                objectFileSystem.putObject(logger, Markers.PUT_OBJECTS, objectEntry.getModel(), objectEntry.getId());
            } catch (final IOException e) {
                throw IoExceptions.wrap(e, "error putting objects");
            }
        }

        final ImmutableList.Builder<ObjectSummaryEntry> objectSummariesBuilder = ImmutableList.builder();
        for (final ObjectEntry objectEntry : objects) {
            objectSummariesBuilder.add(new ObjectSummaryEntry(objectEntry.getId(),
                    ObjectSummarizer.getInstance().summarizeObject(objectEntry.getModel())));
        }
        try {
            objectSummaryElasticSearchIndex.putModels(logger, Markers.PUT_OBJECTS, objectSummariesBuilder.build());
        } catch (final IOException e) {
            throw IoExceptions.wrap(e, "error putting object summaries");
        }
    }

    @Override
    public final void resummarizeObjects() throws IoException {
        try {
            objectSummaryElasticSearchIndex.deleteModels(logger, Markers.RESUMMARIZE_OBJECTS);

            final List<ObjectSummaryEntry> objectSummaries = new ArrayList<>();
            for (final ObjectEntry objectEntry : objectFileSystem.getObjects(logger, Markers.RESUMMARIZE_OBJECTS)) {
                objectSummaries.add(new ObjectSummaryEntry(objectEntry.getId(),
                        ObjectSummarizer.getInstance().summarizeObject(objectEntry.getModel())));
                if (objectSummaries.size() == resummarizeObjectsBulkRequestSize) {
                    objectSummaryElasticSearchIndex.putModels(logger, Markers.RESUMMARIZE_OBJECTS,
                            ImmutableList.copyOf(objectSummaries));
                    logger.info(Markers.RESUMMARIZE_OBJECTS, "put {} object summaries", objectSummaries.size());
                    objectSummaries.clear();
                }
            }
            if (!objectSummaries.isEmpty()) {
                objectSummaryElasticSearchIndex.putModels(logger, Markers.RESUMMARIZE_OBJECTS,
                        ImmutableList.copyOf(objectSummaries));
                logger.info(Markers.RESUMMARIZE_OBJECTS, "put {} object summaries", objectSummaries.size());
            }
        } catch (final IOException e) {
            logger.error(Markers.RESUMMARIZE_OBJECTS, "I/O exception: ", e);
        }
    }

    private void __invalidateCaches() {
        objectSummariesResultCache.invalidateAll();
        objectSummaryCache.invalidateAll();
    }

    private final ObjectFileSystem objectFileSystem;
    private final ObjectSummariesResultCache objectSummariesResultCache;
    private final ObjectSummaryCache objectSummaryCache;
    private final ObjectSummaryElasticSearchIndex objectSummaryElasticSearchIndex;
    private final int resummarizeObjectsBulkRequestSize;
    private final static Logger logger = LoggerFactory.getLogger(FileSystemObjectCommandService.class);
}
