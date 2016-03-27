package net.lab1318.costume.lib.services.object;

@com.google.inject.Singleton
public class LoggingObjectCommandService implements net.lab1318.costume.api.services.object.ObjectCommandService {
    public static class Markers {
        public final static org.slf4j.Marker DELETE_OBJECTS_BY_COLLECTION_ID = org.slf4j.MarkerFactory.getMarker("DELETE_OBJECTS_BY_COLLECTION_ID");
        public final static org.slf4j.Marker DELETE_OBJECTS_BY_INSTITUTION_ID = org.slf4j.MarkerFactory.getMarker("DELETE_OBJECTS_BY_INSTITUTION_ID");
        public final static org.slf4j.Marker PUT_OBJECT = org.slf4j.MarkerFactory.getMarker("PUT_OBJECT");
        public final static org.slf4j.Marker PUT_OBJECTS = org.slf4j.MarkerFactory.getMarker("PUT_OBJECTS");
        public final static org.slf4j.Marker RESUMMARIZE_OBJECTS = org.slf4j.MarkerFactory.getMarker("RESUMMARIZE_OBJECTS");

        public final static org.slf4j.Marker OBJECT_COMMAND_SERVICE = org.slf4j.MarkerFactory.getMarker("OBJECT_COMMAND_SERVICE");
        static {
            OBJECT_COMMAND_SERVICE.add(DELETE_OBJECTS_BY_COLLECTION_ID);
            OBJECT_COMMAND_SERVICE.add(DELETE_OBJECTS_BY_INSTITUTION_ID);
            OBJECT_COMMAND_SERVICE.add(PUT_OBJECT);
            OBJECT_COMMAND_SERVICE.add(PUT_OBJECTS);
            OBJECT_COMMAND_SERVICE.add(RESUMMARIZE_OBJECTS);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("net.lab1318.costume.lib.services.object.LoggingObjectCommandService.delegate");

    @com.google.inject.Inject
    public LoggingObjectCommandService(@com.google.inject.name.Named("net.lab1318.costume.lib.services.object.LoggingObjectCommandService.delegate") final net.lab1318.costume.api.services.object.ObjectCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    public com.google.common.primitives.UnsignedInteger deleteObjectsByCollectionId(final net.lab1318.costume.api.models.collection.CollectionId collectionId) throws net.lab1318.costume.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("delete_objects_by_collection_id(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(new Messages.DeleteObjectsByCollectionIdRequest(collectionId));
        __logMessageStringBuilder.append(")");

        try {
            com.google.common.primitives.UnsignedInteger __returnValue = delegate.deleteObjectsByCollectionId(collectionId);

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.debug(Markers.DELETE_OBJECTS_BY_COLLECTION_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.DELETE_OBJECTS_BY_COLLECTION_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public com.google.common.primitives.UnsignedInteger deleteObjectsByInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) throws net.lab1318.costume.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("delete_objects_by_institution_id(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(new Messages.DeleteObjectsByInstitutionIdRequest(institutionId));
        __logMessageStringBuilder.append(")");

        try {
            com.google.common.primitives.UnsignedInteger __returnValue = delegate.deleteObjectsByInstitutionId(institutionId);

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.debug(Markers.DELETE_OBJECTS_BY_INSTITUTION_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.DELETE_OBJECTS_BY_INSTITUTION_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public void putObject(final net.lab1318.costume.api.models.object.ObjectId id, final net.lab1318.costume.api.models.object.Object object) throws net.lab1318.costume.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("put_object(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(new Messages.PutObjectRequest(id, object));
        __logMessageStringBuilder.append(")");

        try {
            delegate.putObject(id, object);

            logger.debug(Markers.PUT_OBJECT, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.PUT_OBJECT, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public void putObjects(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> objects) throws net.lab1318.costume.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("put_objects(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(new Messages.PutObjectsRequest(objects));
        __logMessageStringBuilder.append(")");

        try {
            delegate.putObjects(objects);

            logger.debug(Markers.PUT_OBJECTS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.PUT_OBJECTS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public void resummarizeObjects() throws net.lab1318.costume.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("resummarize_objects(");
        __logMessageStringBuilder.append(")");

        try {
            delegate.resummarizeObjects();

            logger.debug(Markers.RESUMMARIZE_OBJECTS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.RESUMMARIZE_OBJECTS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingObjectCommandService.class);
    private final net.lab1318.costume.api.services.object.ObjectCommandService delegate;
}
