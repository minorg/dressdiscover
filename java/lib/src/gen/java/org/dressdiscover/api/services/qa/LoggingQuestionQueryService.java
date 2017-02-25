package org.dressdiscover.api.services.qa;

@com.google.inject.Singleton
public class LoggingQuestionQueryService implements org.dressdiscover.api.services.qa.QuestionQueryService {
    public static class Markers {
        public final static org.slf4j.Marker GET_QUESTIONS = org.slf4j.MarkerFactory.getMarker("GET_QUESTIONS");

        public final static org.slf4j.Marker QUESTION_QUERY_SERVICE = org.slf4j.MarkerFactory.getMarker("QUESTION_QUERY_SERVICE");
        static {
            QUESTION_QUERY_SERVICE.add(GET_QUESTIONS);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.api.services.qa.LoggingQuestionQueryService.delegate");

    @com.google.inject.Inject
    public LoggingQuestionQueryService(@com.google.inject.name.Named("org.dressdiscover.api.services.qa.LoggingQuestionQueryService.delegate") final org.dressdiscover.api.services.qa.QuestionQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Question> getQuestions(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> ids) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.qa.NoSuchQuestionException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("get_questions(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(Messages.GetQuestionsRequest.create(ids));
        __logMessageStringBuilder.append(")");

        try {
            com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Question> __returnValue = delegate.getQuestions(ids);

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.info(Markers.GET_QUESTIONS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_QUESTIONS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final org.dressdiscover.api.services.qa.NoSuchQuestionException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_QUESTIONS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final RuntimeException e) {
            __logMessageStringBuilder.append(" -> ");
            __logMessageArgs.add(e);
            logger.error(Markers.GET_QUESTIONS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingQuestionQueryService.class);
    private final org.dressdiscover.api.services.qa.QuestionQueryService delegate;
}
