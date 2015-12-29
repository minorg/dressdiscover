package net.lab1318.costume.lib.services.object;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

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
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.Aggregations;
import org.elasticsearch.search.aggregations.bucket.terms.StringTerms;
import org.elasticsearch.search.aggregations.bucket.terms.Terms.Bucket;
import org.elasticsearch.search.aggregations.bucket.terms.TermsBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.thryft.protocol.InputProtocolException;
import org.thryft.waf.lib.protocols.ElasticSearchInputProtocol;
import org.thryft.waf.lib.stores.ElasticSearchIndex;
import org.thryft.waf.lib.stores.InvalidModelException;
import org.thryft.waf.lib.stores.NoSuchModelException;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.ForwardingList;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.UnsignedInteger;
import com.google.common.primitives.UnsignedLong;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.collection.InvalidCollectionIdException;
import net.lab1318.costume.api.models.gender.Gender;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.institution.InvalidInstitutionIdException;
import net.lab1318.costume.api.models.object.InvalidObjectIdException;
import net.lab1318.costume.api.models.object.Object;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.models.object.ObjectSummary;
import net.lab1318.costume.api.models.object.ObjectSummaryEntry;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.object.GetObjectSummariesOptions;
import net.lab1318.costume.api.services.object.NoSuchObjectException;
import net.lab1318.costume.api.services.object.ObjectFacetFilters;
import net.lab1318.costume.api.services.object.ObjectFacets;
import net.lab1318.costume.api.services.object.ObjectQuery;
import net.lab1318.costume.api.services.object.ObjectQueryService;
import net.lab1318.costume.api.services.object.ObjectSummarySort;
import net.lab1318.costume.lib.services.ServiceExceptionHelper;
import net.lab1318.costume.lib.services.object.LoggingObjectQueryService.Markers;
import net.lab1318.costume.lib.stores.object.ObjectElasticSearchIndex;
import net.lab1318.costume.lib.stores.object.ObjectSummaryElasticSearchIndex;

@Singleton
public class ElasticSearchObjectQueryService implements ObjectQueryService {
    public final static class ObjectElasticSearchModelFactory implements ElasticSearchIndex.ModelFactory<ObjectEntry> {
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

    public final static class ObjectSummaryElasticSearchModelFactory
            implements ElasticSearchIndex.ModelFactory<ObjectSummaryEntry> {
        public static ObjectSummaryElasticSearchModelFactory getInstance() {
            return instance;
        }

        private ObjectSummaryElasticSearchModelFactory() {
        }

        @Override
        public ObjectSummaryEntry createModelEntryFromFields(final String id, final Map<String, List<?>> fields)
                throws InvalidModelException {
            throw new UnsupportedOperationException();
        }

        @Override
        public ObjectSummaryEntry createModelEntryFromSource(final String id, final BytesReference document)
                throws InvalidModelException {
            try {
                return new ObjectSummaryEntry(ObjectId.parse(id),
                        ObjectSummary.readAsStruct(new ElasticSearchInputProtocol(document)));
            } catch (final InputProtocolException | InvalidObjectIdException e) {
                throw new InvalidModelException(id, ServiceExceptionHelper.combineMessages(e,
                        "error deserializing model document from ElasticSearch"), e);
            }
        }

        private final static ObjectSummaryElasticSearchModelFactory instance = new ObjectSummaryElasticSearchModelFactory();
    }

    private final static class ObjectFacetAggregations extends ForwardingList<AbstractAggregationBuilder> {
        private ObjectFacetAggregations() {
            aggregations = ImmutableList.<AbstractAggregationBuilder> of(
                    __newTextsAggregation(ObjectSummary.FieldMetadata.AGENT_NAME_TEXTS),
                    __newTextsAggregation(ObjectSummary.FieldMetadata.CATEGORIES),
                    __newIdAggregation(ObjectSummary.FieldMetadata.COLLECTION_ID),
                    __newTextsAggregation(ObjectSummary.FieldMetadata.COLOR_TEXTS),
                    __newIdAggregation(ObjectSummary.FieldMetadata.GENDER),
                    __newIdAggregation(ObjectSummary.FieldMetadata.INSTITUTION_ID),
                    __newTextsAggregation(ObjectSummary.FieldMetadata.MATERIAL_TEXTS),
                    __newTextsAggregation(ObjectSummary.FieldMetadata.SUBJECT_TERM_TEXTS),
                    __newTextsAggregation(ObjectSummary.FieldMetadata.TECHNIQUE_TEXTS),
                    __newTextsAggregation(ObjectSummary.FieldMetadata.WORK_TYPE_TEXTS));
        }

        public ObjectFacets getObjectFacets(final Aggregations aggregations) {
            final ObjectFacets.Builder resultBuilder = ObjectFacets.builder();

            resultBuilder
                    .setAgentNameTexts(__getTextsFacet(aggregations, ObjectSummary.FieldMetadata.AGENT_NAME_TEXTS));

            resultBuilder.setCategories(__getTextsFacet(aggregations, ObjectSummary.FieldMetadata.CATEGORIES));

            resultBuilder.setCollections(__getIdFacet(aggregations, ObjectSummary.FieldMetadata.COLLECTION_ID,
                    new Function<String, CollectionId>() {
                        @Override
                        public CollectionId apply(final String input) {
                            try {
                                return CollectionId.parse(input);
                            } catch (final InvalidCollectionIdException e) {
                                throw new IllegalStateException(e);
                            }
                        }
                    }));

            resultBuilder.setColorTexts(__getTextsFacet(aggregations, ObjectSummary.FieldMetadata.COLOR_TEXTS));

            resultBuilder.setGenders(
                    __getIdFacet(aggregations, ObjectSummary.FieldMetadata.GENDER, new Function<String, Gender>() {
                        @Override
                        public Gender apply(final String input) {
                            return Gender.valueOf(input);
                        }
                    }));

            resultBuilder.setInstitutions(__getIdFacet(aggregations, ObjectSummary.FieldMetadata.INSTITUTION_ID,
                    new Function<String, InstitutionId>() {
                        @Override
                        public InstitutionId apply(final String input) {
                            try {
                                return InstitutionId.parse(input);
                            } catch (final InvalidInstitutionIdException e) {
                                throw new IllegalStateException(e);
                            }
                        }
                    }));

            resultBuilder.setMaterialTexts(__getTextsFacet(aggregations, ObjectSummary.FieldMetadata.MATERIAL_TEXTS));

            resultBuilder
                    .setSubjectTermTexts(__getTextsFacet(aggregations, ObjectSummary.FieldMetadata.SUBJECT_TERM_TEXTS));

            resultBuilder.setTechniqueTexts(__getTextsFacet(aggregations, ObjectSummary.FieldMetadata.TECHNIQUE_TEXTS));

            resultBuilder.setWorkTypeTexts(__getTextsFacet(aggregations, ObjectSummary.FieldMetadata.WORK_TYPE_TEXTS));

            return resultBuilder.build();
        }

        @Override
        protected List<AbstractAggregationBuilder> delegate() {
            return aggregations;
        }

        private <IdT> ImmutableMap<IdT, UnsignedInteger> __getIdFacet(final Aggregations aggregations,
                final ObjectSummary.FieldMetadata field, final Function<String, IdT> idFactory) {
            final ImmutableMap.Builder<IdT, UnsignedInteger> idsBuilder = ImmutableMap.builder();
            for (final Bucket bucket : ((StringTerms) aggregations.get(field.getThriftName())).getBuckets()) {
                idsBuilder.put(idFactory.apply(bucket.getKey()), UnsignedInteger.valueOf(bucket.getDocCount()));
            }
            return idsBuilder.build();
        }

        private ImmutableMap<String, UnsignedInteger> __getTextsFacet(final Aggregations aggregations,
                final ObjectSummary.FieldMetadata field) {
            final ImmutableMap.Builder<String, UnsignedInteger> textsBuilder = ImmutableMap.builder();
            for (final Bucket bucket : ((StringTerms) aggregations.get(field.getThriftName())).getBuckets()) {
                textsBuilder.put(bucket.getKey(), UnsignedInteger.valueOf(bucket.getDocCount()));
            }
            return textsBuilder.build();
        }

        private TermsBuilder __newIdAggregation(final ObjectSummary.FieldMetadata field) {
            return AggregationBuilders.terms(field.getThriftName()).field(field.getThriftProtocolKey())
                    .size(Integer.MAX_VALUE);
        }

        private TermsBuilder __newTextsAggregation(final ObjectSummary.FieldMetadata field) {
            return AggregationBuilders.terms(field.getThriftName())
                    .field(field.getThriftProtocolKey() + ".not_analyzed").size(Integer.MAX_VALUE);
        }

        private final ImmutableList<AbstractAggregationBuilder> aggregations;
    }

    private static FilterBuilder __excludeAllFilters(final ObjectSummary.FieldMetadata field,
            final List<FilterBuilder> filters) {
        checkArgument(!filters.isEmpty());
        final FilterBuilder[] filtersArray = new FilterBuilder[filters.size()];
        for (int filterI = 0; filterI < filters.size(); filterI++) {
            filtersArray[filterI] = FilterBuilders.notFilter(filters.get(filterI));
        }
        // !present || (!match AND !match AND !match ...)
        FilterBuilder excludeFilter;
        if (filtersArray.length == 1) {
            excludeFilter = filtersArray[0];
        } else {
            excludeFilter = FilterBuilders.andFilter(filtersArray);
        }
        return FilterBuilders.orFilter(FilterBuilders.missingFilter(field.getThriftProtocolKey()), excludeFilter);
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

    private static boolean __isExcludeAllQuery(final Optional<ObjectQuery> query) {
        return query.isPresent() && query.get().getFacetFilters().isPresent()
                && query.get().getFacetFilters().get().getExcludeAll().or(Boolean.FALSE);
    }

    @Inject
    public ElasticSearchObjectQueryService(final ObjectElasticSearchIndex objectElasticSearchIndex,
            final ObjectSummaryElasticSearchIndex objectSummaryElasticSearchIndex) {
        this.objectElasticSearchIndex = checkNotNull(objectElasticSearchIndex);
        this.objectSummaryElasticSearchIndex = checkNotNull(objectSummaryElasticSearchIndex);
        emptyObjectFacets = ObjectFacets.builder().setAgentNameTexts(ImmutableMap.of()).setCategories(ImmutableMap.of())
                .setCollections(ImmutableMap.of()).setColorTexts(ImmutableMap.of()).setGenders(ImmutableMap.of())
                .setInstitutions(ImmutableMap.of()).setMaterialTexts(ImmutableMap.of())
                .setSubjectTermTexts(ImmutableMap.of()).setTechniqueTexts(ImmutableMap.of())
                .setWorkTypeTexts(ImmutableMap.of()).build();
    }

    @Override
    public Object getObjectById(final ObjectId id) throws IoException, NoSuchObjectException {
        try {
            return objectElasticSearchIndex.getModelById(id, Optional.absent(), logger, Markers.GET_OBJECT_BY_ID,
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
        __checkIndexConsistency(Markers.GET_OBJECT_COUNT);

        if (__isExcludeAllQuery(query)) {
            return UnsignedInteger.ZERO;
        }

        try {
            return UnsignedInteger
                    .valueOf(
                            objectSummaryElasticSearchIndex
                                    .countModels(logger, Markers.GET_OBJECT_COUNT, objectSummaryElasticSearchIndex
                                            .prepareCountModels().setQuery(__translateObjectSummaryQuery(query)))
                            .longValue());
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting object count");
        }
    }

    @Override
    public ObjectFacets getObjectFacets(final Optional<ObjectQuery> query) throws IoException {
        __checkIndexConsistency(Markers.GET_OBJECT_FACETS);

        if (__isExcludeAllQuery(query)) {
            return emptyObjectFacets;
        }

        final SearchRequestBuilder searchRequestBuilder = objectSummaryElasticSearchIndex.prepareSearchModels()
                .setQuery(__translateObjectSummaryQuery(query)).setFrom(0).setSize(0);
        for (final AbstractAggregationBuilder aggregation : objectFacetAggregations) {
            searchRequestBuilder.addAggregation(aggregation);
        }

        SearchResponse searchResponse;
        try {
            searchResponse = objectSummaryElasticSearchIndex.getModels(logger, Markers.GET_OBJECT_FACETS,
                    searchRequestBuilder);
        } catch (final IndexMissingException e) {
            logger.warn(Markers.GET_OBJECT_FACETS, "objects index does not exist, returning empty results");
            return emptyObjectFacets;
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting objects");
        }

        return objectFacetAggregations.getObjectFacets(searchResponse.getAggregations());
    }

    @Override
    public ImmutableList<ObjectSummaryEntry> getObjectSummaries(final Optional<GetObjectSummariesOptions> options,
            final Optional<ObjectQuery> query) throws IoException {
        __checkIndexConsistency(Markers.GET_OBJECT_SUMMARIES);

        if (__isExcludeAllQuery(query)) {
            return ImmutableList.of();
        }

        SearchRequestBuilder searchRequestBuilder = objectSummaryElasticSearchIndex.prepareSearchModels()
                .setQuery(__translateObjectSummaryQuery(query));
        if (options.isPresent()) {
            if (options.get().getFrom().isPresent()) {
                searchRequestBuilder = searchRequestBuilder.setFrom(options.get().getFrom().get().intValue());
            }
            if (options.get().getSize().isPresent()) {
                searchRequestBuilder = searchRequestBuilder.setSize(options.get().getSize().get().intValue());
            }
            if (options.get().getSorts().isPresent()) {
                for (final ObjectSummarySort sort : options.get().getSorts().get()) {
                    searchRequestBuilder = searchRequestBuilder.addSort(SortBuilders
                            .fieldSort(ObjectSummary.FieldMetadata
                                    .valueOfThriftName(sort.getField().name().toLowerCase()).getThriftProtocolKey())
                            .missing("_last").order(sort.getOrder() == net.lab1318.costume.api.models.SortOrder.ASC
                                    ? SortOrder.ASC : SortOrder.DESC));
                }
            }
        }

        SearchResponse searchResponse;
        try {
            searchResponse = objectSummaryElasticSearchIndex.getModels(logger, Markers.GET_OBJECT_SUMMARIES,
                    searchRequestBuilder);
        } catch (final IndexMissingException e) {
            logger.warn(Markers.GET_OBJECT_SUMMARIES, "object summaries index does not exist, returning empty results");
            return ImmutableList.of();
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting object summaries");
        }

        final ImmutableList.Builder<ObjectSummaryEntry> resultBuilder = ImmutableList.builder();
        for (final SearchHit searchHit : searchResponse.getHits().getHits()) {
            try {
                resultBuilder.add(ObjectSummaryElasticSearchModelFactory.getInstance()
                        .createModelEntryFromSource(searchHit.getId(), searchHit.getSourceRef()));
            } catch (final InvalidModelException e) {
                logger.warn(Markers.GET_OBJECT_SUMMARIES, "invalid object summary from index {}", e.getId());
                continue;
            }
        }
        return resultBuilder.build();
    }

    private void __checkIndexConsistency(final Marker logMarker) throws IoException {
        if (!checkedIndexConsistency.compareAndSet(false, true)) {
            return;
        }

        UnsignedLong objectCount;
        final UnsignedLong objectSummaryCount;
        try {
            objectCount = objectElasticSearchIndex.countModels(logger, logMarker);
            objectSummaryCount = objectSummaryElasticSearchIndex.countModels(logger, logMarker);
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error checking object indices for consistency");
        }
        if (!objectCount.equals(objectSummaryCount)) {
            logger.error(logMarker, "object count ({}) is not the same as the summary count ({})",
                    objectCount.longValue(), objectSummaryCount.longValue());
        }
    }

    private <IdT> void __translateObjectSummaryIdFilters(final Optional<ImmutableSet<IdT>> excludeIds,
            final ObjectSummary.FieldMetadata field, final Optional<ImmutableSet<IdT>> includeIds,
            final List<FilterBuilder> outFilters, final Optional<IdT> unknownId) {
        for (final Optional<ImmutableSet<IdT>> ids : ImmutableList.of(excludeIds, includeIds)) {
            if (!ids.isPresent()) {
                continue;
            }
            final List<FilterBuilder> filters = new ArrayList<>();
            for (final IdT id : ids.get()) {
                if (id != unknownId.orNull()) {
                    filters.add(FilterBuilders.termFilter(field.getThriftProtocolKey(), id.toString()));
                } else {
                    if (ids == excludeIds) {
                        // Exclude unknown
                        outFilters.add(FilterBuilders.existsFilter(field.getThriftProtocolKey()));
                    } else {
                        // Include unknown
                        outFilters.add(FilterBuilders.missingFilter(field.getThriftProtocolKey()));
                    }
                }
            }
            if (!filters.isEmpty()) {
                if (ids == excludeIds) {
                    outFilters.add(__excludeAllFilters(field, filters));
                } else {
                    outFilters.add(__includeAnyFilter(filters));
                }
            }
        }
    }

    private QueryBuilder __translateObjectSummaryQuery(final Optional<ObjectQuery> query) {
        if (!query.isPresent()) {
            return QueryBuilders.matchAllQuery();
        }

        QueryBuilder queryTranslated;
        if (query.get().getQueryString().isPresent()) {
            queryTranslated = QueryBuilders.queryStringQuery(query.get().getQueryString().get())
                    .field(ObjectSummary.FieldMetadata.AGENT_NAME_TEXTS.getThriftProtocolKey())
                    .field(ObjectSummary.FieldMetadata.CATEGORIES.getThriftProtocolKey())
                    .field(ObjectSummary.FieldMetadata.COLOR_TEXTS.getThriftProtocolKey())
                    .field(ObjectSummary.FieldMetadata.DATE.getThriftProtocolKey())
                    .field(ObjectSummary.FieldMetadata.DESCRIPTION.getThriftProtocolKey())
                    .field(ObjectSummary.FieldMetadata.MATERIAL_TEXTS.getThriftProtocolKey())
                    .field(ObjectSummary.FieldMetadata.RELATION_TEXTS.getThriftProtocolKey())
                    .field(ObjectSummary.FieldMetadata.SUBJECT_TERM_TEXTS.getThriftProtocolKey())
                    .field(ObjectSummary.FieldMetadata.TECHNIQUE_TEXTS.getThriftProtocolKey())
                    .field(ObjectSummary.FieldMetadata.TITLE.getThriftProtocolKey(), (float) 2.0);

        } else if (query.get().getMoreLikeObjectId().isPresent()) {
            queryTranslated = QueryBuilders
                    .moreLikeThisQuery(ObjectSummary.FieldMetadata.AGENT_NAME_TEXTS.getThriftProtocolKey(),
                            ObjectSummary.FieldMetadata.CATEGORIES.getThriftProtocolKey(),
                            ObjectSummary.FieldMetadata.COLOR_TEXTS.getThriftProtocolKey(),
                            ObjectSummary.FieldMetadata.DATE.getThriftProtocolKey(),
                            ObjectSummary.FieldMetadata.DESCRIPTION.getThriftProtocolKey(),
                            ObjectSummary.FieldMetadata.MATERIAL_TEXTS.getThriftProtocolKey(),
                            ObjectSummary.FieldMetadata.RELATION_TEXTS.getThriftProtocolKey(),
                            ObjectSummary.FieldMetadata.SUBJECT_TERM_TEXTS.getThriftProtocolKey(),
                            ObjectSummary.FieldMetadata.TECHNIQUE_TEXTS.getThriftProtocolKey(),
                            ObjectSummary.FieldMetadata.TITLE.getThriftProtocolKey())
                    .docs(new MoreLikeThisQueryBuilder.Item(objectSummaryElasticSearchIndex.getIndexName(),
                            objectSummaryElasticSearchIndex.getDocumentType(),
                            query.get().getMoreLikeObjectId().get().toString()));
        } else {
            queryTranslated = QueryBuilders.matchAllQuery();
        }

        final List<FilterBuilder> filtersTranslated = new ArrayList<>();

        if (query.get().getCollectionId().isPresent()) {
            filtersTranslated
                    .add(FilterBuilders.termFilter(ObjectSummary.FieldMetadata.COLLECTION_ID.getThriftProtocolKey(),
                            query.get().getCollectionId().get().toString()));
        }

        if (query.get().getFacetFilters().isPresent()) {
            final ObjectFacetFilters facetFilters = query.get().getFacetFilters().get();

            checkState(!facetFilters.getExcludeAll().or(Boolean.FALSE));

            __translateObjectSummaryTextFilters(facetFilters.getExcludeAgentNameTexts(),
                    ObjectSummary.FieldMetadata.AGENT_NAME_TEXTS, facetFilters.getIncludeAgentNameTexts(),
                    filtersTranslated);

            __translateObjectSummaryTextFilters(facetFilters.getExcludeCategories(),
                    ObjectSummary.FieldMetadata.CATEGORIES, facetFilters.getIncludeCategories(), filtersTranslated);

            __translateObjectSummaryIdFilters(facetFilters.getExcludeCollections(),
                    ObjectSummary.FieldMetadata.COLLECTION_ID, facetFilters.getIncludeCollections(), filtersTranslated,
                    Optional.absent());

            __translateObjectSummaryTextFilters(facetFilters.getExcludeColorTexts(),
                    ObjectSummary.FieldMetadata.COLOR_TEXTS, facetFilters.getIncludeColorTexts(), filtersTranslated);

            __translateObjectSummaryIdFilters(facetFilters.getExcludeGenders(), ObjectSummary.FieldMetadata.GENDER,
                    facetFilters.getIncludeGenders(), filtersTranslated, Optional.of(Gender.UNKNOWN));

            __translateObjectSummaryIdFilters(facetFilters.getExcludeInstitutions(),
                    ObjectSummary.FieldMetadata.INSTITUTION_ID, facetFilters.getIncludeInstitutions(),
                    filtersTranslated, Optional.absent());

            __translateObjectSummaryTextFilters(facetFilters.getExcludeMaterialTexts(),
                    ObjectSummary.FieldMetadata.MATERIAL_TEXTS, facetFilters.getIncludeMaterialTexts(),
                    filtersTranslated);

            __translateObjectSummaryTextFilters(facetFilters.getExcludeSubjectTermTexts(),
                    ObjectSummary.FieldMetadata.SUBJECT_TERM_TEXTS, facetFilters.getIncludeSubjectTermTexts(),
                    filtersTranslated);

            __translateObjectSummaryTextFilters(facetFilters.getExcludeTechniqueTexts(),
                    ObjectSummary.FieldMetadata.TECHNIQUE_TEXTS, facetFilters.getIncludeTechniqueTexts(),
                    filtersTranslated);

            __translateObjectSummaryTextFilters(facetFilters.getExcludeWorkTypeTexts(),
                    ObjectSummary.FieldMetadata.WORK_TYPE_TEXTS, facetFilters.getIncludeWorkTypeTexts(),
                    filtersTranslated);
        }

        if (query.get().getInstitutionId().isPresent()) {
            filtersTranslated
                    .add(FilterBuilders.termFilter(ObjectSummary.FieldMetadata.INSTITUTION_ID.getThriftProtocolKey(),
                            query.get().getInstitutionId().get().toString()));
        }

        if (query.get().getRelationText().isPresent()) {
            filtersTranslated.add(FilterBuilders.termFilter(
                    ObjectSummary.FieldMetadata.RELATION_TEXTS.getThriftProtocolKey() + ".not_analyzed",
                    query.get().getRelationText().get()));
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

    private void __translateObjectSummaryTextFilters(final Optional<ImmutableSet<String>> excludeTexts,
            final ObjectSummary.FieldMetadata field, final Optional<ImmutableSet<String>> includeTexts,
            final List<FilterBuilder> outFilters) {
        for (final Optional<ImmutableSet<String>> texts : ImmutableList.of(excludeTexts, includeTexts)) {
            if (!texts.isPresent()) {
                continue;
            }
            final List<FilterBuilder> textFilters = new ArrayList<>();
            for (final String text : texts.get()) {
                if (!text.isEmpty()) {
                    textFilters.add(FilterBuilders.termFilter(field.getThriftProtocolKey() + ".not_analyzed", text));
                } else {
                    // Empty text = "unknown" key
                    if (texts == excludeTexts) {
                        // Exclude unknown
                        outFilters.add(FilterBuilders.existsFilter(field.getThriftProtocolKey()));
                    } else {
                        // Include unknown
                        outFilters.add(FilterBuilders.missingFilter(field.getThriftProtocolKey()));
                    }
                }
            }
            if (!textFilters.isEmpty()) {
                if (texts == excludeTexts) {
                    outFilters.add(__excludeAllFilters(field, textFilters));
                } else {
                    outFilters.add(__includeAnyFilter(textFilters));
                }
            }
        }
    }

    private final AtomicBoolean checkedIndexConsistency = new AtomicBoolean(false);
    private final ObjectFacets emptyObjectFacets;
    private final ObjectFacetAggregations objectFacetAggregations = new ObjectFacetAggregations();
    private final ObjectElasticSearchIndex objectElasticSearchIndex;
    private final ObjectSummaryElasticSearchIndex objectSummaryElasticSearchIndex;
    private final static Logger logger = LoggerFactory.getLogger(ElasticSearchObjectQueryService.class);
}
