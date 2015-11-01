package net.lab1318.costume.lib.services.collection;

@com.google.inject.Singleton
public class LoggingCollectionCommandService implements net.lab1318.costume.api.services.collection.CollectionCommandService {
    public static class Markers {
        public final static org.slf4j.Marker DELETE_COLLECTION_BY_ID = org.slf4j.MarkerFactory.getMarker("DELETE_COLLECTION_BY_ID");
        public final static org.slf4j.Marker DELETE_COLLECTIONS = org.slf4j.MarkerFactory.getMarker("DELETE_COLLECTIONS");
        public final static org.slf4j.Marker DELETE_COLLECTIONS_BY_INSTITUTION_ID = org.slf4j.MarkerFactory.getMarker("DELETE_COLLECTIONS_BY_INSTITUTION_ID");
        public final static org.slf4j.Marker POST_COLLECTION = org.slf4j.MarkerFactory.getMarker("POST_COLLECTION");

        public final static org.slf4j.Marker COLLECTION_COMMAND_SERVICE = org.slf4j.MarkerFactory.getMarker("COLLECTION_COMMAND_SERVICE");
        static {
            COLLECTION_COMMAND_SERVICE.add(DELETE_COLLECTION_BY_ID);
            COLLECTION_COMMAND_SERVICE.add(DELETE_COLLECTIONS);
            COLLECTION_COMMAND_SERVICE.add(DELETE_COLLECTIONS_BY_INSTITUTION_ID);
            COLLECTION_COMMAND_SERVICE.add(POST_COLLECTION);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("net.lab1318.costume.lib.services.collection.LoggingCollectionCommandService.delegate");

    @com.google.inject.Inject
    public LoggingCollectionCommandService(@com.google.inject.name.Named("net.lab1318.costume.lib.services.collection.LoggingCollectionCommandService.delegate") final net.lab1318.costume.api.services.collection.CollectionCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    public void deleteCollectionById(final net.lab1318.costume.api.models.collection.CollectionId id) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.collection.NoSuchCollectionException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("delete_collection_by_id(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(new Messages.DeleteCollectionByIdRequest(id));
        __logMessageStringBuilder.append(")");

        try {
            delegate.deleteCollectionById(id);

            logger.debug(Markers.DELETE_COLLECTION_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.DELETE_COLLECTION_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final net.lab1318.costume.api.services.collection.NoSuchCollectionException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.DELETE_COLLECTION_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public void deleteCollections() throws net.lab1318.costume.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("delete_collections(");
        __logMessageStringBuilder.append(")");

        try {
            delegate.deleteCollections();

            logger.debug(Markers.DELETE_COLLECTIONS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.DELETE_COLLECTIONS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public void deleteCollectionsByInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) throws net.lab1318.costume.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("delete_collections_by_institution_id(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(new Messages.DeleteCollectionsByInstitutionIdRequest(institutionId));
        __logMessageStringBuilder.append(")");

        try {
            delegate.deleteCollectionsByInstitutionId(institutionId);

            logger.debug(Markers.DELETE_COLLECTIONS_BY_INSTITUTION_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.DELETE_COLLECTIONS_BY_INSTITUTION_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public net.lab1318.costume.api.models.collection.CollectionId postCollection(final net.lab1318.costume.api.models.collection.Collection collection) throws net.lab1318.costume.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("post_collection(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(new Messages.PostCollectionRequest(collection));
        __logMessageStringBuilder.append(")");

        try {
            net.lab1318.costume.api.models.collection.CollectionId __returnValue = delegate.postCollection(collection);

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.debug(Markers.POST_COLLECTION, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.POST_COLLECTION, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingCollectionCommandService.class);
    private final net.lab1318.costume.api.services.collection.CollectionCommandService delegate;
}
