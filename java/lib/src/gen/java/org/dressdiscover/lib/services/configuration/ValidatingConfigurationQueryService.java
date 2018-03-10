package org.dressdiscover.lib.services.configuration;

@com.google.inject.Singleton
public class ValidatingConfigurationQueryService implements org.dressdiscover.api.services.configuration.ConfigurationQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.configuration.ValidatingConfigurationQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingConfigurationQueryService(@com.google.inject.name.Named("org.dressdiscover.lib.services.configuration.ValidatingConfigurationQueryService.delegate") org.dressdiscover.api.services.configuration.ConfigurationQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final org.dressdiscover.api.models.configuration.CollectionConfiguration getCollectionConfiguration(final org.dressdiscover.api.models.collection.CollectionId collectionId) throws org.dressdiscover.api.services.IoException {
        {
            if (collectionId == null) {
                throw new NullPointerException("org.dressdiscover.api.services.configuration.ValidatingConfigurationQueryService.getCollectionConfiguration: collectionId is null");
            }
        }
        final org.dressdiscover.api.models.configuration.CollectionConfiguration __returnValue = delegate.getCollectionConfiguration(collectionId);
        {
            if (__returnValue == null) {
                throw new NullPointerException("org.dressdiscover.api.services.configuration.ValidatingConfigurationQueryService.getCollectionConfiguration: __returnValue is null");
            }
        }
        return __returnValue;
    }

    @Override
    public final org.dressdiscover.api.models.configuration.InstitutionConfiguration getInstitutionConfiguration(final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws org.dressdiscover.api.services.IoException {
        {
            if (institutionId == null) {
                throw new NullPointerException("org.dressdiscover.api.services.configuration.ValidatingConfigurationQueryService.getInstitutionConfiguration: institutionId is null");
            }
        }
        final org.dressdiscover.api.models.configuration.InstitutionConfiguration __returnValue = delegate.getInstitutionConfiguration(institutionId);
        {
            if (__returnValue == null) {
                throw new NullPointerException("org.dressdiscover.api.services.configuration.ValidatingConfigurationQueryService.getInstitutionConfiguration: __returnValue is null");
            }
        }
        return __returnValue;
    }

    private final org.dressdiscover.api.services.configuration.ConfigurationQueryService delegate;
}
