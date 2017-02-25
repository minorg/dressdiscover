package org.dressdiscover.api.services.qa;

@com.google.inject.Singleton
public class LoggingAnswerQueryService implements org.dressdiscover.api.services.qa.AnswerQueryService {
    public static class Markers {
        public final static org.slf4j.Marker GET_ANSWERS = org.slf4j.MarkerFactory.getMarker("GET_ANSWERS");

        public final static org.slf4j.Marker ANSWER_QUERY_SERVICE = org.slf4j.MarkerFactory.getMarker("ANSWER_QUERY_SERVICE");
        static {
            ANSWER_QUERY_SERVICE.add(GET_ANSWERS);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.api.services.qa.LoggingAnswerQueryService.delegate");

    @com.google.inject.Inject
    public LoggingAnswerQueryService(@com.google.inject.name.Named("org.dressdiscover.api.services.qa.LoggingAnswerQueryService.delegate") final org.dressdiscover.api.services.qa.AnswerQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> getAnswers(final org.dressdiscover.api.models.qa.QaObjectId objectId, final org.dressdiscover.api.models.qa.QuestionSetId questionSetId, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> questionIds, final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> userId) throws org.dressdiscover.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("get_answers(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(Messages.GetAnswersRequest.create(objectId, questionSetId, questionIds, userId));
        __logMessageStringBuilder.append(")");

        try {
            com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> __returnValue = delegate.getAnswers(objectId, questionSetId, questionIds, userId);

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.info(Markers.GET_ANSWERS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_ANSWERS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final RuntimeException e) {
            __logMessageStringBuilder.append(" -> ");
            __logMessageArgs.add(e);
            logger.error(Markers.GET_ANSWERS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingAnswerQueryService.class);
    private final org.dressdiscover.api.services.qa.AnswerQueryService delegate;
}
