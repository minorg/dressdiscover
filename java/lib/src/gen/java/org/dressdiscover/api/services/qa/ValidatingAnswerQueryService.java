package org.dressdiscover.api.services.qa;

@com.google.inject.Singleton
public class ValidatingAnswerQueryService implements org.dressdiscover.api.services.qa.AnswerQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.api.services.qa.ValidatingAnswerQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingAnswerQueryService(@com.google.inject.name.Named("org.dressdiscover.api.services.qa.ValidatingAnswerQueryService.delegate") org.dressdiscover.api.services.qa.AnswerQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> getAnswers(final org.dressdiscover.api.models.qa.QaObjectId objectId, final org.dressdiscover.api.models.qa.QuestionSetId questionSetId, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> questionIds, final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> userId) throws org.dressdiscover.api.services.IoException {
        _validateGetAnswersParameters(objectId, questionSetId, questionIds, userId);
        return org.dressdiscover.api.services.qa.AnswerQueryService.Messages.GetAnswersResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.getAnswers(objectId, questionSetId, questionIds, userId));
    }

    protected void _validateGetAnswersParameters(final org.dressdiscover.api.models.qa.QaObjectId objectId, final org.dressdiscover.api.models.qa.QuestionSetId questionSetId, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId>> questionIds, final com.google.common.base.Optional<org.dressdiscover.api.models.qa.QaUserId> userId) {
        org.dressdiscover.api.services.qa.AnswerQueryService.Messages.GetAnswersRequest.DefaultConstructionValidator.getInstance().validateObjectId(objectId);
        org.dressdiscover.api.services.qa.AnswerQueryService.Messages.GetAnswersRequest.DefaultConstructionValidator.getInstance().validateQuestionSetId(questionSetId);
        org.dressdiscover.api.services.qa.AnswerQueryService.Messages.GetAnswersRequest.DefaultConstructionValidator.getInstance().validateQuestionIds(questionIds);
        org.dressdiscover.api.services.qa.AnswerQueryService.Messages.GetAnswersRequest.DefaultConstructionValidator.getInstance().validateUserId(userId);
    }

    private final org.dressdiscover.api.services.qa.AnswerQueryService delegate;
}
