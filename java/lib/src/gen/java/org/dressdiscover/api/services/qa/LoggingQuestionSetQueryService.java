package org.dressdiscover.api.services.qa;

@com.google.inject.Singleton
public class LoggingQuestionSetQueryService implements org.dressdiscover.api.services.qa.QuestionSetQueryService {
    public static class Markers {
        public final static org.slf4j.Marker GET_QUESTION_SETS = org.slf4j.MarkerFactory.getMarker("GET_QUESTION_SETS");

        public final static org.slf4j.Marker QUESTION_SET_QUERY_SERVICE = org.slf4j.MarkerFactory.getMarker("QUESTION_SET_QUERY_SERVICE");
        static {
            QUESTION_SET_QUERY_SERVICE.add(GET_QUESTION_SETS);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.api.services.qa.LoggingQuestionSetQueryService.delegate");

    @com.google.inject.Inject
    public LoggingQuestionSetQueryService(@com.google.inject.name.Named("org.dressdiscover.api.services.qa.LoggingQuestionSetQueryService.delegate") final org.dressdiscover.api.services.qa.QuestionSetQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> getQuestionSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> ids) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.qa.NoSuchQuestionSetException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("get_question_sets(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(Messages.GetQuestionSetsRequest.create(ids));
        __logMessageStringBuilder.append(")");

        try {
            com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> __returnValue = delegate.getQuestionSets(ids);

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.info(Markers.GET_QUESTION_SETS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_QUESTION_SETS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final org.dressdiscover.api.services.qa.NoSuchQuestionSetException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_QUESTION_SETS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final RuntimeException e) {
            __logMessageStringBuilder.append(" -> ");
            __logMessageArgs.add(e);
            logger.error(Markers.GET_QUESTION_SETS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingQuestionSetQueryService.class);
    private final org.dressdiscover.api.services.qa.QuestionSetQueryService delegate;
}
