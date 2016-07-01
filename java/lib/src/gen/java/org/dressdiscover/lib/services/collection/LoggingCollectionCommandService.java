package org.dressdiscover.lib.services.collection;

@com.google.inject.Singleton
public class LoggingCollectionCommandService implements org.dressdiscover.api.services.collection.CollectionCommandService {
    public static class Markers {
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

    public void deleteCollectionById(final org.dressdiscover.api.models.collection.CollectionId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("delete_collection_by_id(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(new Messages.DeleteCollectionByIdRequest(id));
        __logMessageStringBuilder.append(")");

        try {
            delegate.deleteCollectionById(id);

            logger.debug(Markers.DELETE_COLLECTION_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.DELETE_COLLECTION_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final org.dressdiscover.api.services.collection.NoSuchCollectionException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.DELETE_COLLECTION_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final org.dressdiscover.api.services.institution.NoSuchInstitutionException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.DELETE_COLLECTION_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public void deleteCollectionsByInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("delete_collections_by_institution_id(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(new Messages.DeleteCollectionsByInstitutionIdRequest(institutionId));
        __logMessageStringBuilder.append(")");

        try {
            delegate.deleteCollectionsByInstitutionId(institutionId);

            logger.debug(Markers.DELETE_COLLECTIONS_BY_INSTITUTION_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.DELETE_COLLECTIONS_BY_INSTITUTION_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final org.dressdiscover.api.services.institution.NoSuchInstitutionException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.DELETE_COLLECTIONS_BY_INSTITUTION_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public void putCollection(final org.dressdiscover.api.models.collection.CollectionId id, final org.dressdiscover.api.models.collection.Collection collection) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.institution.NoSuchInstitutionException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("put_collection(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(new Messages.PutCollectionRequest(id, collection));
        __logMessageStringBuilder.append(")");

        try {
            delegate.putCollection(id, collection);

            logger.debug(Markers.PUT_COLLECTION, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.PUT_COLLECTION, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final org.dressdiscover.api.services.institution.NoSuchInstitutionException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.PUT_COLLECTION, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingCollectionCommandService.class);
    private final org.dressdiscover.api.services.collection.CollectionCommandService delegate;
}
