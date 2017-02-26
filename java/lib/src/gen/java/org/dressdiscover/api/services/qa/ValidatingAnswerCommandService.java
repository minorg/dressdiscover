package org.dressdiscover.api.services.qa;

@com.google.inject.Singleton
public class ValidatingAnswerCommandService implements org.dressdiscover.api.services.qa.AnswerCommandService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.api.services.qa.ValidatingAnswerCommandService.delegate");

    @com.google.inject.Inject
    public ValidatingAnswerCommandService(@com.google.inject.name.Named("org.dressdiscover.api.services.qa.ValidatingAnswerCommandService.delegate") org.dressdiscover.api.services.qa.AnswerCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final void deleteAnswers() throws org.dressdiscover.api.services.IoException {
        delegate.deleteAnswers();
    }

    @Override
    public final void putAnswer(final org.dressdiscover.api.models.qa.Answer answer) throws org.dressdiscover.api.services.IoException {
        _validatePutAnswerParameters(answer);
        delegate.putAnswer(answer);
    }

    protected void _validatePutAnswerParameters(final org.dressdiscover.api.models.qa.Answer answer) {
        org.dressdiscover.api.services.qa.AnswerCommandService.Messages.PutAnswerRequest.DefaultConstructionValidator.getInstance().validateAnswer(answer);
    }

    private final org.dressdiscover.api.services.qa.AnswerCommandService delegate;
}
