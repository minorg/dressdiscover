package org.dressdiscover.lib.services.configuration;

@com.google.inject.Singleton
public class LoggingConfigurationCommandService implements org.dressdiscover.api.services.configuration.ConfigurationCommandService {
    public static class Markers {
        public final static org.slf4j.Marker PUT_COLLECTION_CONFIGURATION = org.slf4j.MarkerFactory.getMarker("PUT_COLLECTION_CONFIGURATION");
        public final static org.slf4j.Marker PUT_INSTITUTION_CONFIGURATION = org.slf4j.MarkerFactory.getMarker("PUT_INSTITUTION_CONFIGURATION");

        public final static org.slf4j.Marker CONFIGURATION_COMMAND_SERVICE = org.slf4j.MarkerFactory.getMarker("CONFIGURATION_COMMAND_SERVICE");
        static {
            CONFIGURATION_COMMAND_SERVICE.add(PUT_COLLECTION_CONFIGURATION);
            CONFIGURATION_COMMAND_SERVICE.add(PUT_INSTITUTION_CONFIGURATION);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.configuration.LoggingConfigurationCommandService.delegate");

    @com.google.inject.Inject
    public LoggingConfigurationCommandService(@com.google.inject.name.Named("org.dressdiscover.lib.services.configuration.LoggingConfigurationCommandService.delegate") final org.dressdiscover.api.services.configuration.ConfigurationCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    public void putCollectionConfiguration(final org.dressdiscover.api.models.collection.CollectionId collectionId, final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration) throws org.dressdiscover.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("put_collection_configuration(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(Messages.PutCollectionConfigurationRequest.create(collectionId, collectionConfiguration));
        __logMessageStringBuilder.append(")");

        try {
            delegate.putCollectionConfiguration(collectionId, collectionConfiguration);

            logger.info(Markers.PUT_COLLECTION_CONFIGURATION, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.PUT_COLLECTION_CONFIGURATION, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public void putInstitutionConfiguration(final org.dressdiscover.api.models.institution.InstitutionId institutionId, final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration) throws org.dressdiscover.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("put_institution_configuration(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(Messages.PutInstitutionConfigurationRequest.create(institutionId, institutionConfiguration));
        __logMessageStringBuilder.append(")");

        try {
            delegate.putInstitutionConfiguration(institutionId, institutionConfiguration);

            logger.info(Markers.PUT_INSTITUTION_CONFIGURATION, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.PUT_INSTITUTION_CONFIGURATION, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingConfigurationCommandService.class);
    private final org.dressdiscover.api.services.configuration.ConfigurationCommandService delegate;
}
