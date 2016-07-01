package org.dressdiscover.lib.services.object;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;
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
import org.dressdiscover.lib.CostumeProperties;
import org.dressdiscover.lib.services.IoExceptions;
import org.dressdiscover.lib.services.object.LoggingObjectCommandService.Markers;
import org.dressdiscover.lib.stores.object.ObjectStoreCache;
import org.dressdiscover.lib.stores.object.ObjectSummaryElasticSearchIndex;
import org.elasticsearch.index.query.QueryBuilders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.ImmutableList;
import com.google.common.primitives.UnsignedInteger;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.collection.NoSuchCollectionException;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.api.services.institution.NoSuchInstitutionException;
import net.lab1318.costume.api.services.object.ObjectCommandService;

@Singleton
public class StoreObjectCommandService implements ObjectCommandService {
    @Inject
    public StoreObjectCommandService(final CollectionQueryService collectionQueryService,
            final InstitutionQueryService institutionQueryService, final ObjectStoreCache objectStoreCache,
            final ObjectSummariesResultCache objectSummariesResultCache, final ObjectSummaryCache objectSummaryCache,
            final ObjectSummaryElasticSearchIndex objectSummaryElasticSearchIndex, final CostumeProperties properties) {
        this.collectionQueryService = checkNotNull(collectionQueryService);
        this.institutionQueryService = checkNotNull(institutionQueryService);
        this.objectStoreCache = checkNotNull(objectStoreCache);
        this.objectSummariesResultCache = checkNotNull(objectSummariesResultCache);
        this.objectSummaryCache = checkNotNull(objectSummaryCache);
        this.objectSummaryElasticSearchIndex = checkNotNull(objectSummaryElasticSearchIndex);
        resummarizeObjectsBulkRequestSize = properties.getResummarizeObjectsBulkRequestSize().intValue();
    }

    @Override
    public final UnsignedInteger deleteObjectsByCollectionId(final CollectionId collectionId)
            throws IoException, NoSuchCollectionException, NoSuchInstitutionException {
        __invalidateCaches();

        UnsignedInteger result;
        try {
            result = UnsignedInteger.valueOf(objectStoreCache.getObjectStore(collectionId)
                    .deleteObjectsByCollectionId(collectionId, logger, Markers.DELETE_OBJECTS_BY_COLLECTION_ID));
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
    public final void putObject(final ObjectId id, final Object object)
            throws IoException, NoSuchCollectionException, NoSuchInstitutionException {
        __invalidateCaches();

        try {
            objectStoreCache.getObjectStore(id).putObject(logger, Markers.PUT_OBJECT, object, id);
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
    public final void putObjects(final ImmutableList<ObjectEntry> objects)
            throws IoException, NoSuchCollectionException, NoSuchInstitutionException {
        __invalidateCaches();

        for (final ObjectEntry objectEntry : objects) {
            try {
                objectStoreCache.getObjectStore(objectEntry.getId()).putObject(logger, Markers.PUT_OBJECTS,
                        objectEntry.getModel(), objectEntry.getId());
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
            for (final InstitutionEntry institutionEntry : institutionQueryService.getInstitutions()) {
                try {
                    for (final CollectionEntry collectionEntry : collectionQueryService
                            .getCollectionsByInstitutionId(institutionEntry.getId())) {
                        try {
                            for (final ObjectEntry objectEntry : objectStoreCache
                                    .getObjectStore(collectionEntry.getId()).getObjectsByCollectionId(
                                            collectionEntry.getId(), logger, Markers.RESUMMARIZE_OBJECTS)) {
                                objectSummaries.add(new ObjectSummaryEntry(objectEntry.getId(),
                                        ObjectSummarizer.getInstance().summarizeObject(objectEntry.getModel())));
                                if (objectSummaries.size() == resummarizeObjectsBulkRequestSize) {
                                    objectSummaryElasticSearchIndex.putModels(logger, Markers.RESUMMARIZE_OBJECTS,
                                            ImmutableList.copyOf(objectSummaries));
                                    logger.info(Markers.RESUMMARIZE_OBJECTS, "put {} object summaries",
                                            objectSummaries.size());
                                    objectSummaries.clear();
                                }
                            }
                        } catch (final NoSuchCollectionException e) {
                            logger.warn(Markers.RESUMMARIZE_OBJECTS, "no such collection {}", collectionEntry.getId());
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
        } catch (final IOException e) {
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
