package net.lab1318.costume.lib.services.collection;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.elasticsearch.common.bytes.BytesReference;
import org.elasticsearch.index.query.QueryBuilders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thryft.protocol.InputProtocolException;
import org.thryft.waf.lib.protocols.ElasticSearchInputProtocol;
import org.thryft.waf.lib.stores.ElasticSearchIndex;
import org.thryft.waf.lib.stores.InvalidModelException;
import org.thryft.waf.lib.stores.NoSuchModelException;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.collection.InvalidCollectionIdException;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.collection.NoSuchCollectionException;
import net.lab1318.costume.lib.services.ServiceExceptionHelper;
import net.lab1318.costume.lib.services.collection.LoggingCollectionQueryService.Markers;
import net.lab1318.costume.lib.stores.collection.CollectionElasticSearchIndex;

@Singleton
public class ElasticSearchCollectionQueryService implements CollectionQueryService {
    private final static class CollectionElasticSearchModelFactory
            implements ElasticSearchIndex.ModelFactory<CollectionEntry> {
        public static CollectionElasticSearchModelFactory getInstance() {
            return instance;
        }

        private CollectionElasticSearchModelFactory() {
        }

        @Override
        public CollectionEntry createModelEntryFromFields(final String id, final Map<String, List<?>> fields)
                throws InvalidModelException {
            throw new UnsupportedOperationException();
        }

        @Override
        public CollectionEntry createModelEntryFromSource(final String id, final BytesReference document)
                throws InvalidModelException {
            try {
                return new CollectionEntry(CollectionId.parse(id),
                        Collection.readAsStruct(new ElasticSearchInputProtocol(document)));
            } catch (final InputProtocolException | InvalidCollectionIdException e) {
                throw new InvalidModelException(id, ServiceExceptionHelper.combineMessages(e,
                        "error deserializing model document from ElasticSearch"), e);
            }
        }

        private final static CollectionElasticSearchModelFactory instance = new CollectionElasticSearchModelFactory();
    }

    @Inject
    public ElasticSearchCollectionQueryService(final CollectionElasticSearchIndex elasticSearchIndex) {
        this.elasticSearchIndex = checkNotNull(elasticSearchIndex);
    }

    @Override
    public Collection getCollectionById(final CollectionId id) throws IoException, NoSuchCollectionException {
        try {
            return elasticSearchIndex.getModelById(id, Optional.absent(), logger, Markers.GET_COLLECTION_BY_ID,
                    CollectionElasticSearchModelFactory.getInstance());
        } catch (final InvalidModelException e) {
            logger.warn(Markers.GET_COLLECTION_BY_ID, "invalid collection model {}: ", id, e);
            throw new NoSuchCollectionException();
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting collection" + id);
        } catch (final NoSuchModelException e) {
            throw new NoSuchCollectionException();
        }
    }

    @Override
    public ImmutableList<CollectionEntry> getCollections() throws IoException {
        try {
            return elasticSearchIndex.getModels(logger, Markers.GET_COLLECTIONS,
                    CollectionElasticSearchModelFactory.getInstance(),
                    elasticSearchIndex.prepareSearchModels().setQuery(QueryBuilders.matchAllQuery())
                            .setSize(ElasticSearchIndex.SEARCH_REQUEST_SIZE_MAX));
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting collections");
        }
    }

    @Override
    public ImmutableList<Collection> getCollectionsByIds(final ImmutableList<CollectionId> ids)
            throws IoException, NoSuchCollectionException {
        if (ids.isEmpty()) {
            return ImmutableList.of();
        }
        try {
            final ImmutableList<CollectionEntry> collectionEntries = elasticSearchIndex.getModelsByIds(ids, logger,
                    Markers.GET_COLLECTIONS_BY_IDS, CollectionElasticSearchModelFactory.getInstance());
            final ImmutableList.Builder<Collection> collectionsBuilder = ImmutableList.builder();
            for (int i = 0; i < ids.size(); i++) {
                final CollectionId id = ids.get(i);
                if (i >= collectionEntries.size()) {
                    throw new NoSuchCollectionException(id);
                }
                final CollectionEntry collectionEntry = collectionEntries.get(i);
                if (!id.equals(collectionEntry.getId())) {
                    throw new NoSuchCollectionException(id);
                }
                collectionsBuilder.add(collectionEntry.getModel());
            }
            return collectionsBuilder.build();
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting collections");
        }
    }

    @Override
    public ImmutableList<CollectionEntry> getCollectionsByInstitutionId(final InstitutionId institutionId)
            throws IoException {
        try {
            return elasticSearchIndex.getModels(logger, Markers.GET_COLLECTIONS_BY_INSTITUTION_ID,
                    CollectionElasticSearchModelFactory.getInstance(),
                    elasticSearchIndex.prepareSearchModels()
                            .setQuery(QueryBuilders.boolQuery()
                                    .filter(QueryBuilders.termQuery(
                                            Collection.FieldMetadata.INSTITUTION_ID.getThriftProtocolKey(),
                                            institutionId.toString())))
                            .setSize(ElasticSearchIndex.SEARCH_REQUEST_SIZE_MAX));
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting collections");
        }
    }

    private final CollectionElasticSearchIndex elasticSearchIndex;
    private final static Logger logger = LoggerFactory.getLogger(ElasticSearchCollectionQueryService.class);
}
