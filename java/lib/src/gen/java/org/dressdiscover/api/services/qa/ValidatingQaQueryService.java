package org.dressdiscover.api.services.qa;

@com.google.inject.Singleton
public class ValidatingQaQueryService implements org.dressdiscover.api.services.qa.QaQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.api.services.qa.ValidatingQaQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingQaQueryService(@com.google.inject.name.Named("org.dressdiscover.api.services.qa.ValidatingQaQueryService.delegate") org.dressdiscover.api.services.qa.QaQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> getAnswers(final org.dressdiscover.api.models.qa.QaObjectId objectId, final org.dressdiscover.api.models.qa.QuestionSetId questionSetId, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> questionIds, final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> userId) throws org.dressdiscover.api.services.IoException {
        _validateGetAnswersParameters(objectId, questionSetId, questionIds, userId);
        return org.dressdiscover.api.services.qa.QaQueryService.Messages.GetAnswersResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.getAnswers(objectId, questionSetId, questionIds, userId));
    }

    protected void _validateGetAnswersParameters(final org.dressdiscover.api.models.qa.QaObjectId objectId, final org.dressdiscover.api.models.qa.QuestionSetId questionSetId, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> questionIds, final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> userId) {
        org.dressdiscover.api.services.qa.QaQueryService.Messages.GetAnswersRequest.DefaultConstructionValidator.getInstance().validateObjectId(objectId);
        org.dressdiscover.api.services.qa.QaQueryService.Messages.GetAnswersRequest.DefaultConstructionValidator.getInstance().validateQuestionSetId(questionSetId);
        org.dressdiscover.api.services.qa.QaQueryService.Messages.GetAnswersRequest.DefaultConstructionValidator.getInstance().validateQuestionIds(questionIds);
        org.dressdiscover.api.services.qa.QaQueryService.Messages.GetAnswersRequest.DefaultConstructionValidator.getInstance().validateUserId(userId);
    }

    @Override
    public final org.dressdiscover.api.models.qa.QaObject getObjectById(final org.dressdiscover.api.models.qa.QaObjectId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.qa.NoSuchObjectException {
        _validateGetObjectByIdParameters(id);
        return org.dressdiscover.api.services.qa.QaQueryService.Messages.GetObjectByIdResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.getObjectById(id));
    }

    protected void _validateGetObjectByIdParameters(final org.dressdiscover.api.models.qa.QaObjectId id) {
        org.dressdiscover.api.services.qa.QaQueryService.Messages.GetObjectByIdRequest.DefaultConstructionValidator.getInstance().validateId(id);
    }

    @Override
    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> getObjects() throws org.dressdiscover.api.services.IoException {
        return org.dressdiscover.api.services.qa.QaQueryService.Messages.GetObjectsResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.getObjects());
    }

    @Override
    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> getQuestionSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> ids) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.qa.NoSuchQuestionSetException {
        _validateGetQuestionSetsParameters(ids);
        return org.dressdiscover.api.services.qa.QaQueryService.Messages.GetQuestionSetsResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.getQuestionSets(ids));
    }

    protected void _validateGetQuestionSetsParameters(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> ids) {
        org.dressdiscover.api.services.qa.QaQueryService.Messages.GetQuestionSetsRequest.DefaultConstructionValidator.getInstance().validateIds(ids);
    }

    @Override
    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Question> getQuestions(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> ids) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.qa.NoSuchQuestionException {
        _validateGetQuestionsParameters(ids);
        return org.dressdiscover.api.services.qa.QaQueryService.Messages.GetQuestionsResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.getQuestions(ids));
    }

    protected void _validateGetQuestionsParameters(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> ids) {
        org.dressdiscover.api.services.qa.QaQueryService.Messages.GetQuestionsRequest.DefaultConstructionValidator.getInstance().validateIds(ids);
    }

    private final org.dressdiscover.api.services.qa.QaQueryService delegate;
}
