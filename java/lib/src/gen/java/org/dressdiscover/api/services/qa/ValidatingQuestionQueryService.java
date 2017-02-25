package org.dressdiscover.api.services.qa;

@com.google.inject.Singleton
public class ValidatingQuestionQueryService implements org.dressdiscover.api.services.qa.QuestionQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.api.services.qa.ValidatingQuestionQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingQuestionQueryService(@com.google.inject.name.Named("org.dressdiscover.api.services.qa.ValidatingQuestionQueryService.delegate") org.dressdiscover.api.services.qa.QuestionQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Question> getQuestions(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> ids) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.qa.NoSuchQuestionException {
        _validateGetQuestionsParameters(ids);
        return org.dressdiscover.api.services.qa.QuestionQueryService.Messages.GetQuestionsResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.getQuestions(ids));
    }

    protected void _validateGetQuestionsParameters(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionId> ids) {
        org.dressdiscover.api.services.qa.QuestionQueryService.Messages.GetQuestionsRequest.DefaultConstructionValidator.getInstance().validateIds(ids);
    }

    private final org.dressdiscover.api.services.qa.QuestionQueryService delegate;
}
