package org.dressdiscover.lib.services.configuration;

@com.google.inject.Singleton
public class ValidatingConfigurationCommandService implements org.dressdiscover.api.services.configuration.ConfigurationCommandService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.configuration.ValidatingConfigurationCommandService.delegate");

    @com.google.inject.Inject
    public ValidatingConfigurationCommandService(@com.google.inject.name.Named("org.dressdiscover.lib.services.configuration.ValidatingConfigurationCommandService.delegate") org.dressdiscover.api.services.configuration.ConfigurationCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final void putCollectionConfiguration(final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration, final org.dressdiscover.api.models.collection.CollectionId collectionId) throws org.dressdiscover.api.services.IoException {
        _validatePutCollectionConfigurationParameters(collectionConfiguration, collectionId);
        delegate.putCollectionConfiguration(collectionConfiguration, collectionId);
    }

    protected void _validatePutCollectionConfigurationParameters(final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration, final org.dressdiscover.api.models.collection.CollectionId collectionId) {
        org.dressdiscover.api.services.configuration.ConfigurationCommandService.Messages.PutCollectionConfigurationRequest.DefaultConstructionValidator.getInstance().validateCollectionConfiguration(collectionConfiguration);
        org.dressdiscover.api.services.configuration.ConfigurationCommandService.Messages.PutCollectionConfigurationRequest.DefaultConstructionValidator.getInstance().validateCollectionId(collectionId);
    }

    @Override
    public final void putInstitutionConfiguration(final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration, final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws org.dressdiscover.api.services.IoException {
        _validatePutInstitutionConfigurationParameters(institutionConfiguration, institutionId);
        delegate.putInstitutionConfiguration(institutionConfiguration, institutionId);
    }

    protected void _validatePutInstitutionConfigurationParameters(final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration, final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
        org.dressdiscover.api.services.configuration.ConfigurationCommandService.Messages.PutInstitutionConfigurationRequest.DefaultConstructionValidator.getInstance().validateInstitutionConfiguration(institutionConfiguration);
        org.dressdiscover.api.services.configuration.ConfigurationCommandService.Messages.PutInstitutionConfigurationRequest.DefaultConstructionValidator.getInstance().validateInstitutionId(institutionId);
    }

    private final org.dressdiscover.api.services.configuration.ConfigurationCommandService delegate;
}
