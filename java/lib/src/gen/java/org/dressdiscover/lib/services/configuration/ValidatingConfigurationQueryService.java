package org.dressdiscover.lib.services.configuration;

@com.google.inject.Singleton
public class ValidatingConfigurationQueryService implements org.dressdiscover.api.services.configuration.ConfigurationQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.configuration.ValidatingConfigurationQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingConfigurationQueryService(@com.google.inject.name.Named("org.dressdiscover.lib.services.configuration.ValidatingConfigurationQueryService.delegate") org.dressdiscover.api.services.configuration.ConfigurationQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final org.dressdiscover.api.models.configuration.CollectionConfiguration getCollectionConfiguration(final org.dressdiscover.api.models.collection.CollectionId collectionId) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.configuration.NoSuchCollectionConfigurationException {
        _validateGetCollectionConfigurationParameters(collectionId);
        return org.dressdiscover.api.services.configuration.ConfigurationQueryService.Messages.GetCollectionConfigurationResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.getCollectionConfiguration(collectionId));
    }

    protected void _validateGetCollectionConfigurationParameters(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
        org.dressdiscover.api.services.configuration.ConfigurationQueryService.Messages.GetCollectionConfigurationRequest.DefaultConstructionValidator.getInstance().validateCollectionId(collectionId);
    }

    @Override
    public final org.dressdiscover.api.models.configuration.InstitutionConfiguration getInstitutionConfiguration(final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.configuration.NoSuchInstitutionConfigurationException {
        _validateGetInstitutionConfigurationParameters(institutionId);
        return org.dressdiscover.api.services.configuration.ConfigurationQueryService.Messages.GetInstitutionConfigurationResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.getInstitutionConfiguration(institutionId));
    }

    protected void _validateGetInstitutionConfigurationParameters(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
        org.dressdiscover.api.services.configuration.ConfigurationQueryService.Messages.GetInstitutionConfigurationRequest.DefaultConstructionValidator.getInstance().validateInstitutionId(institutionId);
    }

    private final org.dressdiscover.api.services.configuration.ConfigurationQueryService delegate;
}
