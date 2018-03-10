package org.dressdiscover.lib.services.object;

@com.google.inject.Singleton
public class LoggingObjectSummaryQueryService implements org.dressdiscover.api.services.object.ObjectSummaryQueryService {
    public final static class ObjectSummaryQueryServiceLogMarkers {
        public final static org.slf4j.Marker GET_OBJECT_SUMMARIES = org.slf4j.MarkerFactory.getMarker("GET_OBJECT_SUMMARIES");

        public final static org.slf4j.Marker OBJECT_SUMMARY_QUERY_SERVICE = org.slf4j.MarkerFactory.getMarker("OBJECT_SUMMARY_QUERY_SERVICE");
        static {
            OBJECT_SUMMARY_QUERY_SERVICE.add(GET_OBJECT_SUMMARIES);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.object.LoggingObjectSummaryQueryService.delegate");

    @com.google.inject.Inject
    public LoggingObjectSummaryQueryService(@com.google.inject.name.Named("org.dressdiscover.lib.services.object.LoggingObjectSummaryQueryService.delegate") final org.dressdiscover.api.services.object.ObjectSummaryQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public org.dressdiscover.api.services.object.GetObjectSummariesResult getObjectSummaries(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) throws org.dressdiscover.api.services.IoException {
        final Object[] __logMessageArgs = new Object[3];
        __logMessageArgs[0] = options.orNull();
        __logMessageArgs[1] = query.orNull();

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(ObjectSummaryQueryServiceLogMarkers.GET_OBJECT_SUMMARIES, LogMessages.GET_OBJECT_SUMMARIES, __logMessageArgs);

        try {
            final org.dressdiscover.api.services.object.GetObjectSummariesResult __returnValue = delegate.getObjectSummaries(options, query);

            __logMessageArgs[__logMessageArgs.length - 1] = __returnValue;
            logger.info(ObjectSummaryQueryServiceLogMarkers.GET_OBJECT_SUMMARIES, LogMessages.GET_OBJECT_SUMMARIES, __logMessageArgs);

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(ObjectSummaryQueryServiceLogMarkers.GET_OBJECT_SUMMARIES, LogMessages.GET_OBJECT_SUMMARIES, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(ObjectSummaryQueryServiceLogMarkers.GET_OBJECT_SUMMARIES, LogMessages.GET_OBJECT_SUMMARIES, __logMessageArgs);
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingObjectSummaryQueryService.class);
    private final org.dressdiscover.api.services.object.ObjectSummaryQueryService delegate;

    private final static class LogMessages {
        public final static String GET_OBJECT_SUMMARIES = "get_object_summaries(options={}, query={}) -> {}";
    }

    public final static String PRE_RETURN_VALUE = "...";
}
