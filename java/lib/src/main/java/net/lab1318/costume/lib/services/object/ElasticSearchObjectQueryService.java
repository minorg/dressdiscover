package net.lab1318.costume.lib.services.object;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

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
import org.elasticsearch.search.aggregations.AggregationBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.Aggregations;
import org.elasticsearch.search.aggregations.bucket.nested.Nested;
import org.elasticsearch.search.aggregations.bucket.nested.NestedBuilder;
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
import org.slf4j.Marker;
import org.thryft.protocol.InputProtocolException;

import com.google.common.base.Optional;
import com.google.common.collect.ForwardingList;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.UnsignedInteger;
import com.google.common.primitives.UnsignedLong;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.agent.Agent;
import net.lab1318.costume.api.models.agent.AgentName;
import net.lab1318.costume.api.models.agent.AgentSet;
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
import net.lab1318.costume.api.models.subject.Subject;
import net.lab1318.costume.api.models.subject.SubjectSet;
import net.lab1318.costume.api.models.subject.SubjectTerm;
import net.lab1318.costume.api.models.work_type.WorkType;
import net.lab1318.costume.api.models.work_type.WorkTypeSet;
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

    private final static class ObjectFacetAggregations extends ForwardingList<AbstractAggregationBuilder> {
        private ObjectFacetAggregations() {
            {
                final TermsBuilder agentNameTextAggregation = AggregationBuilders
                        .terms(AgentName.FieldMetadata.TEXT.getThriftName())
                        .field(Object.FieldMetadata.AGENTS.getThriftProtocolKey() + '.'
                                + AgentSet.FieldMetadata.ELEMENTS.getThriftProtocolKey() + '.'
                                + Agent.FieldMetadata.NAME.getThriftProtocolKey() + '.'
                                + AgentName.FieldMetadata.TEXT.getThriftProtocolKey() + ".not_analyzed");
                final NestedBuilder agentNameAggregation = AggregationBuilders
                        .nested(Agent.FieldMetadata.NAME.getThriftName())
                        .path(Object.FieldMetadata.AGENTS.getThriftProtocolKey() + '.'
                                + AgentSet.FieldMetadata.ELEMENTS.getThriftProtocolKey() + '.'
                                + Agent.FieldMetadata.NAME.getThriftProtocolKey())
                        .subAggregation(agentNameTextAggregation);
                final NestedBuilder agentSetAgentsAggregation = AggregationBuilders
                        .nested(AgentSet.FieldMetadata.ELEMENTS.getThriftName())
                        .path(Object.FieldMetadata.AGENTS.getThriftProtocolKey() + '.'
                                + AgentSet.FieldMetadata.ELEMENTS.getThriftProtocolKey())
                        .subAggregation(agentNameAggregation);
                final NestedBuilder objectAgentsAggregation = AggregationBuilders
                        .nested(Object.FieldMetadata.AGENTS.getThriftName())
                        .path(Object.FieldMetadata.AGENTS.getThriftProtocolKey())
                        .subAggregation(agentSetAgentsAggregation);
                this.agentNameTextsAggregation = objectAgentsAggregation;
            }

            categoriesAggregation = AggregationBuilders.terms(ObjectFacets.FieldMetadata.CATEGORIES.getThriftName())
                    .field(Object.FieldMetadata.CATEGORIES.getThriftProtocolKey() + ".not_analyzed");

            collectionHitsAggregation = AggregationBuilders
                    .terms(ObjectFacets.FieldMetadata.COLLECTION_HITS.getThriftName())
                    .field(Object.FieldMetadata.COLLECTION_ID.getThriftProtocolKey());

            gendersAggregation = AggregationBuilders.terms(ObjectFacets.FieldMetadata.GENDERS.getThriftName())
                    .field(Object.FieldMetadata.GENDER.getThriftProtocolKey());

            institutionHitsAggregation = AggregationBuilders
                    .terms(ObjectFacets.FieldMetadata.INSTITUTION_HITS.getThriftName())
                    .field(Object.FieldMetadata.INSTITUTION_ID.getThriftProtocolKey());

            {
                final TermsBuilder subjectTermTextAggregation = AggregationBuilders
                        .terms(SubjectTerm.FieldMetadata.TEXT.getThriftName())
                        .field(Object.FieldMetadata.SUBJECTS.getThriftProtocolKey() + '.'
                                + SubjectSet.FieldMetadata.ELEMENTS.getThriftProtocolKey() + '.'
                                + Subject.FieldMetadata.TERMS.getThriftProtocolKey() + '.'
                                + SubjectTerm.FieldMetadata.TEXT.getThriftProtocolKey() + ".not_analyzed");
                final NestedBuilder subjectTermsAggregation = AggregationBuilders
                        .nested(Subject.FieldMetadata.TERMS.getThriftName())
                        .path(Object.FieldMetadata.SUBJECTS.getThriftProtocolKey() + '.'
                                + SubjectSet.FieldMetadata.ELEMENTS.getThriftProtocolKey() + '.'
                                + Subject.FieldMetadata.TERMS.getThriftProtocolKey())
                        .subAggregation(subjectTermTextAggregation);
                final NestedBuilder subjectSetSubjectsAggregation = AggregationBuilders
                        .nested(SubjectSet.FieldMetadata.ELEMENTS.getThriftName())
                        .path(Object.FieldMetadata.SUBJECTS.getThriftProtocolKey() + '.'
                                + SubjectSet.FieldMetadata.ELEMENTS.getThriftProtocolKey())
                        .subAggregation(subjectTermsAggregation);
                final NestedBuilder objectSubjectsAggregation = AggregationBuilders
                        .nested(Object.FieldMetadata.SUBJECTS.getThriftName())
                        .path(Object.FieldMetadata.SUBJECTS.getThriftProtocolKey())
                        .subAggregation(subjectSetSubjectsAggregation);
                subjectTermTextsAggregation = objectSubjectsAggregation;
            }

            {
                final TermsBuilder workTypeTextAggregation = AggregationBuilders
                        .terms(WorkType.FieldMetadata.TEXT.getThriftName())
                        .field(Object.FieldMetadata.WORK_TYPES.getThriftProtocolKey() + '.'
                                + WorkTypeSet.FieldMetadata.ELEMENTS.getThriftProtocolKey() + '.'
                                + WorkType.FieldMetadata.TEXT.getThriftProtocolKey() + ".not_analyzed");
                final NestedBuilder workTypeSetsWorkTypesAggregation = AggregationBuilders
                        .nested(WorkTypeSet.FieldMetadata.ELEMENTS.getThriftName())
                        .path(Object.FieldMetadata.WORK_TYPES.getThriftProtocolKey() + '.'
                                + WorkTypeSet.FieldMetadata.ELEMENTS.getThriftProtocolKey())
                        .subAggregation(workTypeTextAggregation);
                final NestedBuilder objectWorkTypesAggregation = AggregationBuilders
                        .nested(Object.FieldMetadata.WORK_TYPES.getThriftName())
                        .path(Object.FieldMetadata.WORK_TYPES.getThriftProtocolKey())
                        .subAggregation(workTypeSetsWorkTypesAggregation);
                this.workTypeTextsAggregation = objectWorkTypesAggregation;
            }

            aggregations = ImmutableList.of(agentNameTextsAggregation, categoriesAggregation, collectionHitsAggregation,
                    gendersAggregation, institutionHitsAggregation, subjectTermTextsAggregation,
                    workTypeTextsAggregation);
        }

        public ObjectFacets getObjectFacets(final Aggregations aggregations) {
            final ObjectFacets.Builder resultBuilder = ObjectFacets.builder();

            {
                final ImmutableMap.Builder<String, UnsignedInteger> agentNameTextsBuilder = ImmutableMap.builder();
                final Nested agentNameTextsAggregation = aggregations.get(this.agentNameTextsAggregation.getName());
                final Nested agentSetElementsAggregation = agentNameTextsAggregation.getAggregations()
                        .get(AgentSet.FieldMetadata.ELEMENTS.getThriftName());
                final Nested agentNameAggregation = agentSetElementsAggregation.getAggregations()
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
                for (final Bucket bucket : ((StringTerms) aggregations.get(categoriesAggregation.getName()))
                        .getBuckets()) {
                    categoriesBuilder.put(bucket.getKey(), UnsignedInteger.valueOf(bucket.getDocCount()));
                }
                resultBuilder.setCategories(categoriesBuilder.build());
            }

            {
                final ImmutableMap.Builder<CollectionId, UnsignedInteger> collectionHitsBuilder = ImmutableMap
                        .builder();
                for (final Bucket bucket : ((StringTerms) aggregations.get(collectionHitsAggregation.getName()))
                        .getBuckets()) {
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
                final ImmutableMap.Builder<Gender, UnsignedInteger> gendersBuilder = ImmutableMap.builder();
                for (final Bucket bucket : ((StringTerms) aggregations.get(gendersAggregation.getName()))
                        .getBuckets()) {
                    gendersBuilder.put(Gender.valueOf(bucket.getKey()), UnsignedInteger.valueOf(bucket.getDocCount()));
                }
                resultBuilder.setGenders(gendersBuilder.build());
            }

            {
                final ImmutableMap.Builder<InstitutionId, UnsignedInteger> institutionHitsBuilder = ImmutableMap
                        .builder();
                for (final Bucket bucket : ((StringTerms) aggregations.get(institutionHitsAggregation.getName()))
                        .getBuckets()) {
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
                final Nested subjectTermTextsAggregation = aggregations.get(this.subjectTermTextsAggregation.getName());
                final Nested subjectSetElementsAggregation = subjectTermTextsAggregation.getAggregations()
                        .get(SubjectSet.FieldMetadata.ELEMENTS.getThriftName());
                final Nested subjectTermsAggregation = subjectSetElementsAggregation.getAggregations()
                        .get(Subject.FieldMetadata.TERMS.getThriftName());
                final StringTerms subjectTermTextAggregation = subjectTermsAggregation.getAggregations()
                        .get(SubjectTerm.FieldMetadata.TEXT.getThriftName());

                for (final Bucket bucket : subjectTermTextAggregation.getBuckets()) {
                    subjectTermTextsBuilder.put(bucket.getKey(), UnsignedInteger.valueOf(bucket.getDocCount()));
                }
                resultBuilder.setSubjectTermTexts(subjectTermTextsBuilder.build());
            }

            {
                final ImmutableMap.Builder<String, UnsignedInteger> workTypeTextsBuilder = ImmutableMap.builder();
                final Nested workTypeTextsAggregation = aggregations.get(this.workTypeTextsAggregation.getName());
                final Nested workTypeSetElementsAggregation = workTypeTextsAggregation.getAggregations()
                        .get(WorkTypeSet.FieldMetadata.ELEMENTS.getThriftName());
                final StringTerms workTypeTextAggregation = workTypeSetElementsAggregation.getAggregations()
                        .get(WorkType.FieldMetadata.TEXT.getThriftName());
                for (final Bucket bucket : workTypeTextAggregation.getBuckets()) {
                    workTypeTextsBuilder.put(bucket.getKey(), UnsignedInteger.valueOf(bucket.getDocCount()));
                }
                resultBuilder.setWorkTypeTexts(workTypeTextsBuilder.build());
            }

            return resultBuilder.build();
        }

        @Override
        protected List<AbstractAggregationBuilder> delegate() {
            return aggregations;
        }

        private final AggregationBuilder<?> agentNameTextsAggregation;
        private final ImmutableList<AbstractAggregationBuilder> aggregations;
        private final TermsBuilder categoriesAggregation;
        private final TermsBuilder collectionHitsAggregation;
        private final TermsBuilder gendersAggregation;
        private final TermsBuilder institutionHitsAggregation;
        private final AggregationBuilder<?> subjectTermTextsAggregation;
        private NestedBuilder workTypeTextsAggregation;
    }

    private final static class ObjectSummaryElasticSearchModelFactory
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
    public ElasticSearchObjectQueryService(final ObjectElasticSearchIndex objectElasticSearchIndex,
            final ObjectSummaryElasticSearchIndex objectSummaryElasticSearchIndex) {
        this.objectElasticSearchIndex = checkNotNull(objectElasticSearchIndex);
        this.objectSummaryElasticSearchIndex = checkNotNull(objectSummaryElasticSearchIndex);
        emptyObjectFacets = ObjectFacets.builder().setAgentNameTexts(ImmutableMap.of()).setCategories(ImmutableMap.of())
                .setCollectionHits(ImmutableMap.of()).setGenders(ImmutableMap.of())
                .setInstitutionHits(ImmutableMap.of()).setSubjectTermTexts(ImmutableMap.of())
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

        try {
            return UnsignedInteger
                    .valueOf(
                            objectElasticSearchIndex
                                    .countModels(logger, Markers.GET_OBJECT_COUNT, objectElasticSearchIndex
                                            .prepareCountModels().setQuery(__translateObjectSummaryQuery(query)))
                            .longValue());
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting object count");
        }
    }

    @Override
    public ObjectFacets getObjectFacets(final Optional<ObjectQuery> query) throws IoException {
        __checkIndexConsistency(Markers.GET_OBJECT_FACETS);

        final SearchRequestBuilder searchRequestBuilder = objectElasticSearchIndex.prepareSearchModels()
                .setQuery(__translateObjectSummaryQuery(query)).setFrom(0).setSize(0);
        for (final AbstractAggregationBuilder aggregation : objectFacetAggregations) {
            searchRequestBuilder.addAggregation(aggregation);
        }

        SearchResponse searchResponse;
        try {
            searchResponse = objectElasticSearchIndex.getModels(logger, Markers.GET_OBJECT_FACETS,
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

        SearchRequestBuilder searchRequestBuilder = objectElasticSearchIndex.prepareSearchModels()
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
                            .fieldSort(Object.FieldMetadata.valueOfThriftName(sort.getField().name().toLowerCase())
                                    .getThriftProtocolKey())
                            .missing("_last").order(sort.getOrder() == net.lab1318.costume.api.models.SortOrder.ASC
                                    ? SortOrder.ASC : SortOrder.DESC));
                }
            }
        }

        SearchResponse searchResponse;
        try {
            searchResponse = objectElasticSearchIndex.getModels(logger, Markers.GET_OBJECT_SUMMARIES,
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
            throw new IllegalStateException(String.format("object count (%d) is not the same as the summary count (%d)",
                    objectCount.longValue(), objectSummaryCount.longValue()));
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
                    .field(ObjectSummary.FieldMetadata.DATE.getThriftProtocolKey())
                    .field(ObjectSummary.FieldMetadata.DESCRIPTION.getThriftProtocolKey())
                    .field(ObjectSummary.FieldMetadata.SUBJECT_TERM_TEXTS.getThriftProtocolKey())
                    .field(ObjectSummary.FieldMetadata.TITLE.getThriftProtocolKey(), (float) 2.0);

        } else if (query.get().getMoreLikeObjectId().isPresent()) {
            queryTranslated = QueryBuilders
                    .moreLikeThisQuery(ObjectSummary.FieldMetadata.AGENT_NAME_TEXTS.getThriftProtocolKey(),
                            ObjectSummary.FieldMetadata.CATEGORIES.getThriftProtocolKey(),
                            ObjectSummary.FieldMetadata.DATE.getThriftProtocolKey(),
                            ObjectSummary.FieldMetadata.DESCRIPTION.getThriftProtocolKey(),
                            ObjectSummary.FieldMetadata.SUBJECT_TERM_TEXTS.getThriftProtocolKey(),
                            ObjectSummary.FieldMetadata.TITLE.getThriftProtocolKey())
                    .docs(new MoreLikeThisQueryBuilder.Item(objectSummaryElasticSearchIndex.getIndexName(),
                            objectSummaryElasticSearchIndex.getDocumentType(),
                            query.get().getMoreLikeObjectId().get().toString()));
        } else {
            queryTranslated = QueryBuilders.matchAllQuery();
        }

        final List<FilterBuilder> filtersTranslated = new ArrayList<>();

        if (query.get().getCollectionId().isPresent()) {
            filtersTranslated.add(FilterBuilders.termFilter(Object.FieldMetadata.COLLECTION_ID.getThriftProtocolKey(),
                    query.get().getCollectionId().get().toString()));
        }

        if (query.get().getFacetFilters().isPresent()) {
            final ObjectFacetFilters facetFilters = query.get().getFacetFilters().get();

            for (final Optional<ImmutableSet<String>> agentNameTexts : ImmutableList
                    .of(facetFilters.getExcludeAgentNameTexts(), facetFilters.getIncludeAgentNameTexts())) {
                if (!agentNameTexts.isPresent()) {
                    continue;
                }
                final List<FilterBuilder> agentNameTextFilters = new ArrayList<>();
                for (final String agentNameText : agentNameTexts.get()) {
                    if (agentNameText.isEmpty()) {
                        continue;
                    }
                    agentNameTextFilters.add(FilterBuilders.termFilter(
                            ObjectSummary.FieldMetadata.AGENT_NAME_TEXTS.getThriftProtocolKey() + ".not_analyzed",
                            agentNameText));
                }
                if (!agentNameTextFilters.isEmpty()) {
                    if (agentNameTexts == facetFilters.getExcludeAgentNameTexts()) {
                        filtersTranslated.add(__excludeAllFilters(agentNameTextFilters));
                    } else {
                        filtersTranslated.add(__includeAnyFilter(agentNameTextFilters));
                    }
                }
            }

            for (final Optional<ImmutableSet<String>> categories : ImmutableList.of(facetFilters.getExcludeCategories(),
                    facetFilters.getIncludeCategories())) {
                if (!categories.isPresent()) {
                    continue;
                }
                final List<FilterBuilder> categoryFilters = new ArrayList<>();
                for (final String category : categories.get()) {
                    if (category.isEmpty()) {
                        continue;
                    }
                    categoryFilters.add(FilterBuilders.termFilter(
                            ObjectSummary.FieldMetadata.CATEGORIES.getThriftProtocolKey() + ".not_analyzed", category));
                }
                if (!categoryFilters.isEmpty()) {
                    if (categories == facetFilters.getExcludeCategories()) {
                        filtersTranslated.add(__excludeAllFilters(categoryFilters));
                    } else {
                        filtersTranslated.add(__includeAnyFilter(categoryFilters));
                    }
                }
            }

            for (final Optional<ImmutableSet<CollectionId>> collectionIds : ImmutableList
                    .of(facetFilters.getExcludeCollectionIds(), facetFilters.getIncludeCollectionIds())) {
                if (!collectionIds.isPresent()) {
                    continue;
                }
                final List<FilterBuilder> collectionIdFilters = new ArrayList<>();
                for (final CollectionId collectionId : collectionIds.get()) {
                    collectionIdFilters.add(FilterBuilders.termFilter(
                            ObjectSummary.FieldMetadata.COLLECTION_ID.getThriftProtocolKey(), collectionId.toString()));
                }
                if (!collectionIdFilters.isEmpty()) {
                    if (collectionIds == facetFilters.getExcludeCollectionIds()) {
                        filtersTranslated.add(__excludeAllFilters(collectionIdFilters));
                    } else {
                        filtersTranslated.add(__includeAnyFilter(collectionIdFilters));
                    }
                }
            }

            for (final Optional<ImmutableSet<Gender>> genders : ImmutableList.of(facetFilters.getExcludeGenders(),
                    facetFilters.getIncludeGenders())) {
                if (!genders.isPresent()) {
                    continue;
                }
                final List<FilterBuilder> genderFilters = new ArrayList<>();
                for (final Gender gender : genders.get()) {
                    genderFilters.add(FilterBuilders
                            .termFilter(ObjectSummary.FieldMetadata.GENDER.getThriftProtocolKey(), gender));
                }
                if (!genderFilters.isEmpty()) {
                    if (genders == facetFilters.getExcludeGenders()) {
                        filtersTranslated.add(__excludeAllFilters(genderFilters));
                    } else {
                        filtersTranslated.add(__includeAnyFilter(genderFilters));
                    }
                }
            }

            for (final Optional<ImmutableSet<InstitutionId>> institutionIds : ImmutableList
                    .of(facetFilters.getExcludeInstitutionIds(), facetFilters.getIncludeInstitutionIds())) {
                if (!institutionIds.isPresent()) {
                    continue;
                }
                final List<FilterBuilder> institutionIdFilters = new ArrayList<>();
                for (final InstitutionId institutionId : institutionIds.get()) {
                    institutionIdFilters.add(
                            FilterBuilders.termFilter(ObjectSummary.FieldMetadata.INSTITUTION_ID.getThriftProtocolKey(),
                                    institutionId.toString()));
                }
                if (!institutionIdFilters.isEmpty()) {
                    if (institutionIds == facetFilters.getExcludeInstitutionIds()) {
                        filtersTranslated.add(__excludeAllFilters(institutionIdFilters));
                    } else {
                        filtersTranslated.add(__includeAnyFilter(institutionIdFilters));
                    }
                }
            }

            for (final Optional<ImmutableSet<String>> subjectTermTexts : ImmutableList
                    .of(facetFilters.getExcludeSubjectTermTexts(), facetFilters.getIncludeSubjectTermTexts())) {
                if (!subjectTermTexts.isPresent()) {
                    continue;
                }
                final List<FilterBuilder> subjectTermTextFilters = new ArrayList<>();
                for (final String subjectTermText : subjectTermTexts.get()) {
                    if (subjectTermText.isEmpty()) {
                        continue;
                    }
                    subjectTermTextFilters.add(FilterBuilders.termFilter(
                            ObjectSummary.FieldMetadata.SUBJECT_TERM_TEXTS.getThriftProtocolKey() + ".not_analyzed",
                            subjectTermText));
                }
                if (!subjectTermTextFilters.isEmpty()) {
                    if (subjectTermTexts == facetFilters.getExcludeSubjectTermTexts()) {
                        filtersTranslated.add(__excludeAllFilters(subjectTermTextFilters));
                    } else {
                        filtersTranslated.add(__includeAnyFilter(subjectTermTextFilters));
                    }
                }
            }

            for (final Optional<ImmutableSet<String>> workTypeTexts : ImmutableList
                    .of(facetFilters.getExcludeWorkTypeTexts(), facetFilters.getIncludeWorkTypeTexts())) {
                if (!workTypeTexts.isPresent()) {
                    continue;
                }
                final List<FilterBuilder> workTypeTextFilters = new ArrayList<>();
                for (final String workTypeText : workTypeTexts.get()) {
                    if (workTypeText.isEmpty()) {
                        continue;
                    }
                    workTypeTextFilters.add(FilterBuilders.termFilter(
                            ObjectSummary.FieldMetadata.WORK_TYPE_TEXTS.getThriftProtocolKey() + ".not_analyzed",
                            workTypeText));
                }
                if (!workTypeTextFilters.isEmpty()) {
                    if (workTypeTexts == facetFilters.getExcludeWorkTypeTexts()) {
                        filtersTranslated.add(__excludeAllFilters(workTypeTextFilters));
                    } else {
                        filtersTranslated.add(__includeAnyFilter(workTypeTextFilters));
                    }
                }
            }
        }

        if (query.get().getInstitutionId().isPresent()) {
            filtersTranslated.add(FilterBuilders.termFilter(Object.FieldMetadata.INSTITUTION_ID.getThriftProtocolKey(),
                    query.get().getInstitutionId().get().toString()));
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

    private final AtomicBoolean checkedIndexConsistency = new AtomicBoolean(false);
    private final ObjectFacets emptyObjectFacets;
    private final ObjectFacetAggregations objectFacetAggregations = new ObjectFacetAggregations();
    private final ObjectElasticSearchIndex objectElasticSearchIndex;
    private final ObjectSummaryElasticSearchIndex objectSummaryElasticSearchIndex;
    private final static Logger logger = LoggerFactory.getLogger(ElasticSearchObjectQueryService.class);
}
