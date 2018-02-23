package org.dressdiscover.api.services.worksheet;

@com.google.inject.Singleton
public class ValidatingWorksheetCommandService implements org.dressdiscover.api.services.worksheet.WorksheetCommandService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.api.services.worksheet.ValidatingWorksheetCommandService.delegate");

    @com.google.inject.Inject
    public ValidatingWorksheetCommandService(@com.google.inject.name.Named("org.dressdiscover.api.services.worksheet.ValidatingWorksheetCommandService.delegate") org.dressdiscover.api.services.worksheet.WorksheetCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final void deleteWorksheetState(final String accessionNumber) throws org.dressdiscover.api.services.IoException {
        org.dressdiscover.api.services.worksheet.WorksheetCommandService.Messages.DeleteWorksheetStateRequest.UncheckedValidator.validate(accessionNumber);
        delegate.deleteWorksheetState(accessionNumber);
    }

    @Override
    public final void putWorksheetState(final org.dressdiscover.api.models.worksheet.WorksheetState state) throws org.dressdiscover.api.services.IoException {
        org.dressdiscover.api.services.worksheet.WorksheetCommandService.Messages.PutWorksheetStateRequest.UncheckedValidator.validate(state);
        delegate.putWorksheetState(state);
    }

    private final org.dressdiscover.api.services.worksheet.WorksheetCommandService delegate;
}
