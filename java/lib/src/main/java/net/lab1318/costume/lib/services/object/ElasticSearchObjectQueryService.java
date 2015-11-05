package net.lab1318.costume.lib.services.object;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.elasticsearch.common.bytes.BytesReference;
import org.elasticsearch.index.query.FilterBuilders;
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
import com.google.common.primitives.UnsignedInteger;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.object.InvalidObjectIdException;
import net.lab1318.costume.api.models.object.Object;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.object.NoSuchObjectException;
import net.lab1318.costume.api.services.object.ObjectQueryService;
import net.lab1318.costume.lib.services.ServiceExceptionHelper;
import net.lab1318.costume.lib.services.object.LoggingObjectQueryService.Markers;
import net.lab1318.costume.lib.stores.object.ObjectElasticSearchIndex;

@Singleton
public class ElasticSearchObjectQueryService implements ObjectQueryService {
    private final static class ObjectElasticSearchModelFactory implements ElasticSearchIndex.ModelFactory<ObjectEntry> {
        public static ObjectElasticSearchModelFactory getInstance() {
            return instance;
        }

        private ObjectElasticSearchModelFactory() {
        }

        @Override
        public ObjectEntry createModelEntryFromFields(final String id, final Map<String, List<?>> fields)
                throws InvalidModelException {
            throw new UnsupportedOperationException();
        }

        @Override
        public ObjectEntry createModelEntryFromSource(final String id, final BytesReference document)
                throws InvalidModelException {
            try {
                return new ObjectEntry(ObjectId.parse(id),
                        Object.readAsStruct(new ElasticSearchInputProtocol(document)));
            } catch (final InputProtocolException | InvalidObjectIdException e) {
                throw new InvalidModelException(id, ServiceExceptionHelper.combineMessages(e,
                        "error deserializing model document from ElasticSearch"), e);
            }
        }

        private final static ObjectElasticSearchModelFactory instance = new ObjectElasticSearchModelFactory();
    }

    @Inject
    public ElasticSearchObjectQueryService(final ObjectElasticSearchIndex elasticSearchIndex) {
        this.elasticSearchIndex = checkNotNull(elasticSearchIndex);
    }

    @Override
    public Object getObjectById(final ObjectId id) throws IoException, NoSuchObjectException {
        try {
            return elasticSearchIndex.getModelById(id, Optional.absent(), logger, Markers.GET_OBJECT_BY_ID,
                    ObjectElasticSearchModelFactory.getInstance());
        } catch (final InvalidModelException e) {
            logger.warn(Markers.GET_OBJECT_BY_ID, "invalid object model {}: ", id, e);
            throw new NoSuchObjectException();
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting object" + id);
        } catch (final NoSuchModelException e) {
            throw new NoSuchObjectException();
        }
    }

    @Override
    public UnsignedInteger getObjectCount() throws IoException {
        try {
            return UnsignedInteger
                    .valueOf(elasticSearchIndex.countModels(logger, Markers.GET_OBJECT_COUNT).longValue());
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting object count");
        }
    }

    @Override
    public UnsignedInteger getObjectCountByCollectionId(final CollectionId collectionId) throws IoException {
        try {
            return UnsignedInteger
                    .valueOf(
                            elasticSearchIndex
                                    .countModels(logger, Markers.GET_OBJECT_COUNT_BY_COLLECTION_ID,
                                            elasticSearchIndex.prepareCountModels()
                                                    .setQuery(QueryBuilders.filteredQuery(QueryBuilders.matchAllQuery(),
                                                            FilterBuilders.termFilter(
                                                                    Object.FieldMetadata.COLLECTION_ID
                                                                            .getThriftProtocolKey(),
                                                                    collectionId.toString()))))
                                    .longValue());
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting object count by collection id");
        }
    }

    @Override
    public UnsignedInteger getObjectCountByInstitutionId(final InstitutionId institutionId) throws IoException {
        try {
            return UnsignedInteger
                    .valueOf(
                            elasticSearchIndex
                                    .countModels(logger, Markers.GET_OBJECT_COUNT_BY_INSTITUTION_ID,
                                            elasticSearchIndex.prepareCountModels()
                                                    .setQuery(QueryBuilders.filteredQuery(QueryBuilders.matchAllQuery(),
                                                            FilterBuilders.termFilter(
                                                                    Object.FieldMetadata.INSTITUTION_ID
                                                                            .getThriftProtocolKey(),
                                                                    institutionId.toString()))))
                                    .longValue());
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting object count by collection id");
        }
    }

    @Override
    public ImmutableList<ObjectEntry> getObjects(final UnsignedInteger from, final UnsignedInteger size)
            throws IoException {
        try {
            return elasticSearchIndex.getModels(logger, Markers.GET_OBJECTS_BY_COLLECTION_ID,
                    ObjectElasticSearchModelFactory.getInstance(), elasticSearchIndex.prepareSearchModels()
                            .setFrom(from.intValue()).setQuery(QueryBuilders.matchAllQuery()).setSize(size.intValue()));
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting objects by collection id");
        }
    }

    @Override
    public ImmutableList<ObjectEntry> getObjectsByCollectionId(final CollectionId collectionId,
            final UnsignedInteger from, final UnsignedInteger size) throws IoException {
        try {
            return elasticSearchIndex
                    .getModels(logger, Markers.GET_OBJECTS_BY_COLLECTION_ID,
                            ObjectElasticSearchModelFactory.getInstance(),
                            elasticSearchIndex.prepareSearchModels().setFrom(from.intValue())
                                    .setQuery(QueryBuilders.filteredQuery(QueryBuilders.matchAllQuery(),
                                            FilterBuilders.termFilter(
                                                    Object.FieldMetadata.COLLECTION_ID.getThriftProtocolKey(),
                                                    collectionId.toString())))
                                    .setSize(size.intValue()));
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting objects by collection id");
        }
    }

    @Override
    public ImmutableList<ObjectEntry> getObjectsByInstitutionId(final InstitutionId institutionId,
            final UnsignedInteger from, final UnsignedInteger size) throws IoException {
        try {
            return elasticSearchIndex.getModels(logger, Markers.GET_OBJECTS_BY_INSTITUTION_ID,
                    ObjectElasticSearchModelFactory.getInstance(),
                    elasticSearchIndex.prepareSearchModels()
                            .setQuery(QueryBuilders.filteredQuery(QueryBuilders.matchAllQuery(),
                                    FilterBuilders.termFilter(
                                            Object.FieldMetadata.INSTITUTION_ID.getThriftProtocolKey(),
                                            institutionId.toString())))
                            .setSize(Integer.MAX_VALUE));
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting objects by institution id");
        }
    }

    private final ObjectElasticSearchIndex elasticSearchIndex;
    private final static Logger logger = LoggerFactory.getLogger(ElasticSearchObjectQueryService.class);
}
