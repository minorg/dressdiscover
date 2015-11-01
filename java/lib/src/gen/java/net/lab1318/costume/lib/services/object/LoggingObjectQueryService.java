package net.lab1318.costume.lib.services.object;

@com.google.inject.Singleton
public class LoggingObjectQueryService implements net.lab1318.costume.api.services.object.ObjectQueryService {
    public static class Markers {
        public final static org.slf4j.Marker GET_OBJECT_BY_ID = org.slf4j.MarkerFactory.getMarker("GET_OBJECT_BY_ID");
        public final static org.slf4j.Marker GET_OBJECTS = org.slf4j.MarkerFactory.getMarker("GET_OBJECTS");
        public final static org.slf4j.Marker GET_OBJECTS_BY_COLLECTION_ID = org.slf4j.MarkerFactory.getMarker("GET_OBJECTS_BY_COLLECTION_ID");
        public final static org.slf4j.Marker GET_OBJECTS_BY_INSTITUTION_ID = org.slf4j.MarkerFactory.getMarker("GET_OBJECTS_BY_INSTITUTION_ID");

        public final static org.slf4j.Marker OBJECT_QUERY_SERVICE = org.slf4j.MarkerFactory.getMarker("OBJECT_QUERY_SERVICE");
        static {
            OBJECT_QUERY_SERVICE.add(GET_OBJECT_BY_ID);
            OBJECT_QUERY_SERVICE.add(GET_OBJECTS);
            OBJECT_QUERY_SERVICE.add(GET_OBJECTS_BY_COLLECTION_ID);
            OBJECT_QUERY_SERVICE.add(GET_OBJECTS_BY_INSTITUTION_ID);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("net.lab1318.costume.lib.services.object.LoggingObjectQueryService.delegate");

    @com.google.inject.Inject
    public LoggingObjectQueryService(@com.google.inject.name.Named("net.lab1318.costume.lib.services.object.LoggingObjectQueryService.delegate") final net.lab1318.costume.api.services.object.ObjectQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    public net.lab1318.costume.api.models.object.Object getObjectById(final net.lab1318.costume.api.models.object.ObjectId id) throws net.lab1318.costume.api.services.object.InvalidObjectIdException, net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.object.NoSuchObjectException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("get_object_by_id(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(new Messages.GetObjectByIdRequest(id));
        __logMessageStringBuilder.append(")");

        try {
            net.lab1318.costume.api.models.object.Object __returnValue = delegate.getObjectById(id);

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.debug(Markers.GET_OBJECT_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final net.lab1318.costume.api.services.object.InvalidObjectIdException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_OBJECT_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_OBJECT_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final net.lab1318.costume.api.services.object.NoSuchObjectException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_OBJECT_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> getObjects() throws net.lab1318.costume.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("get_objects(");
        __logMessageStringBuilder.append(")");

        try {
            com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> __returnValue = delegate.getObjects();

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.debug(Markers.GET_OBJECTS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_OBJECTS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> getObjectsByCollectionId(final net.lab1318.costume.api.models.collection.CollectionId collectionId) throws net.lab1318.costume.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("get_objects_by_collection_id(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(new Messages.GetObjectsByCollectionIdRequest(collectionId));
        __logMessageStringBuilder.append(")");

        try {
            com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> __returnValue = delegate.getObjectsByCollectionId(collectionId);

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.debug(Markers.GET_OBJECTS_BY_COLLECTION_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_OBJECTS_BY_COLLECTION_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> getObjectsByInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) throws net.lab1318.costume.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("get_objects_by_institution_id(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(new Messages.GetObjectsByInstitutionIdRequest(institutionId));
        __logMessageStringBuilder.append(")");

        try {
            com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> __returnValue = delegate.getObjectsByInstitutionId(institutionId);

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.debug(Markers.GET_OBJECTS_BY_INSTITUTION_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_OBJECTS_BY_INSTITUTION_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingObjectQueryService.class);
    private final net.lab1318.costume.api.services.object.ObjectQueryService delegate;
}
