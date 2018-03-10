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
        {
            if (collectionConfiguration == null) {
                throw new NullPointerException("org.dressdiscover.api.services.configuration.ValidatingConfigurationCommandService.putCollectionConfiguration: collectionConfiguration is null");
            }
        }
        {
            if (collectionId == null) {
                throw new NullPointerException("org.dressdiscover.api.services.configuration.ValidatingConfigurationCommandService.putCollectionConfiguration: collectionId is null");
            }
        }
        delegate.putCollectionConfiguration(collectionConfiguration, collectionId);
    }

    @Override
    public final void putInstitutionConfiguration(final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration, final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws org.dressdiscover.api.services.IoException {
        {
            if (institutionConfiguration == null) {
                throw new NullPointerException("org.dressdiscover.api.services.configuration.ValidatingConfigurationCommandService.putInstitutionConfiguration: institutionConfiguration is null");
            }
        }
        {
            if (institutionId == null) {
                throw new NullPointerException("org.dressdiscover.api.services.configuration.ValidatingConfigurationCommandService.putInstitutionConfiguration: institutionId is null");
            }
        }
        delegate.putInstitutionConfiguration(institutionConfiguration, institutionId);
    }

    private final org.dressdiscover.api.services.configuration.ConfigurationCommandService delegate;
}
