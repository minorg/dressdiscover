package org.dressdiscover.api.services.qa;

@com.google.inject.Singleton
public class LoggingQaObjectQueryService implements org.dressdiscover.api.services.qa.QaObjectQueryService {
    public static class Markers {
        public final static org.slf4j.Marker GET_OBJECT_BY_ID = org.slf4j.MarkerFactory.getMarker("GET_OBJECT_BY_ID");
        public final static org.slf4j.Marker GET_OBJECTS = org.slf4j.MarkerFactory.getMarker("GET_OBJECTS");

        public final static org.slf4j.Marker QA_OBJECT_QUERY_SERVICE = org.slf4j.MarkerFactory.getMarker("QA_OBJECT_QUERY_SERVICE");
        static {
            QA_OBJECT_QUERY_SERVICE.add(GET_OBJECT_BY_ID);
            QA_OBJECT_QUERY_SERVICE.add(GET_OBJECTS);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.api.services.qa.LoggingQaObjectQueryService.delegate");

    @com.google.inject.Inject
    public LoggingQaObjectQueryService(@com.google.inject.name.Named("org.dressdiscover.api.services.qa.LoggingQaObjectQueryService.delegate") final org.dressdiscover.api.services.qa.QaObjectQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    public org.dressdiscover.api.models.qa.QaObject getObjectById(final org.dressdiscover.api.models.qa.QaObjectId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.qa.NoSuchObjectException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("get_object_by_id(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(Messages.GetObjectByIdRequest.create(id));
        __logMessageStringBuilder.append(")");

        try {
            org.dressdiscover.api.models.qa.QaObject __returnValue = delegate.getObjectById(id);

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.info(Markers.GET_OBJECT_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_OBJECT_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final org.dressdiscover.api.services.qa.NoSuchObjectException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_OBJECT_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final RuntimeException e) {
            __logMessageStringBuilder.append(" -> ");
            __logMessageArgs.add(e);
            logger.error(Markers.GET_OBJECT_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> getObjects() throws org.dressdiscover.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("get_objects(");
        __logMessageStringBuilder.append(")");

        try {
            com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> __returnValue = delegate.getObjects();

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.info(Markers.GET_OBJECTS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_OBJECTS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final RuntimeException e) {
            __logMessageStringBuilder.append(" -> ");
            __logMessageArgs.add(e);
            logger.error(Markers.GET_OBJECTS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingQaObjectQueryService.class);
    private final org.dressdiscover.api.services.qa.QaObjectQueryService delegate;
}
