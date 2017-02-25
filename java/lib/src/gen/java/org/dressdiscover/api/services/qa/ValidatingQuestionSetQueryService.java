package org.dressdiscover.api.services.qa;

@com.google.inject.Singleton
public class ValidatingQuestionSetQueryService implements org.dressdiscover.api.services.qa.QuestionSetQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.api.services.qa.ValidatingQuestionSetQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingQuestionSetQueryService(@com.google.inject.name.Named("org.dressdiscover.api.services.qa.ValidatingQuestionSetQueryService.delegate") org.dressdiscover.api.services.qa.QuestionSetQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> getQuestionSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> ids) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.qa.NoSuchQuestionSetException {
        _validateGetQuestionSetsParameters(ids);
        return org.dressdiscover.api.services.qa.QuestionSetQueryService.Messages.GetQuestionSetsResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.getQuestionSets(ids));
    }

    protected void _validateGetQuestionSetsParameters(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSetId> ids) {
        org.dressdiscover.api.services.qa.QuestionSetQueryService.Messages.GetQuestionSetsRequest.DefaultConstructionValidator.getInstance().validateIds(ids);
    }

    private final org.dressdiscover.api.services.qa.QuestionSetQueryService delegate;
}
