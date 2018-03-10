package org.dressdiscover.lib.services.object;

@com.google.inject.Singleton
public class LoggingObjectQueryService implements org.dressdiscover.api.services.object.ObjectQueryService {
    public final static class ObjectQueryServiceLogMarkers {
        public final static org.slf4j.Marker GET_OBJECT_BY_ID = org.slf4j.MarkerFactory.getMarker("GET_OBJECT_BY_ID");

        public final static org.slf4j.Marker OBJECT_QUERY_SERVICE = org.slf4j.MarkerFactory.getMarker("OBJECT_QUERY_SERVICE");
        static {
            OBJECT_QUERY_SERVICE.add(GET_OBJECT_BY_ID);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.object.LoggingObjectQueryService.delegate");

    @com.google.inject.Inject
    public LoggingObjectQueryService(@com.google.inject.name.Named("org.dressdiscover.lib.services.object.LoggingObjectQueryService.delegate") final org.dressdiscover.api.services.object.ObjectQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public org.dressdiscover.api.models.object.Object getObjectById(final org.dressdiscover.api.models.object.ObjectId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.collection.NoSuchCollectionException, org.dressdiscover.api.services.institution.NoSuchInstitutionException, org.dressdiscover.api.services.object.NoSuchObjectException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = id;

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(ObjectQueryServiceLogMarkers.GET_OBJECT_BY_ID, LogMessages.GET_OBJECT_BY_ID, __logMessageArgs);

        try {
            final org.dressdiscover.api.models.object.Object __returnValue = delegate.getObjectById(id);

            __logMessageArgs[__logMessageArgs.length - 1] = __returnValue;
            logger.info(ObjectQueryServiceLogMarkers.GET_OBJECT_BY_ID, LogMessages.GET_OBJECT_BY_ID, __logMessageArgs);

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(ObjectQueryServiceLogMarkers.GET_OBJECT_BY_ID, LogMessages.GET_OBJECT_BY_ID, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.collection.NoSuchCollectionException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(ObjectQueryServiceLogMarkers.GET_OBJECT_BY_ID, LogMessages.GET_OBJECT_BY_ID, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.institution.NoSuchInstitutionException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(ObjectQueryServiceLogMarkers.GET_OBJECT_BY_ID, LogMessages.GET_OBJECT_BY_ID, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.object.NoSuchObjectException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(ObjectQueryServiceLogMarkers.GET_OBJECT_BY_ID, LogMessages.GET_OBJECT_BY_ID, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(ObjectQueryServiceLogMarkers.GET_OBJECT_BY_ID, LogMessages.GET_OBJECT_BY_ID, __logMessageArgs);
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingObjectQueryService.class);
    private final org.dressdiscover.api.services.object.ObjectQueryService delegate;

    private final static class LogMessages {
        public final static String GET_OBJECT_BY_ID = "get_object_by_id(id={}) -> {}";
    }

    public final static String PRE_RETURN_VALUE = "...";
}
