package org.dressdiscover.lib.services.configuration;

@com.google.inject.Singleton
public class ValidatingConfigurationCommandService implements org.dressdiscover.api.services.configuration.ConfigurationCommandService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.configuration.ValidatingConfigurationCommandService.delegate");

    @com.google.inject.Inject
    public ValidatingConfigurationCommandService(@com.google.inject.name.Named("org.dressdiscover.lib.services.configuration.ValidatingConfigurationCommandService.delegate") org.dressdiscover.api.services.configuration.ConfigurationCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final void putInstitutionConfiguration(final org.dressdiscover.api.models.institution.InstitutionId institutionId, final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration) throws org.dressdiscover.api.services.IoException {
        _validatePutInstitutionConfigurationParameters(institutionId, institutionConfiguration);
        delegate.putInstitutionConfiguration(institutionId, institutionConfiguration);
    }

    protected void _validatePutInstitutionConfigurationParameters(final org.dressdiscover.api.models.institution.InstitutionId institutionId, final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration) {
        org.dressdiscover.api.services.configuration.ConfigurationCommandService.Messages.PutInstitutionConfigurationRequest.DefaultConstructionValidator.getInstance().validateInstitutionId(institutionId);
        org.dressdiscover.api.services.configuration.ConfigurationCommandService.Messages.PutInstitutionConfigurationRequest.DefaultConstructionValidator.getInstance().validateInstitutionConfiguration(institutionConfiguration);
    }

    private final org.dressdiscover.api.services.configuration.ConfigurationCommandService delegate;
}
