package org.dressdiscover.lib.services.configuration;

@com.google.inject.Singleton
public class LoggingConfigurationCommandService implements org.dressdiscover.api.services.configuration.ConfigurationCommandService {
    public final static class ConfigurationCommandServiceLogMarkers {
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

    @Override
    public void putCollectionConfiguration(final org.dressdiscover.api.models.configuration.CollectionConfiguration collectionConfiguration, final org.dressdiscover.api.models.collection.CollectionId collectionId) throws org.dressdiscover.api.services.IoException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = Messages.PutCollectionConfigurationRequest.create(collectionConfiguration, collectionId);

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(ConfigurationCommandServiceLogMarkers.PUT_COLLECTION_CONFIGURATION, LogMessages.PUT_COLLECTION_CONFIGURATION, __logMessageArgs);

        try {
            delegate.putCollectionConfiguration(collectionConfiguration, collectionId);

            __logMessageArgs[__logMessageArgs.length - 1] = VOID_RETURN_VALUE;
            logger.info(ConfigurationCommandServiceLogMarkers.PUT_COLLECTION_CONFIGURATION, LogMessages.PUT_COLLECTION_CONFIGURATION, __logMessageArgs);
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(ConfigurationCommandServiceLogMarkers.PUT_COLLECTION_CONFIGURATION, LogMessages.PUT_COLLECTION_CONFIGURATION, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(ConfigurationCommandServiceLogMarkers.PUT_COLLECTION_CONFIGURATION, LogMessages.PUT_COLLECTION_CONFIGURATION, __logMessageArgs);
            throw e;
        }
    }

    @Override
    public void putInstitutionConfiguration(final org.dressdiscover.api.models.configuration.InstitutionConfiguration institutionConfiguration, final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws org.dressdiscover.api.services.IoException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = Messages.PutInstitutionConfigurationRequest.create(institutionConfiguration, institutionId);

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(ConfigurationCommandServiceLogMarkers.PUT_INSTITUTION_CONFIGURATION, LogMessages.PUT_INSTITUTION_CONFIGURATION, __logMessageArgs);

        try {
            delegate.putInstitutionConfiguration(institutionConfiguration, institutionId);

            __logMessageArgs[__logMessageArgs.length - 1] = VOID_RETURN_VALUE;
            logger.info(ConfigurationCommandServiceLogMarkers.PUT_INSTITUTION_CONFIGURATION, LogMessages.PUT_INSTITUTION_CONFIGURATION, __logMessageArgs);
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(ConfigurationCommandServiceLogMarkers.PUT_INSTITUTION_CONFIGURATION, LogMessages.PUT_INSTITUTION_CONFIGURATION, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(ConfigurationCommandServiceLogMarkers.PUT_INSTITUTION_CONFIGURATION, LogMessages.PUT_INSTITUTION_CONFIGURATION, __logMessageArgs);
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingConfigurationCommandService.class);
    private final org.dressdiscover.api.services.configuration.ConfigurationCommandService delegate;

    private final static class LogMessages {
        public final static String PUT_COLLECTION_CONFIGURATION = "put_collection_configuration({}) -> {}";
        public final static String PUT_INSTITUTION_CONFIGURATION = "put_institution_configuration({}) -> {}";
    }

    public final static String PRE_RETURN_VALUE = "...";
    public final static String VOID_RETURN_VALUE = "void";
}
