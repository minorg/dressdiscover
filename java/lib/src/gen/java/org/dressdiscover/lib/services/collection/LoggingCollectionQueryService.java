package org.dressdiscover.lib.services.collection;

@com.google.inject.Singleton
public class LoggingCollectionQueryService implements org.dressdiscover.api.services.collection.CollectionQueryService {
    public static class Markers {
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

    public org.dressdiscover.api.models.collection.Collection getCollectionById(final org.dressdiscover.api.models.collection.CollectionId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("get_collection_by_id(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(Messages.GetCollectionByIdRequest.create(id));
        __logMessageStringBuilder.append(")");

        try {
            org.dressdiscover.api.models.collection.Collection __returnValue = delegate.getCollectionById(id);

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.info(Markers.GET_COLLECTION_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_COLLECTION_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final org.dressdiscover.api.services.collection.NoSuchCollectionException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_COLLECTION_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final org.dressdiscover.api.services.institution.NoSuchInstitutionException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_COLLECTION_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final RuntimeException e) {
            __logMessageStringBuilder.append(" -> ");
            __logMessageArgs.add(e);
            logger.error(Markers.GET_COLLECTION_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.collection.Collection> getCollectionsByIds(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.collection.CollectionId> ids) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("get_collections_by_ids(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(Messages.GetCollectionsByIdsRequest.create(ids));
        __logMessageStringBuilder.append(")");

        try {
            com.google.common.collect.ImmutableList<org.dressdiscover.api.models.collection.Collection> __returnValue = delegate.getCollectionsByIds(ids);

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.info(Markers.GET_COLLECTIONS_BY_IDS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_COLLECTIONS_BY_IDS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final org.dressdiscover.api.services.collection.NoSuchCollectionException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_COLLECTIONS_BY_IDS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final org.dressdiscover.api.services.institution.NoSuchInstitutionException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_COLLECTIONS_BY_IDS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final RuntimeException e) {
            __logMessageStringBuilder.append(" -> ");
            __logMessageArgs.add(e);
            logger.error(Markers.GET_COLLECTIONS_BY_IDS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.collection.CollectionEntry> getCollectionsByInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("get_collections_by_institution_id(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(Messages.GetCollectionsByInstitutionIdRequest.create(institutionId));
        __logMessageStringBuilder.append(")");

        try {
            com.google.common.collect.ImmutableList<org.dressdiscover.api.models.collection.CollectionEntry> __returnValue = delegate.getCollectionsByInstitutionId(institutionId);

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.info(Markers.GET_COLLECTIONS_BY_INSTITUTION_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_COLLECTIONS_BY_INSTITUTION_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final org.dressdiscover.api.services.institution.NoSuchInstitutionException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_COLLECTIONS_BY_INSTITUTION_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final RuntimeException e) {
            __logMessageStringBuilder.append(" -> ");
            __logMessageArgs.add(e);
            logger.error(Markers.GET_COLLECTIONS_BY_INSTITUTION_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingCollectionQueryService.class);
    private final org.dressdiscover.api.services.collection.CollectionQueryService delegate;
}
