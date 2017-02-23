package org.dressdiscover.api.services.qa;

@com.google.inject.Singleton
public class ValidatingQaCommandService implements org.dressdiscover.api.services.qa.QaCommandService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.api.services.qa.ValidatingQaCommandService.delegate");

    @com.google.inject.Inject
    public ValidatingQaCommandService(@com.google.inject.name.Named("org.dressdiscover.api.services.qa.ValidatingQaCommandService.delegate") org.dressdiscover.api.services.qa.QaCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final void putAnswer(final org.dressdiscover.api.models.qa.Answer answer) throws org.dressdiscover.api.services.IoException {
        _validatePutAnswerParameters(answer);
        delegate.putAnswer(answer);
    }

    protected void _validatePutAnswerParameters(final org.dressdiscover.api.models.qa.Answer answer) {
        org.dressdiscover.api.services.qa.QaCommandService.Messages.PutAnswerRequest.DefaultConstructionValidator.getInstance().validateAnswer(answer);
    }

    private final org.dressdiscover.api.services.qa.QaCommandService delegate;
}
