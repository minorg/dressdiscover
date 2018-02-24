package org.dressdiscover.api.services.worksheet;

@com.google.inject.Singleton
public class ValidatingWorksheetStateQueryService implements org.dressdiscover.api.services.worksheet.WorksheetStateQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.api.services.worksheet.ValidatingWorksheetStateQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingWorksheetStateQueryService(@com.google.inject.name.Named("org.dressdiscover.api.services.worksheet.ValidatingWorksheetStateQueryService.delegate") org.dressdiscover.api.services.worksheet.WorksheetStateQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final com.google.common.collect.ImmutableList<String> getWorksheetAccessionNumbers() throws org.dressdiscover.api.services.IoException {
        final com.google.common.collect.ImmutableList<String> __returnValue = delegate.getWorksheetAccessionNumbers();
        org.dressdiscover.api.services.worksheet.WorksheetStateQueryService.Messages.GetWorksheetAccessionNumbersResponse.UncheckedValidator.validateReturnValue(__returnValue);
        return __returnValue;
    }

    @Override
    public final org.dressdiscover.api.models.worksheet.WorksheetState getWorksheetState(final String accessionNumber) throws org.dressdiscover.api.services.IoException {
        org.dressdiscover.api.services.worksheet.WorksheetStateQueryService.Messages.GetWorksheetStateRequest.UncheckedValidator.validate(accessionNumber);
        final org.dressdiscover.api.models.worksheet.WorksheetState __returnValue = delegate.getWorksheetState(accessionNumber);
        org.dressdiscover.api.services.worksheet.WorksheetStateQueryService.Messages.GetWorksheetStateResponse.UncheckedValidator.validateReturnValue(__returnValue);
        return __returnValue;
    }

    private final org.dressdiscover.api.services.worksheet.WorksheetStateQueryService delegate;
}
