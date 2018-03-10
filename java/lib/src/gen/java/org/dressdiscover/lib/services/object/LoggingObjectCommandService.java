package org.dressdiscover.lib.services.object;

@com.google.inject.Singleton
public class LoggingObjectCommandService implements org.dressdiscover.api.services.object.ObjectCommandService {
    public final static class ObjectCommandServiceLogMarkers {
        public final static org.slf4j.Marker DELETE_OBJECTS_BY_COLLECTION_ID = org.slf4j.MarkerFactory.getMarker("DELETE_OBJECTS_BY_COLLECTION_ID");
        public final static org.slf4j.Marker PUT_OBJECT = org.slf4j.MarkerFactory.getMarker("PUT_OBJECT");
        public final static org.slf4j.Marker PUT_OBJECTS = org.slf4j.MarkerFactory.getMarker("PUT_OBJECTS");
        public final static org.slf4j.Marker RESUMMARIZE_OBJECTS = org.slf4j.MarkerFactory.getMarker("RESUMMARIZE_OBJECTS");

        public final static org.slf4j.Marker OBJECT_COMMAND_SERVICE = org.slf4j.MarkerFactory.getMarker("OBJECT_COMMAND_SERVICE");
        static {
            OBJECT_COMMAND_SERVICE.add(DELETE_OBJECTS_BY_COLLECTION_ID);
            OBJECT_COMMAND_SERVICE.add(PUT_OBJECT);
            OBJECT_COMMAND_SERVICE.add(PUT_OBJECTS);
            OBJECT_COMMAND_SERVICE.add(RESUMMARIZE_OBJECTS);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.object.LoggingObjectCommandService.delegate");

    @com.google.inject.Inject
    public LoggingObjectCommandService(@com.google.inject.name.Named("org.dressdiscover.lib.services.object.LoggingObjectCommandService.delegate") final org.dressdiscover.api.services.object.ObjectCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public int deleteObjectsByCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = collectionId;

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(ObjectCommandServiceLogMarkers.DELETE_OBJECTS_BY_COLLECTION_ID, LogMessages.DELETE_OBJECTS_BY_COLLECTION_ID, __logMessageArgs);

        try {
            final int __returnValue = delegate.deleteObjectsByCollectionId(collectionId);

            __logMessageArgs[__logMessageArgs.length - 1] = __returnValue;
            logger.info(ObjectCommandServiceLogMarkers.DELETE_OBJECTS_BY_COLLECTION_ID, LogMessages.DELETE_OBJECTS_BY_COLLECTION_ID, __logMessageArgs);

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(ObjectCommandServiceLogMarkers.DELETE_OBJECTS_BY_COLLECTION_ID, LogMessages.DELETE_OBJECTS_BY_COLLECTION_ID, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.collection.NoSuchCollectionException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(ObjectCommandServiceLogMarkers.DELETE_OBJECTS_BY_COLLECTION_ID, LogMessages.DELETE_OBJECTS_BY_COLLECTION_ID, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.institution.NoSuchInstitutionException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(ObjectCommandServiceLogMarkers.DELETE_OBJECTS_BY_COLLECTION_ID, LogMessages.DELETE_OBJECTS_BY_COLLECTION_ID, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(ObjectCommandServiceLogMarkers.DELETE_OBJECTS_BY_COLLECTION_ID, LogMessages.DELETE_OBJECTS_BY_COLLECTION_ID, __logMessageArgs);
            throw e;
        }
    }

    @Override
    public void putObject(final org.dressdiscover.api.models.object.ObjectId id, final org.dressdiscover.api.models.object.Object object) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        final Object[] __logMessageArgs = new Object[3];
        __logMessageArgs[0] = id;
        __logMessageArgs[1] = object;

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(ObjectCommandServiceLogMarkers.PUT_OBJECT, LogMessages.PUT_OBJECT, __logMessageArgs);

        try {
            delegate.putObject(id, object);

            __logMessageArgs[__logMessageArgs.length - 1] = VOID_RETURN_VALUE;
            logger.info(ObjectCommandServiceLogMarkers.PUT_OBJECT, LogMessages.PUT_OBJECT, __logMessageArgs);
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(ObjectCommandServiceLogMarkers.PUT_OBJECT, LogMessages.PUT_OBJECT, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.collection.NoSuchCollectionException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(ObjectCommandServiceLogMarkers.PUT_OBJECT, LogMessages.PUT_OBJECT, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.institution.NoSuchInstitutionException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(ObjectCommandServiceLogMarkers.PUT_OBJECT, LogMessages.PUT_OBJECT, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(ObjectCommandServiceLogMarkers.PUT_OBJECT, LogMessages.PUT_OBJECT, __logMessageArgs);
            throw e;
        }
    }

    @Override
    public void putObjects(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.object.ObjectEntry> objects) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = objects;

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(ObjectCommandServiceLogMarkers.PUT_OBJECTS, LogMessages.PUT_OBJECTS, __logMessageArgs);

        try {
            delegate.putObjects(objects);

            __logMessageArgs[__logMessageArgs.length - 1] = VOID_RETURN_VALUE;
            logger.info(ObjectCommandServiceLogMarkers.PUT_OBJECTS, LogMessages.PUT_OBJECTS, __logMessageArgs);
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(ObjectCommandServiceLogMarkers.PUT_OBJECTS, LogMessages.PUT_OBJECTS, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.collection.NoSuchCollectionException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(ObjectCommandServiceLogMarkers.PUT_OBJECTS, LogMessages.PUT_OBJECTS, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.institution.NoSuchInstitutionException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(ObjectCommandServiceLogMarkers.PUT_OBJECTS, LogMessages.PUT_OBJECTS, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(ObjectCommandServiceLogMarkers.PUT_OBJECTS, LogMessages.PUT_OBJECTS, __logMessageArgs);
            throw e;
        }
    }

    @Override
    public void resummarizeObjects() throws org.dressdiscover.api.services.IoException {
        Object __logMessageArgs = null;

        __logMessageArgs = PRE_RETURN_VALUE;
        logger.debug(ObjectCommandServiceLogMarkers.RESUMMARIZE_OBJECTS, LogMessages.RESUMMARIZE_OBJECTS, __logMessageArgs);

        try {
            delegate.resummarizeObjects();

            __logMessageArgs = VOID_RETURN_VALUE;
            logger.info(ObjectCommandServiceLogMarkers.RESUMMARIZE_OBJECTS, LogMessages.RESUMMARIZE_OBJECTS, __logMessageArgs);
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs = e.toString();
            logger.error(ObjectCommandServiceLogMarkers.RESUMMARIZE_OBJECTS, LogMessages.RESUMMARIZE_OBJECTS, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs = e;
            logger.error(ObjectCommandServiceLogMarkers.RESUMMARIZE_OBJECTS, LogMessages.RESUMMARIZE_OBJECTS, __logMessageArgs);
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingObjectCommandService.class);
    private final org.dressdiscover.api.services.object.ObjectCommandService delegate;

    private final static class LogMessages {
        public final static String DELETE_OBJECTS_BY_COLLECTION_ID = "delete_objects_by_collection_id(collectionId={}) -> {}";
        public final static String PUT_OBJECT = "put_object(id={}, object={}) -> {}";
        public final static String PUT_OBJECTS = "put_objects(objects={}) -> {}";
        public final static String RESUMMARIZE_OBJECTS = "resummarize_objects() -> {}";
    }

    public final static String PRE_RETURN_VALUE = "...";
    public final static String VOID_RETURN_VALUE = "void";
}
