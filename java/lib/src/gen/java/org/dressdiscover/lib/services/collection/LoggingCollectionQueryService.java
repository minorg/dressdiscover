package org.dressdiscover.lib.services.collection;

@com.google.inject.Singleton
public class LoggingCollectionQueryService implements org.dressdiscover.api.services.collection.CollectionQueryService {
    public final static class CollectionQueryServiceLogMarkers {
        public final static org.slf4j.Marker GET_COLLECTION_BY_ID = org.slf4j.MarkerFactory.getMarker("GET_COLLECTION_BY_ID");
        public final static org.slf4j.Marker GET_COLLECTIONS_BY_IDS = org.slf4j.MarkerFactory.getMarker("GET_COLLECTIONS_BY_IDS");
        public final static org.slf4j.Marker GET_COLLECTIONS_BY_INSTITUTION_ID = org.slf4j.MarkerFactory.getMarker("GET_COLLECTIONS_BY_INSTITUTION_ID");

        public final static org.slf4j.Marker COLLECTION_QUERY_SERVICE = org.slf4j.MarkerFactory.getMarker("COLLECTION_QUERY_SERVICE");
        static {
            COLLECTION_QUERY_SERVICE.add(GET_COLLECTION_BY_ID);
            COLLECTION_QUERY_SERVICE.add(GET_COLLECTIONS_BY_IDS);
            COLLECTION_QUERY_SERVICE.add(GET_COLLECTIONS_BY_INSTITUTION_ID);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.collection.LoggingCollectionQueryService.delegate");

    @com.google.inject.Inject
    public LoggingCollectionQueryService(@com.google.inject.name.Named("org.dressdiscover.lib.services.collection.LoggingCollectionQueryService.delegate") final org.dressdiscover.api.services.collection.CollectionQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public org.dressdiscover.api.models.collection.Collection getCollectionById(final org.dressdiscover.api.models.collection.CollectionId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = Messages.GetCollectionByIdRequest.create(id);

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(CollectionQueryServiceLogMarkers.GET_COLLECTION_BY_ID, LogMessages.GET_COLLECTION_BY_ID, __logMessageArgs);

        try {
            final org.dressdiscover.api.models.collection.Collection __returnValue = delegate.getCollectionById(id);

            __logMessageArgs[__logMessageArgs.length - 1] = __returnValue;
            logger.info(CollectionQueryServiceLogMarkers.GET_COLLECTION_BY_ID, LogMessages.GET_COLLECTION_BY_ID, __logMessageArgs);

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(CollectionQueryServiceLogMarkers.GET_COLLECTION_BY_ID, LogMessages.GET_COLLECTION_BY_ID, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.collection.NoSuchCollectionException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(CollectionQueryServiceLogMarkers.GET_COLLECTION_BY_ID, LogMessages.GET_COLLECTION_BY_ID, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.institution.NoSuchInstitutionException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(CollectionQueryServiceLogMarkers.GET_COLLECTION_BY_ID, LogMessages.GET_COLLECTION_BY_ID, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(CollectionQueryServiceLogMarkers.GET_COLLECTION_BY_ID, LogMessages.GET_COLLECTION_BY_ID, __logMessageArgs);
            throw e;
        }
    }

    @Override
    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.collection.Collection> getCollectionsByIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.collection.CollectionId> ids) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = Messages.GetCollectionsByIdsRequest.create(ids);

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(CollectionQueryServiceLogMarkers.GET_COLLECTIONS_BY_IDS, LogMessages.GET_COLLECTIONS_BY_IDS, __logMessageArgs);

        try {
            final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.collection.Collection> __returnValue = delegate.getCollectionsByIds(ids);

            __logMessageArgs[__logMessageArgs.length - 1] = __returnValue;
            logger.info(CollectionQueryServiceLogMarkers.GET_COLLECTIONS_BY_IDS, LogMessages.GET_COLLECTIONS_BY_IDS, __logMessageArgs);

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(CollectionQueryServiceLogMarkers.GET_COLLECTIONS_BY_IDS, LogMessages.GET_COLLECTIONS_BY_IDS, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.collection.NoSuchCollectionException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(CollectionQueryServiceLogMarkers.GET_COLLECTIONS_BY_IDS, LogMessages.GET_COLLECTIONS_BY_IDS, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.institution.NoSuchInstitutionException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(CollectionQueryServiceLogMarkers.GET_COLLECTIONS_BY_IDS, LogMessages.GET_COLLECTIONS_BY_IDS, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(CollectionQueryServiceLogMarkers.GET_COLLECTIONS_BY_IDS, LogMessages.GET_COLLECTIONS_BY_IDS, __logMessageArgs);
            throw e;
        }
    }

    @Override
    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.collection.CollectionEntry> getCollectionsByInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = Messages.GetCollectionsByInstitutionIdRequest.create(institutionId);

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(CollectionQueryServiceLogMarkers.GET_COLLECTIONS_BY_INSTITUTION_ID, LogMessages.GET_COLLECTIONS_BY_INSTITUTION_ID, __logMessageArgs);

        try {
            final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.collection.CollectionEntry> __returnValue = delegate.getCollectionsByInstitutionId(institutionId);

            __logMessageArgs[__logMessageArgs.length - 1] = __returnValue;
            logger.info(CollectionQueryServiceLogMarkers.GET_COLLECTIONS_BY_INSTITUTION_ID, LogMessages.GET_COLLECTIONS_BY_INSTITUTION_ID, __logMessageArgs);

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(CollectionQueryServiceLogMarkers.GET_COLLECTIONS_BY_INSTITUTION_ID, LogMessages.GET_COLLECTIONS_BY_INSTITUTION_ID, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.institution.NoSuchInstitutionException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(CollectionQueryServiceLogMarkers.GET_COLLECTIONS_BY_INSTITUTION_ID, LogMessages.GET_COLLECTIONS_BY_INSTITUTION_ID, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(CollectionQueryServiceLogMarkers.GET_COLLECTIONS_BY_INSTITUTION_ID, LogMessages.GET_COLLECTIONS_BY_INSTITUTION_ID, __logMessageArgs);
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingCollectionQueryService.class);
    private final org.dressdiscover.api.services.collection.CollectionQueryService delegate;

    private final static class LogMessages {
        public final static String GET_COLLECTION_BY_ID = "get_collection_by_id({}) -> {}";
        public final static String GET_COLLECTIONS_BY_IDS = "get_collections_by_ids({}) -> {}";
        public final static String GET_COLLECTIONS_BY_INSTITUTION_ID = "get_collections_by_institution_id({}) -> {}";
    }

    public final static String PRE_RETURN_VALUE = "...";
}
