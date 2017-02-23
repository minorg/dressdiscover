package org.dressdiscover.api.services.qa;

@com.google.inject.Singleton
public class LoggingQaQueryService implements org.dressdiscover.api.services.qa.QaQueryService {
    public static class Markers {
        public final static org.slf4j.Marker GET_ANSWERS = org.slf4j.MarkerFactory.getMarker("GET_ANSWERS");
        public final static org.slf4j.Marker GET_OBJECT_BY_ID = org.slf4j.MarkerFactory.getMarker("GET_OBJECT_BY_ID");
        public final static org.slf4j.Marker GET_OBJECTS = org.slf4j.MarkerFactory.getMarker("GET_OBJECTS");
        public final static org.slf4j.Marker GET_QUESTION_SETS = org.slf4j.MarkerFactory.getMarker("GET_QUESTION_SETS");
        public final static org.slf4j.Marker GET_QUESTIONS = org.slf4j.MarkerFactory.getMarker("GET_QUESTIONS");

        public final static org.slf4j.Marker QA_QUERY_SERVICE = org.slf4j.MarkerFactory.getMarker("QA_QUERY_SERVICE");
        static {
            QA_QUERY_SERVICE.add(GET_ANSWERS);
            QA_QUERY_SERVICE.add(GET_OBJECT_BY_ID);
            QA_QUERY_SERVICE.add(GET_OBJECTS);
            QA_QUERY_SERVICE.add(GET_QUESTION_SETS);
            QA_QUERY_SERVICE.add(GET_QUESTIONS);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.api.services.qa.LoggingQaQueryService.delegate");

    @com.google.inject.Inject
    public LoggingQaQueryService(@com.google.inject.name.Named("org.dressdiscover.api.services.qa.LoggingQaQueryService.delegate") final org.dressdiscover.api.services.qa.QaQueryService delegate) {
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

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingQaQueryService.class);
    private final org.dressdiscover.api.services.qa.QaQueryService delegate;
}
