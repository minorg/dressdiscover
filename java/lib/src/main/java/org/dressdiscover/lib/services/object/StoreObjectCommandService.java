package org.dressdiscover.lib.services.object;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.List;

import org.dressdiscover.api.models.collection.CollectionEntry;
import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.institution.InstitutionEntry;
import org.dressdiscover.api.models.object.Object;
import org.dressdiscover.api.models.object.ObjectEntry;
import org.dressdiscover.api.models.object.ObjectId;
import org.dressdiscover.api.models.object.ObjectSummary;
import org.dressdiscover.api.models.object.ObjectSummaryEntry;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.collection.CollectionQueryService;
import org.dressdiscover.api.services.collection.NoSuchCollectionException;
import org.dressdiscover.api.services.institution.InstitutionQueryService;
import org.dressdiscover.api.services.institution.NoSuchInstitutionException;
import org.dressdiscover.api.services.object.ObjectCommandService;
import org.dressdiscover.lib.properties.StoreProperties;
import org.dressdiscover.lib.python.PythonUtils;
import org.dressdiscover.lib.services.object.LoggingObjectCommandService.Markers;
import org.dressdiscover.lib.stores.object.ObjectStore;
import org.dressdiscover.lib.stores.object.ObjectStoreCache;
import org.dressdiscover.lib.stores.object.ObjectSummaryElasticSearchIndex;
import org.elasticsearch.index.query.QueryBuilders;
import org.python.core.PyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class StoreObjectCommandService implements ObjectCommandService {
    @Inject
    public StoreObjectCommandService(final CollectionQueryService collectionQueryService,
            final InstitutionQueryService institutionQueryService, final ObjectStoreCache objectStoreCache,
            final ObjectSummariesResultCache objectSummariesResultCache, final ObjectSummaryCache objectSummaryCache,
            final ObjectSummaryElasticSearchIndex objectSummaryElasticSearchIndex, final StoreProperties properties) {
        this.collectionQueryService = checkNotNull(collectionQueryService);
        this.institutionQueryService = checkNotNull(institutionQueryService);
        this.objectStoreCache = checkNotNull(objectStoreCache);
        this.objectSummariesResultCache = checkNotNull(objectSummariesResultCache);
        this.objectSummaryCache = checkNotNull(objectSummaryCache);
        this.objectSummaryElasticSearchIndex = checkNotNull(objectSummaryElasticSearchIndex);
        resummarizeObjectsBulkRequestSize = properties.getResummarizeObjectsBulkRequestSize();
    }

    @Override
    public final int deleteObjectsByCollectionId(final CollectionId collectionId)
            throws IoException, NoSuchCollectionException, NoSuchInstitutionException {
        __invalidateCaches();

        final ObjectStore objectStore = objectStoreCache.getObjectStore(collectionId);

        final int result;
        try {
            result = objectStore.deleteObjectsByCollectionId(collectionId, logger,
                    Markers.DELETE_OBJECTS_BY_COLLECTION_ID);
        } catch (final PyException e) {
            PythonUtils.log(logger, Markers.DELETE_OBJECTS_BY_COLLECTION_ID, e);
            throw IoException.create("Python exception");
        }

        objectSummaryElasticSearchIndex.deleteModels(logger, Markers.DELETE_OBJECTS_BY_COLLECTION_ID,
                QueryBuilders.boolQuery().filter(QueryBuilders.termQuery(
                        ObjectSummary.FieldMetadata.COLLECTION_ID.getThriftProtocolKey(), collectionId.toString())));

        return result;
    }

    @Override
    public final void putObject(final ObjectId id, final Object object)
            throws IoException, NoSuchCollectionException, NoSuchInstitutionException {
        __invalidateCaches();

        final ObjectStore objectStore = objectStoreCache.getObjectStore(id);
        try {
            objectStore.putObject(logger, Markers.PUT_OBJECT, object, id);
        } catch (final PyException e) {
            PythonUtils.log(logger, Markers.PUT_OBJECT, e);
            throw IoException.create("Python exception");
        }

        objectSummaryElasticSearchIndex.putModel(logger, Markers.PUT_OBJECT,
                ObjectSummaryEntry.create(id, ObjectSummarizer.getInstance().summarizeObject(object, id)));
    }

    @Override
    public final void putObjects(final ImmutableList<ObjectEntry> objects)
            throws IoException, NoSuchCollectionException, NoSuchInstitutionException {
        __invalidateCaches();

        for (final ObjectEntry objectEntry : objects) {
            final ObjectStore objectStore = objectStoreCache.getObjectStore(objectEntry.getId());
            try {
                objectStore.putObject(logger, Markers.PUT_OBJECTS, objectEntry.getModel(), objectEntry.getId());
            } catch (final PyException e) {
                PythonUtils.log(logger, Markers.PUT_OBJECTS, e);
                throw IoException.create("Python exception");
            }
        }

        final ImmutableList.Builder<ObjectSummaryEntry> objectSummariesBuilder = ImmutableList.builder();
        for (final ObjectEntry objectEntry : objects) {
            objectSummariesBuilder.add(ObjectSummaryEntry.create(objectEntry.getId(),
                    ObjectSummarizer.getInstance().summarizeObject(objectEntry)));
        }

        objectSummaryElasticSearchIndex.putModels(logger, Markers.PUT_OBJECTS, objectSummariesBuilder.build());
    }

    @Override
    public final void resummarizeObjects() throws IoException {
        try {
            objectSummaryElasticSearchIndex.deleteModels(logger, Markers.RESUMMARIZE_OBJECTS);

            final List<ObjectSummaryEntry> objectSummaries = new ArrayList<>();
            for (final InstitutionEntry institutionEntry : institutionQueryService.getInstitutions()) {
                try {
                    for (final CollectionEntry collectionEntry : collectionQueryService
                            .getCollectionsByInstitutionId(institutionEntry.getId())) {
                        final ObjectStore objectStore = objectStoreCache.getObjectStore(collectionEntry.getId());
                        try {
                            for (final ObjectEntry objectEntry : objectStore.getObjectsByCollectionId(
                                    collectionEntry.getId(), logger, Markers.RESUMMARIZE_OBJECTS)) {
                                objectSummaries.add(ObjectSummaryEntry.create(objectEntry.getId(),
                                        ObjectSummarizer.getInstance().summarizeObject(objectEntry)));
                                if (objectSummaries.size() == resummarizeObjectsBulkRequestSize) {
                                    objectSummaryElasticSearchIndex.putModels(logger, Markers.RESUMMARIZE_OBJECTS,
                                            ImmutableList.copyOf(objectSummaries));
                                    logger.info(Markers.RESUMMARIZE_OBJECTS, "put {} object summaries",
                                            objectSummaries.size());
                                    objectSummaries.clear();
                                }
                            }
                        } catch (final PyException e) {
                            PythonUtils.log(logger, Markers.RESUMMARIZE_OBJECTS, e);
                            throw IoException.create("Python exception");
                        }
                    }
                } catch (final NoSuchInstitutionException e) {
                    logger.warn(Markers.RESUMMARIZE_OBJECTS, "error getting collections for institution {}",
                            institutionEntry.getId());
                    return;
                }
            }
            if (!objectSummaries.isEmpty()) {
                objectSummaryElasticSearchIndex.putModels(logger, Markers.RESUMMARIZE_OBJECTS,
                        ImmutableList.copyOf(objectSummaries));
                logger.info(Markers.RESUMMARIZE_OBJECTS, "put {} object summaries", objectSummaries.size());
            }
        } catch (final IoException e) {
            logger.error(Markers.RESUMMARIZE_OBJECTS, "I/O exception: ", e);
        }
    }

    private void __invalidateCaches() {
        objectSummariesResultCache.invalidateAll();
        objectSummaryCache.invalidateAll();
    }

    private final CollectionQueryService collectionQueryService;
    private final InstitutionQueryService institutionQueryService;
    private final ObjectStoreCache objectStoreCache;
    private final ObjectSummariesResultCache objectSummariesResultCache;
    private final ObjectSummaryCache objectSummaryCache;
    private final ObjectSummaryElasticSearchIndex objectSummaryElasticSearchIndex;
    private final int resummarizeObjectsBulkRequestSize;
    private final static Logger logger = LoggerFactory.getLogger(StoreObjectCommandService.class);
}
