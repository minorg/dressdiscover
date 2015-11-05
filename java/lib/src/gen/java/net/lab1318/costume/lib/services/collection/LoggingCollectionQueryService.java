package net.lab1318.costume.lib.services.collection;

@com.google.inject.Singleton
public class LoggingCollectionQueryService implements net.lab1318.costume.api.services.collection.CollectionQueryService {
    public static class Markers {
        public final static org.slf4j.Marker GET_COLLECTION_BY_ID = org.slf4j.MarkerFactory.getMarker("GET_COLLECTION_BY_ID");
        public final static org.slf4j.Marker GET_COLLECTIONS = org.slf4j.MarkerFactory.getMarker("GET_COLLECTIONS");
        public final static org.slf4j.Marker GET_COLLECTIONS_BY_INSTITUTION_ID = org.slf4j.MarkerFactory.getMarker("GET_COLLECTIONS_BY_INSTITUTION_ID");

        public final static org.slf4j.Marker COLLECTION_QUERY_SERVICE = org.slf4j.MarkerFactory.getMarker("COLLECTION_QUERY_SERVICE");
        static {
            COLLECTION_QUERY_SERVICE.add(GET_COLLECTION_BY_ID);
            COLLECTION_QUERY_SERVICE.add(GET_COLLECTIONS);
            COLLECTION_QUERY_SERVICE.add(GET_COLLECTIONS_BY_INSTITUTION_ID);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("net.lab1318.costume.lib.services.collection.LoggingCollectionQueryService.delegate");

    @com.google.inject.Inject
    public LoggingCollectionQueryService(@com.google.inject.name.Named("net.lab1318.costume.lib.services.collection.LoggingCollectionQueryService.delegate") final net.lab1318.costume.api.services.collection.CollectionQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    public net.lab1318.costume.api.models.collection.Collection getCollectionById(final net.lab1318.costume.api.models.collection.CollectionId id) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.collection.NoSuchCollectionException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("get_collection_by_id(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(new Messages.GetCollectionByIdRequest(id));
        __logMessageStringBuilder.append(")");

        try {
            net.lab1318.costume.api.models.collection.Collection __returnValue = delegate.getCollectionById(id);

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.debug(Markers.GET_COLLECTION_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_COLLECTION_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final net.lab1318.costume.api.services.collection.NoSuchCollectionException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_COLLECTION_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.collection.CollectionEntry> getCollections() throws net.lab1318.costume.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("get_collections(");
        __logMessageStringBuilder.append(")");

        try {
            com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.collection.CollectionEntry> __returnValue = delegate.getCollections();

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.debug(Markers.GET_COLLECTIONS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_COLLECTIONS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.collection.CollectionEntry> getCollectionsByInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) throws net.lab1318.costume.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("get_collections_by_institution_id(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(new Messages.GetCollectionsByInstitutionIdRequest(institutionId));
        __logMessageStringBuilder.append(")");

        try {
            com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.collection.CollectionEntry> __returnValue = delegate.getCollectionsByInstitutionId(institutionId);

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.debug(Markers.GET_COLLECTIONS_BY_INSTITUTION_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_COLLECTIONS_BY_INSTITUTION_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingCollectionQueryService.class);
    private final net.lab1318.costume.api.services.collection.CollectionQueryService delegate;
}
