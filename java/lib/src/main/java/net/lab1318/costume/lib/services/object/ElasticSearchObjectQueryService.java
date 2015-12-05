package net.lab1318.costume.lib.services.object;

import static com.google.common.base.Preconditions.checkArgument;
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
import org.elasticsearch.search.aggregations.AbstractAggregationBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.bucket.nested.Nested;
import org.elasticsearch.search.aggregations.bucket.nested.NestedBuilder;
import org.elasticsearch.search.aggregations.bucket.terms.StringTerms;
import org.elasticsearch.search.aggregations.bucket.terms.Terms.Bucket;
import org.elasticsearch.search.aggregations.bucket.terms.TermsBuilder;
import org.elasticsearch.search.aggregations.metrics.valuecount.ValueCount;
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
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.UnsignedInteger;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.agent.Agent;
import net.lab1318.costume.api.models.agent.AgentName;
import net.lab1318.costume.api.models.agent.AgentSet;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.collection.InvalidCollectionIdException;
import net.lab1318.costume.api.models.image.Image;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.institution.InvalidInstitutionIdException;
import net.lab1318.costume.api.models.object.InvalidObjectIdException;
import net.lab1318.costume.api.models.object.Object;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.models.object.ObjectFilters;
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

	private static FilterBuilder __excludeAllFilters(final List<FilterBuilder> filters) {
		checkArgument(!filters.isEmpty());
		final FilterBuilder[] filtersArray = new FilterBuilder[filters.size()];
		for (int filterI = 0; filterI < filters.size(); filterI++) {
			filtersArray[filterI] = FilterBuilders.notFilter(filters.get(filterI));
		}
		// !match AND !match AND !match
		if (filtersArray.length == 1) {
			return filtersArray[0];
		} else {
			return FilterBuilders.andFilter(filtersArray);
		}
	}

	private static FilterBuilder __includeAnyFilter(final List<FilterBuilder> filters) {
		checkArgument(!filters.isEmpty());
		if (filters.size() == 1) {
			return filters.get(0);
		}
		final FilterBuilder[] filtersArray = new FilterBuilder[filters.size()];
		filters.toArray(filtersArray);
		// match OR match OR match
		return FilterBuilders.orFilter(filtersArray);
	}

	@Inject
	public ElasticSearchObjectQueryService(final ObjectElasticSearchIndex elasticSearchIndex) {
		this.elasticSearchIndex = checkNotNull(elasticSearchIndex);

		{
			final TermsBuilder agentNameTextAggregation = AggregationBuilders
					.terms(AgentName.FieldMetadata.TEXT.getThriftName())
					.field(Object.FieldMetadata.AGENTS.getThriftProtocolKey() + '.'
							+ AgentSet.FieldMetadata.AGENTS.getThriftProtocolKey() + '.'
							+ Agent.FieldMetadata.NAME.getThriftProtocolKey() + '.'
							+ AgentName.FieldMetadata.TEXT.getThriftProtocolKey() + ".not_analyzed");
			final NestedBuilder agentNameAggregation = AggregationBuilders
					.nested(Agent.FieldMetadata.NAME.getThriftName())
					.path(Object.FieldMetadata.AGENTS.getThriftProtocolKey() + '.'
							+ AgentSet.FieldMetadata.AGENTS.getThriftProtocolKey() + '.'
							+ Agent.FieldMetadata.NAME.getThriftProtocolKey())
					.subAggregation(agentNameTextAggregation);
			final NestedBuilder agentSetAgentsAggregation = AggregationBuilders
					.nested(AgentSet.FieldMetadata.AGENTS.getThriftName())
					.path(Object.FieldMetadata.AGENTS.getThriftProtocolKey() + '.'
							+ AgentSet.FieldMetadata.AGENTS.getThriftProtocolKey())
					.subAggregation(agentNameAggregation);
			final NestedBuilder objectAgentsAggregation = AggregationBuilders
					.nested(Object.FieldMetadata.AGENTS.getThriftName())
					.path(Object.FieldMetadata.AGENTS.getThriftProtocolKey()).subAggregation(agentSetAgentsAggregation);
			this.agentNameTextsAggregation = objectAgentsAggregation;
		}

		categoriesAggregation = AggregationBuilders.terms(ObjectFacets.FieldMetadata.CATEGORIES.getThriftName())
				.field(Object.FieldMetadata.CATEGORIES.getThriftProtocolKey() + ".not_analyzed");

		collectionHitsAggregation = AggregationBuilders
				.terms(ObjectFacets.FieldMetadata.COLLECTION_HITS.getThriftName())
				.field(Object.FieldMetadata.COLLECTION_ID.getThriftProtocolKey());

		emptyObjectFacets = ObjectFacets.builder().setAgentNameTexts(ImmutableMap.of()).setCategories(ImmutableMap.of())
				.setCollectionHits(ImmutableMap.of()).setInstitutionHits(ImmutableMap.of())
				.setSubjectTermTexts(ImmutableMap.of()).build();

		institutionHitsAggregation = AggregationBuilders
				.terms(ObjectFacets.FieldMetadata.INSTITUTION_HITS.getThriftName())
				.field(Object.FieldMetadata.INSTITUTION_ID.getThriftProtocolKey());

		{
			final TermsBuilder subjectTermTextAggregation = AggregationBuilders
					.terms(SubjectTerm.FieldMetadata.TEXT.getThriftName())
					.field(Object.FieldMetadata.SUBJECTS.getThriftProtocolKey() + '.'
							+ SubjectSet.FieldMetadata.SUBJECTS.getThriftProtocolKey() + '.'
							+ Subject.FieldMetadata.TERMS.getThriftProtocolKey() + '.'
							+ SubjectTerm.FieldMetadata.TEXT.getThriftProtocolKey() + ".not_analyzed");
			final NestedBuilder subjectTermsAggregation = AggregationBuilders
					.nested(Subject.FieldMetadata.TERMS.getThriftName())
					.path(Object.FieldMetadata.SUBJECTS.getThriftProtocolKey() + '.'
							+ SubjectSet.FieldMetadata.SUBJECTS.getThriftProtocolKey() + '.'
							+ Subject.FieldMetadata.TERMS.getThriftProtocolKey())
					.subAggregation(subjectTermTextAggregation);
			final NestedBuilder subjectSetSubjectsAggregation = AggregationBuilders
					.nested(SubjectSet.FieldMetadata.SUBJECTS.getThriftName())
					.path(Object.FieldMetadata.SUBJECTS.getThriftProtocolKey() + '.'
							+ SubjectSet.FieldMetadata.SUBJECTS.getThriftProtocolKey())
					.subAggregation(subjectTermsAggregation);
			final NestedBuilder objectSubjectsAggregation = AggregationBuilders
					.nested(Object.FieldMetadata.SUBJECTS.getThriftName())
					.path(Object.FieldMetadata.SUBJECTS.getThriftProtocolKey())
					.subAggregation(subjectSetSubjectsAggregation);
			subjectTermTextsAggregation = objectSubjectsAggregation;
		}

		{
			thumbnailExistsAggregation = AggregationBuilders
					.nested(ObjectFacets.FieldMetadata.THUMBNAIL_EXISTS.getThriftName())
					.path(Object.FieldMetadata.THUMBNAIL.getThriftProtocolKey())
					.subAggregation(AggregationBuilders.count(Image.FieldMetadata.URL.getThriftName())
							.field(Image.FieldMetadata.URL.getThriftProtocolKey()));
			// thumbnailHeightMaxAggregation = AggregationBuilders
			// .nested(ObjectFacets.FieldMetadata.THUMBNAIL_HEIGHT_MAX_PX.getThriftName())
			// .path(Object.FieldMetadata.THUMBNAIL.getThriftProtocolKey())
			// .subAggregation(AggregationBuilders.max(Image.FieldMetadata.HEIGHT_PX.getThriftName())
			// .field(Image.FieldMetadata.HEIGHT_PX.getThriftProtocolKey()));
			// thumbnailWidthMaxAggregation = AggregationBuilders
			// .nested(ObjectFacets.FieldMetadata.THUMBNAIL_WIDTH_MAX_PX.getThriftName())
			// .path(Object.FieldMetadata.THUMBNAIL.getThriftProtocolKey())
			// .subAggregation(AggregationBuilders.max(Image.FieldMetadata.WIDTH_PX.getThriftName())
			// .field(Image.FieldMetadata.WIDTH_PX.getThriftProtocolKey()));
		}

		urlExistsAggregation = AggregationBuilders.count(ObjectFacets.FieldMetadata.URL_EXISTS.getThriftName())
				.field(Object.FieldMetadata.URL.getThriftProtocolKey());

		aggregations = ImmutableList.of(agentNameTextsAggregation, categoriesAggregation, collectionHitsAggregation,
				institutionHitsAggregation, subjectTermTextsAggregation, thumbnailExistsAggregation,
				urlExistsAggregation);
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
		for (final AbstractAggregationBuilder aggregation : aggregations) {
			searchRequestBuilder.addAggregation(aggregation);
		}

		SearchResponse searchResponse;
		try {
			searchResponse = elasticSearchIndex.getModels(logger, Markers.GET_OBJECTS, searchRequestBuilder);
		} catch (final IndexMissingException e) {
			logger.warn(Markers.GET_OBJECTS, "objects index does not exist, returning empty results");
			return emptyObjectFacets;
		} catch (final IOException e) {
			throw ServiceExceptionHelper.wrapException(e, "error getting objects");
		}

		final ObjectFacets.Builder resultBuilder = ObjectFacets.builder();

		{
			final ImmutableMap.Builder<String, UnsignedInteger> agentNameTextsBuilder = ImmutableMap.builder();
			final Nested agentNameTextsAggregation = searchResponse.getAggregations()
					.get(this.agentNameTextsAggregation.getName());
			final Nested objectAgentsAggregation = agentNameTextsAggregation.getAggregations()
					.get(Object.FieldMetadata.AGENTS.getThriftName());
			// final Nested subjectSetSubjectsAggregation =
			// objectSubjectsAggregation.getAggregations()
			// .get(SubjectSet.FieldMetadata.SUBJECTS.getThriftName());
			final Nested agentNameAggregation = objectAgentsAggregation.getAggregations()
					.get(Agent.FieldMetadata.NAME.getThriftName());
			final StringTerms agentNameTextAggregation = agentNameAggregation.getAggregations()
					.get(AgentName.FieldMetadata.TEXT.getThriftName());
			for (final Bucket bucket : agentNameTextAggregation.getBuckets()) {
				agentNameTextsBuilder.put(bucket.getKey(), UnsignedInteger.valueOf(bucket.getDocCount()));
			}
			resultBuilder.setAgentNameTexts(agentNameTextsBuilder.build());
		}

		{
			final ImmutableMap.Builder<String, UnsignedInteger> categoriesBuilder = ImmutableMap.builder();
			for (final Bucket bucket : ((StringTerms) searchResponse.getAggregations()
					.get(categoriesAggregation.getName())).getBuckets()) {
				categoriesBuilder.put(bucket.getKey(), UnsignedInteger.valueOf(bucket.getDocCount()));
			}
			resultBuilder.setCategories(categoriesBuilder.build());
		}

		{
			final ImmutableMap.Builder<CollectionId, UnsignedInteger> collectionHitsBuilder = ImmutableMap.builder();
			for (final Bucket bucket : ((StringTerms) searchResponse.getAggregations()
					.get(collectionHitsAggregation.getName())).getBuckets()) {
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
					.get(institutionHitsAggregation.getName())).getBuckets()) {
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
			final Nested subjectTermTextsAggregation = searchResponse.getAggregations()
					.get(this.subjectTermTextsAggregation.getName());
			final Nested objectSubjectsAggregation = subjectTermTextsAggregation.getAggregations()
					.get(Object.FieldMetadata.SUBJECTS.getThriftName());
			// final Nested subjectSetSubjectsAggregation =
			// objectSubjectsAggregation.getAggregations()
			// .get(SubjectSet.FieldMetadata.SUBJECTS.getThriftName());
			final Nested subjectTermsAggregation = objectSubjectsAggregation.getAggregations()
					.get(Subject.FieldMetadata.TERMS.getThriftName());
			final StringTerms subjectTermTextAggregation = subjectTermsAggregation.getAggregations()
					.get(SubjectTerm.FieldMetadata.TEXT.getThriftName());

			for (final Bucket bucket : subjectTermTextAggregation.getBuckets()) {
				subjectTermTextsBuilder.put(bucket.getKey(), UnsignedInteger.valueOf(bucket.getDocCount()));
			}
			resultBuilder.setSubjectTermTexts(subjectTermTextsBuilder.build());
		}

		{
			final ValueCount thumbnailExistsAggregation = ((Nested) searchResponse.getAggregations()
					.get(this.thumbnailExistsAggregation.getName())).getAggregations()
							.get(Image.FieldMetadata.URL.getThriftName());
			resultBuilder.setThumbnailExists(thumbnailExistsAggregation.getValue() > 0);

			// final Max thumbnailHeightMaxAggregation = ((Nested)
			// searchResponse.getAggregations()
			// .get(this.thumbnailHeightMaxAggregation.getName())).getAggregations()
			// .get(Image.FieldMetadata.HEIGHT_PX.getThriftName());
			// if (!Double.isInfinite(thumbnailHeightMaxAggregation.getValue()))
			// {
			// resultBuilder.setThumbnailHeightMaxPx(
			// UnsignedInteger.valueOf((int)
			// thumbnailHeightMaxAggregation.getValue()));
			// }
			//
			// final Max thumbnailWidthMaxAggregation = ((Nested)
			// searchResponse.getAggregations()
			// .get(this.thumbnailWidthMaxAggregation.getName())).getAggregations()
			// .get(Image.FieldMetadata.WIDTH_PX.getThriftName());
			// if (!Double.isInfinite(thumbnailWidthMaxAggregation.getValue()))
			// {
			// resultBuilder
			// .setThumbnailWidthMaxPx(UnsignedInteger.valueOf((int)
			// thumbnailWidthMaxAggregation.getValue()));
			// }
		}

		final ValueCount urlExistsAggregation = (ValueCount) searchResponse.getAggregations()
				.get(this.urlExistsAggregation.getName());
		resultBuilder.setUrlExists(urlExistsAggregation.getValue() > 0);

		return resultBuilder.build();
	}

	@Override
	public ImmutableList<ObjectEntry> getObjects(final Optional<GetObjectsOptions> options,
			final Optional<ObjectQuery> query) throws IoException {
		SearchRequestBuilder searchRequestBuilder = elasticSearchIndex.prepareSearchModels()
				.setQuery(__translateQuery(query));
		if (options.isPresent()) {
			if (options.get().getFrom().isPresent()) {
				searchRequestBuilder = searchRequestBuilder.setFrom(options.get().getFrom().get().intValue());
			}
			if (options.get().getSize().isPresent()) {
				searchRequestBuilder = searchRequestBuilder.setSize(options.get().getSize().get().intValue());
			}
			if (options.get().getSorts().isPresent()) {
				for (final ObjectSort sort : options.get().getSorts().get()) {
					searchRequestBuilder = searchRequestBuilder.addSort(SortBuilders
							.fieldSort(Object.FieldMetadata.valueOfThriftName(sort.getField().name().toLowerCase())
									.getThriftProtocolKey())
							.order(sort.getOrder() == net.lab1318.costume.api.models.SortOrder.ASC ? SortOrder.ASC
									: SortOrder.DESC));
				}
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
					.field(Object.FieldMetadata.CATEGORIES.getThriftProtocolKey())
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

		if (!query.get().getFilters().isPresent()) {
			return queryTranslated;
		}

		final ObjectFilters filters = query.get().getFilters().get();
		final List<FilterBuilder> filtersTranslated = new ArrayList<>();

		for (final Optional<ImmutableSet<String>> agentNameTexts : ImmutableList.of(filters.getExcludeAgentNameTexts(),
				filters.getIncludeAgentNameTexts())) {
			if (!agentNameTexts.isPresent()) {
				continue;
			}
			final List<FilterBuilder> agentNameTextFilters = new ArrayList<>();
			for (final String agentNameText : agentNameTexts.get()) {
				if (agentNameText.isEmpty()) {
					continue;
				}
				agentNameTextFilters
						.add(FilterBuilders.nestedFilter(Object.FieldMetadata.AGENTS.getThriftProtocolKey(),
								FilterBuilders.nestedFilter(
										Object.FieldMetadata.AGENTS.getThriftProtocolKey() + '.'
												+ AgentSet.FieldMetadata.AGENTS.getThriftProtocolKey(),
										FilterBuilders.nestedFilter(
												Object.FieldMetadata.AGENTS.getThriftProtocolKey() + '.'
														+ AgentSet.FieldMetadata.AGENTS.getThriftProtocolKey() + '.'
														+ Agent.FieldMetadata.NAME
																.getThriftProtocolKey(),
										FilterBuilders.termFilter(Object.FieldMetadata.AGENTS.getThriftProtocolKey()
												+ '.' + AgentSet.FieldMetadata.AGENTS.getThriftProtocolKey() + '.'
												+ Agent.FieldMetadata.NAME.getThriftProtocolKey() + '.'
												+ AgentName.FieldMetadata.TEXT.getThriftProtocolKey() + ".not_analyzed",
												agentNameText)))));
			}
			if (!agentNameTextFilters.isEmpty()) {
				if (agentNameTexts == filters.getExcludeAgentNameTexts()) {
					filtersTranslated.add(__excludeAllFilters(agentNameTextFilters));
				} else {
					filtersTranslated.add(__includeAnyFilter(agentNameTextFilters));
				}
			}
		}

		for (final Optional<ImmutableSet<String>> categories : ImmutableList.of(filters.getExcludeCategories(),
				filters.getIncludeCategories())) {
			if (!categories.isPresent()) {
				continue;
			}
			final List<FilterBuilder> categoryFilters = new ArrayList<>();
			for (final String category : categories.get()) {
				if (category.isEmpty()) {
					continue;
				}
				categoryFilters.add(FilterBuilders.termFilter(
						Object.FieldMetadata.CATEGORIES.getThriftProtocolKey() + ".not_analyzed", category));
			}
			if (!categoryFilters.isEmpty()) {
				if (categories == filters.getExcludeCategories()) {
					filtersTranslated.add(__excludeAllFilters(categoryFilters));
				} else {
					filtersTranslated.add(__includeAnyFilter(categoryFilters));
				}
			}
		}

		for (final Optional<ImmutableSet<CollectionId>> collectionIds : ImmutableList
				.of(filters.getExcludeCollectionIds(), filters.getIncludeCollectionIds())) {
			if (!collectionIds.isPresent()) {
				continue;
			}
			final List<FilterBuilder> collectionIdFilters = new ArrayList<>();
			for (final CollectionId collectionId : collectionIds.get()) {
				collectionIdFilters.add(FilterBuilders.termFilter(
						Object.FieldMetadata.COLLECTION_ID.getThriftProtocolKey(), collectionId.toString()));
			}
			if (!collectionIdFilters.isEmpty()) {
				if (collectionIds == filters.getExcludeCollectionIds()) {
					filtersTranslated.add(__excludeAllFilters(collectionIdFilters));
				} else {
					filtersTranslated.add(__includeAnyFilter(collectionIdFilters));
				}
			}
		}

		for (final Optional<ImmutableSet<InstitutionId>> institutionIds : ImmutableList
				.of(filters.getExcludeInstitutionIds(), filters.getIncludeInstitutionIds())) {
			if (!institutionIds.isPresent()) {
				continue;
			}
			final List<FilterBuilder> institutionIdFilters = new ArrayList<>();
			for (final InstitutionId institutionId : institutionIds.get()) {
				institutionIdFilters.add(FilterBuilders.termFilter(
						Object.FieldMetadata.INSTITUTION_ID.getThriftProtocolKey(), institutionId.toString()));
			}
			if (!institutionIdFilters.isEmpty()) {
				if (institutionIds == filters.getExcludeInstitutionIds()) {
					filtersTranslated.add(__excludeAllFilters(institutionIdFilters));
				} else {
					filtersTranslated.add(__includeAnyFilter(institutionIdFilters));
				}
			}
		}

		for (final Optional<ImmutableSet<String>> subjectTermTexts : ImmutableList
				.of(filters.getExcludeSubjectTermTexts(), filters.getIncludeSubjectTermTexts())) {
			if (!subjectTermTexts.isPresent()) {
				continue;
			}
			final List<FilterBuilder> subjectTermTextFilters = new ArrayList<>();
			for (final String subjectTermText : subjectTermTexts.get()) {
				if (subjectTermText.isEmpty()) {
					continue;
				}
				subjectTermTextFilters
						.add(FilterBuilders.nestedFilter(Object.FieldMetadata.SUBJECTS.getThriftProtocolKey(),
								FilterBuilders.nestedFilter(Object.FieldMetadata.SUBJECTS.getThriftProtocolKey() + '.'
										+ SubjectSet.FieldMetadata.SUBJECTS.getThriftProtocolKey(),
								FilterBuilders.nestedFilter(
										Object.FieldMetadata.SUBJECTS.getThriftProtocolKey() + '.'
												+ SubjectSet.FieldMetadata.SUBJECTS.getThriftProtocolKey() + '.'
												+ Subject.FieldMetadata.TERMS.getThriftProtocolKey(),
										FilterBuilders.termFilter(Object.FieldMetadata.SUBJECTS.getThriftProtocolKey()
												+ '.' + SubjectSet.FieldMetadata.SUBJECTS.getThriftProtocolKey() + '.'
												+ Subject.FieldMetadata.TERMS.getThriftProtocolKey() + '.'
												+ SubjectTerm.FieldMetadata.TEXT.getThriftProtocolKey()
												+ ".not_analyzed", subjectTermText)))));
			}
			if (!subjectTermTextFilters.isEmpty()) {
				if (subjectTermTexts == filters.getExcludeSubjectTermTexts()) {
					filtersTranslated.add(__excludeAllFilters(subjectTermTextFilters));
				} else {
					filtersTranslated.add(__includeAnyFilter(subjectTermTextFilters));
				}
			}
		}

		if (filtersTranslated.size() == 1) {
			queryTranslated = QueryBuilders.filteredQuery(queryTranslated, filtersTranslated.get(0));
		} else if (filtersTranslated.size() > 1) {
			AndFilterBuilder andFilter = FilterBuilders.andFilter();
			for (final FilterBuilder filter : filtersTranslated) {
				andFilter = andFilter.add(filter);
			}
			queryTranslated = QueryBuilders.filteredQuery(queryTranslated, andFilter);
		}

		return queryTranslated;
	}

	private final ObjectElasticSearchIndex elasticSearchIndex;
	private final AggregationBuilder<?> agentNameTextsAggregation;
	private final ImmutableList<AbstractAggregationBuilder> aggregations;
	private final TermsBuilder categoriesAggregation;
	private final TermsBuilder collectionHitsAggregation;
	private final ObjectFacets emptyObjectFacets;
	private final TermsBuilder institutionHitsAggregation;
	private final AggregationBuilder<?> subjectTermTextsAggregation;
	private final AggregationBuilder<?> thumbnailExistsAggregation;
	// private final AggregationBuilder<?> thumbnailHeightMaxAggregation;
	// private final AggregationBuilder<?> thumbnailWidthMaxAggregation;
	private final AbstractAggregationBuilder urlExistsAggregation;
	private final static Logger logger = LoggerFactory.getLogger(ElasticSearchObjectQueryService.class);
}
