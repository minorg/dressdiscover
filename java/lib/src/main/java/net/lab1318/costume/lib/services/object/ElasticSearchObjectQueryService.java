package net.lab1318.costume.lib.services.object;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.common.bytes.BytesReference;
import org.elasticsearch.index.query.AndFilterBuilder;
import org.elasticsearch.index.query.FilterBuilder;
import org.elasticsearch.index.query.FilterBuilders;
import org.elasticsearch.index.query.MoreLikeThisQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.indices.IndexMissingException;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.aggregations.AggregationBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.bucket.terms.StringTerms;
import org.elasticsearch.search.aggregations.bucket.terms.Terms.Bucket;
import org.elasticsearch.search.aggregations.bucket.terms.TermsBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.notaweb.lib.protocols.ElasticSearchInputProtocol;
import org.notaweb.lib.stores.ElasticSearchIndex;
import org.notaweb.lib.stores.InvalidModelException;
import org.notaweb.lib.stores.NoSuchModelException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thryft.protocol.InputProtocolException;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.UnsignedInteger;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.collection.InvalidCollectionIdException;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.institution.InvalidInstitutionIdException;
import net.lab1318.costume.api.models.object.InvalidObjectIdException;
import net.lab1318.costume.api.models.object.Object;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.models.subject.Subject;
import net.lab1318.costume.api.models.subject.SubjectSet;
import net.lab1318.costume.api.models.subject.SubjectTerm;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.object.GetObjectsOptions;
import net.lab1318.costume.api.services.object.NoSuchObjectException;
import net.lab1318.costume.api.services.object.ObjectFacets;
import net.lab1318.costume.api.services.object.ObjectQueryService;
import net.lab1318.costume.api.services.object.ObjectSort;
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
    public UnsignedInteger getObjectCount(final Optional<ObjectQuery> query) throws IoException {
        try {
            return UnsignedInteger
                    .valueOf(elasticSearchIndex
                            .countModels(logger, Markers.GET_OBJECT_COUNT,
                                    elasticSearchIndex.prepareCountModels().setQuery(__translateQuery(query)))
                            .longValue());
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting object count");
        }
    }

    @Override
    public ObjectFacets getObjectFacets(final Optional<ObjectQuery> query) throws IoException {
        final SearchRequestBuilder searchRequestBuilder = elasticSearchIndex.prepareSearchModels()
                .setQuery(__translateQuery(query)).setFrom(0).setSize(0);
        for (final AggregationBuilder<?> aggregation : AGGREGATIONS) {
            searchRequestBuilder.addAggregation(aggregation);
        }

        SearchResponse searchResponse;
        try {
            searchResponse = elasticSearchIndex.getModels(logger, Markers.GET_OBJECTS, searchRequestBuilder);
        } catch (final IndexMissingException e) {
            logger.warn(Markers.GET_OBJECTS, "objects index does not exist, returning empty results");
            return EMPTY_OBJECT_FACETS;
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting objects");
        }

        final ObjectFacets.Builder resultBuilder = ObjectFacets.builder();

        {
            final ImmutableMap.Builder<CollectionId, UnsignedInteger> collectionHitsBuilder = ImmutableMap.builder();
            for (final Bucket bucket : ((StringTerms) searchResponse.getAggregations()
                    .get(COLLECTION_HITS_AGGREGATION.getName())).getBuckets()) {
                try {
                    collectionHitsBuilder.put(CollectionId.parse(bucket.getKey()),
                            UnsignedInteger.valueOf(bucket.getDocCount()));
                } catch (final InvalidCollectionIdException e) {
                    throw new IllegalStateException(e);
                }
            }
            resultBuilder.setCollectionHits(collectionHitsBuilder.build());
        }

        {
            final ImmutableMap.Builder<InstitutionId, UnsignedInteger> institutionHitsBuilder = ImmutableMap.builder();
            for (final Bucket bucket : ((StringTerms) searchResponse.getAggregations()
                    .get(INSTITUTION_HITS_AGGREGATION.getName())).getBuckets()) {
                try {
                    institutionHitsBuilder.put(InstitutionId.parse(bucket.getKey()),
                            UnsignedInteger.valueOf(bucket.getDocCount()));
                } catch (final InvalidInstitutionIdException e) {
                    throw new IllegalStateException(e);
                }
            }
            resultBuilder.setInstitutionHits(institutionHitsBuilder.build());
        }

		{
			final ImmutableMap.Builder<String, UnsignedInteger> subjectTermTextsBuilder = ImmutableMap.builder();
			for (final Bucket bucket : ((StringTerms) searchResponse.getAggregations()
					.get(SUBJECT_TERM_TEXTS_AGGREGATION.getName())).getBuckets()) {
				subjectTermTextsBuilder.put(bucket.getKey(),
						UnsignedInteger.valueOf(bucket.getDocCount()));
			}
			resultBuilder.setSubjectTermTexts(subjectTermTextsBuilder.build());
		}

        return resultBuilder.build();
    }

    @Override
    public ImmutableList<ObjectEntry> getObjects(final GetObjectsOptions options, final Optional<ObjectQuery> query)
            throws IoException {
        final SearchRequestBuilder searchRequestBuilder = elasticSearchIndex.prepareSearchModels()
                .setQuery(__translateQuery(query)).setFrom(options.getFrom().intValue())
                .setSize(options.getSize().intValue());
        if (options.getSorts().isPresent()) {
            for (final ObjectSort sort : options.getSorts().get()) {
                searchRequestBuilder.addSort(SortBuilders
                        .fieldSort(Object.FieldMetadata.valueOfThriftName(sort.getField().name().toLowerCase())
                                .getThriftProtocolKey())
                        .order(sort.getOrder() == net.lab1318.costume.api.models.SortOrder.ASC ? SortOrder.ASC
                                : SortOrder.DESC));
            }
        }

        SearchResponse searchResponse;
        try {
            searchResponse = elasticSearchIndex.getModels(logger, Markers.GET_OBJECTS, searchRequestBuilder);
        } catch (final IndexMissingException e) {
            logger.warn(Markers.GET_OBJECTS, "objects index does not exist, returning empty results");
            return ImmutableList.of();
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting objects");
        }

        final ImmutableList.Builder<ObjectEntry> resultBuilder = ImmutableList.builder();
        for (final SearchHit searchHit : searchResponse.getHits().getHits()) {
            try {
                resultBuilder.add(ObjectElasticSearchModelFactory.getInstance()
                        .createModelEntryFromSource(searchHit.getId(), searchHit.getSourceRef()));
            } catch (final InvalidModelException e) {
                logger.warn(Markers.GET_OBJECTS, "invalid object from inedx {}", e.getId());
                continue;
            }
        }
        return resultBuilder.build();
    }

    private QueryBuilder __translateQuery(final Optional<ObjectQuery> query) {
        if (!query.isPresent()) {
            return QueryBuilders.matchAllQuery();
        }

        QueryBuilder queryTranslated;
        if (query.get().getQueryString().isPresent()) {
            queryTranslated = QueryBuilders.queryStringQuery(query.get().getQueryString().get())
                    .field(Object.FieldMetadata.DATE_TEXT.getThriftProtocolKey())
                    .field(Object.FieldMetadata.DESCRIPTION.getThriftProtocolKey())
                    .field(Object.FieldMetadata.PHYSICAL_DESCRIPTION.getThriftProtocolKey())
                    .field(Object.FieldMetadata.SUMMARY.getThriftProtocolKey())
                    .field(Object.FieldMetadata.TITLE.getThriftProtocolKey());
        } else if (query.get().getMoreLikeObjectId().isPresent()) {
            queryTranslated = QueryBuilders
                    .moreLikeThisQuery(Object.FieldMetadata.CATEGORIES.getThriftProtocolKey(),
                            Object.FieldMetadata.DESCRIPTION.getThriftProtocolKey(),
                            Object.FieldMetadata.TITLE.getThriftProtocolKey())
                    .docs(new MoreLikeThisQueryBuilder.Item(elasticSearchIndex.getIndexName(),
                            elasticSearchIndex.getDocumentType(), query.get().getMoreLikeObjectId().get().toString()));
        } else {
            queryTranslated = QueryBuilders.matchAllQuery();
        }

        final List<FilterBuilder> filters = new ArrayList<>();

        if (query.get().getIncludeCollectionId().isPresent()) {
            filters.add(FilterBuilders.termFilter(Object.FieldMetadata.COLLECTION_ID.getThriftProtocolKey(),
                    query.get().getIncludeCollectionId().get().toString()));
        }

        if (query.get().getIncludeInstitutionId().isPresent()) {
            filters.add(FilterBuilders.termFilter(Object.FieldMetadata.INSTITUTION_ID.getThriftProtocolKey(),
                    query.get().getIncludeInstitutionId().get().toString()));
        }

        if (filters.size() == 1) {
            queryTranslated = QueryBuilders.filteredQuery(queryTranslated, filters.get(0));
        } else if (filters.size() > 1) {
            AndFilterBuilder andFilter = FilterBuilders.andFilter();
            for (final FilterBuilder filter : filters) {
                andFilter = andFilter.add(filter);
            }
            queryTranslated = QueryBuilders.filteredQuery(queryTranslated, andFilter);
        }

        return queryTranslated;
    }

    private final ObjectElasticSearchIndex elasticSearchIndex;
    private final static TermsBuilder COLLECTION_HITS_AGGREGATION = AggregationBuilders
            .terms(ObjectFacets.FieldMetadata.COLLECTION_HITS.getThriftName())
            .field(Object.FieldMetadata.COLLECTION_ID.getThriftProtocolKey());
    private final static ObjectFacets EMPTY_OBJECT_FACETS = ObjectFacets.builder().setCollectionHits(ImmutableMap.of())
			.setInstitutionHits(ImmutableMap.of()).setSubjectTermTexts(ImmutableMap.of()).build();
    private final static TermsBuilder INSTITUTION_HITS_AGGREGATION = AggregationBuilders
            .terms(ObjectFacets.FieldMetadata.INSTITUTION_HITS.getThriftName())
            .field(Object.FieldMetadata.INSTITUTION_ID.getThriftProtocolKey());
	private final static TermsBuilder SUBJECT_TERM_TEXTS_AGGREGATION = AggregationBuilders
			.terms(ObjectFacets.FieldMetadata.SUBJECT_TERM_TEXTS.getThriftName())
			.field(Object.FieldMetadata.SUBJECTS.getThriftProtocolKey() + '.'
					+ SubjectSet.FieldMetadata.SUBJECTS.getThriftProtocolKey() + '.'
					+ Subject.FieldMetadata.TERMS.getThriftProtocolKey() + '.'
					+ SubjectTerm.FieldMetadata.TEXT.getThriftProtocolKey());
    private final static ImmutableList<AggregationBuilder<?>> AGGREGATIONS = ImmutableList
			.of(COLLECTION_HITS_AGGREGATION, INSTITUTION_HITS_AGGREGATION, SUBJECT_TERM_TEXTS_AGGREGATION);
    private final static Logger logger = LoggerFactory.getLogger(ElasticSearchObjectQueryService.class);
}
