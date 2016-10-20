package org.dressdiscover.lib.services.object;

@com.google.inject.Singleton
public class LoggingObjectSummaryQueryService implements org.dressdiscover.api.services.object.ObjectSummaryQueryService {
    public static class Markers {
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

    public org.dressdiscover.api.services.object.GetObjectSummariesResult getObjectSummaries(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) throws org.dressdiscover.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("get_object_summaries(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(Messages.GetObjectSummariesRequest.create(options, query));
        __logMessageStringBuilder.append(")");

        try {
            org.dressdiscover.api.services.object.GetObjectSummariesResult __returnValue = delegate.getObjectSummaries(options, query);

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.info(Markers.GET_OBJECT_SUMMARIES, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_OBJECT_SUMMARIES, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingObjectSummaryQueryService.class);
    private final org.dressdiscover.api.services.object.ObjectSummaryQueryService delegate;
}
