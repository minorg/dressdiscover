package org.dressdiscover.lib.services.collection;

@com.google.inject.Singleton
public class LoggingCollectionCommandService implements org.dressdiscover.api.services.collection.CollectionCommandService {
    public final static class CollectionCommandServiceLogMarkers {
        public final static org.slf4j.Marker DELETE_COLLECTION_BY_ID = org.slf4j.MarkerFactory.getMarker("DELETE_COLLECTION_BY_ID");
        public final static org.slf4j.Marker DELETE_COLLECTIONS_BY_INSTITUTION_ID = org.slf4j.MarkerFactory.getMarker("DELETE_COLLECTIONS_BY_INSTITUTION_ID");
        public final static org.slf4j.Marker PUT_COLLECTION = org.slf4j.MarkerFactory.getMarker("PUT_COLLECTION");

        public final static org.slf4j.Marker COLLECTION_COMMAND_SERVICE = org.slf4j.MarkerFactory.getMarker("COLLECTION_COMMAND_SERVICE");
        static {
            COLLECTION_COMMAND_SERVICE.add(DELETE_COLLECTION_BY_ID);
            COLLECTION_COMMAND_SERVICE.add(DELETE_COLLECTIONS_BY_INSTITUTION_ID);
            COLLECTION_COMMAND_SERVICE.add(PUT_COLLECTION);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.collection.LoggingCollectionCommandService.delegate");

    @com.google.inject.Inject
    public LoggingCollectionCommandService(@com.google.inject.name.Named("org.dressdiscover.lib.services.collection.LoggingCollectionCommandService.delegate") final org.dressdiscover.api.services.collection.CollectionCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public void deleteCollectionById(final org.dressdiscover.api.models.collection.CollectionId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = id;

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(CollectionCommandServiceLogMarkers.DELETE_COLLECTION_BY_ID, LogMessages.DELETE_COLLECTION_BY_ID, __logMessageArgs);

        try {
            delegate.deleteCollectionById(id);

            __logMessageArgs[__logMessageArgs.length - 1] = VOID_RETURN_VALUE;
            logger.info(CollectionCommandServiceLogMarkers.DELETE_COLLECTION_BY_ID, LogMessages.DELETE_COLLECTION_BY_ID, __logMessageArgs);
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(CollectionCommandServiceLogMarkers.DELETE_COLLECTION_BY_ID, LogMessages.DELETE_COLLECTION_BY_ID, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.collection.NoSuchCollectionException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(CollectionCommandServiceLogMarkers.DELETE_COLLECTION_BY_ID, LogMessages.DELETE_COLLECTION_BY_ID, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.institution.NoSuchInstitutionException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(CollectionCommandServiceLogMarkers.DELETE_COLLECTION_BY_ID, LogMessages.DELETE_COLLECTION_BY_ID, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(CollectionCommandServiceLogMarkers.DELETE_COLLECTION_BY_ID, LogMessages.DELETE_COLLECTION_BY_ID, __logMessageArgs);
            throw e;
        }
    }

    @Override
    public void deleteCollectionsByInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = institutionId;

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(CollectionCommandServiceLogMarkers.DELETE_COLLECTIONS_BY_INSTITUTION_ID, LogMessages.DELETE_COLLECTIONS_BY_INSTITUTION_ID, __logMessageArgs);

        try {
            delegate.deleteCollectionsByInstitutionId(institutionId);

            __logMessageArgs[__logMessageArgs.length - 1] = VOID_RETURN_VALUE;
            logger.info(CollectionCommandServiceLogMarkers.DELETE_COLLECTIONS_BY_INSTITUTION_ID, LogMessages.DELETE_COLLECTIONS_BY_INSTITUTION_ID, __logMessageArgs);
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(CollectionCommandServiceLogMarkers.DELETE_COLLECTIONS_BY_INSTITUTION_ID, LogMessages.DELETE_COLLECTIONS_BY_INSTITUTION_ID, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.institution.NoSuchInstitutionException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(CollectionCommandServiceLogMarkers.DELETE_COLLECTIONS_BY_INSTITUTION_ID, LogMessages.DELETE_COLLECTIONS_BY_INSTITUTION_ID, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(CollectionCommandServiceLogMarkers.DELETE_COLLECTIONS_BY_INSTITUTION_ID, LogMessages.DELETE_COLLECTIONS_BY_INSTITUTION_ID, __logMessageArgs);
            throw e;
        }
    }

    @Override
    public void putCollection(final org.dressdiscover.api.models.collection.Collection collection, final org.dressdiscover.api.models.collection.CollectionId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        final Object[] __logMessageArgs = new Object[3];
        __logMessageArgs[0] = collection;
        __logMessageArgs[1] = id;

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(CollectionCommandServiceLogMarkers.PUT_COLLECTION, LogMessages.PUT_COLLECTION, __logMessageArgs);

        try {
            delegate.putCollection(collection, id);

            __logMessageArgs[__logMessageArgs.length - 1] = VOID_RETURN_VALUE;
            logger.info(CollectionCommandServiceLogMarkers.PUT_COLLECTION, LogMessages.PUT_COLLECTION, __logMessageArgs);
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(CollectionCommandServiceLogMarkers.PUT_COLLECTION, LogMessages.PUT_COLLECTION, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.institution.NoSuchInstitutionException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(CollectionCommandServiceLogMarkers.PUT_COLLECTION, LogMessages.PUT_COLLECTION, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(CollectionCommandServiceLogMarkers.PUT_COLLECTION, LogMessages.PUT_COLLECTION, __logMessageArgs);
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingCollectionCommandService.class);
    private final org.dressdiscover.api.services.collection.CollectionCommandService delegate;

    private final static class LogMessages {
        public final static String DELETE_COLLECTION_BY_ID = "delete_collection_by_id(id={}) -> {}";
        public final static String DELETE_COLLECTIONS_BY_INSTITUTION_ID = "delete_collections_by_institution_id(institutionId={}) -> {}";
        public final static String PUT_COLLECTION = "put_collection(collection={}, id={}) -> {}";
    }

    public final static String PRE_RETURN_VALUE = "...";
    public final static String VOID_RETURN_VALUE = "void";
}
