package org.dressdiscover.api.services.worksheet;

@com.google.inject.Singleton
public class ValidatingWorksheetDefinitionQueryService implements org.dressdiscover.api.services.worksheet.WorksheetDefinitionQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.api.services.worksheet.ValidatingWorksheetDefinitionQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingWorksheetDefinitionQueryService(@com.google.inject.name.Named("org.dressdiscover.api.services.worksheet.ValidatingWorksheetDefinitionQueryService.delegate") org.dressdiscover.api.services.worksheet.WorksheetDefinitionQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final org.dressdiscover.api.models.worksheet.WorksheetDefinition getWorksheetDefinition() throws org.dressdiscover.api.services.IoException {
        final org.dressdiscover.api.models.worksheet.WorksheetDefinition __returnValue = delegate.getWorksheetDefinition();
        org.dressdiscover.api.services.worksheet.WorksheetDefinitionQueryService.Messages.GetWorksheetDefinitionResponse.UncheckedValidator.validateReturnValue(__returnValue);
        return __returnValue;
    }

    private final org.dressdiscover.api.services.worksheet.WorksheetDefinitionQueryService delegate;
}
