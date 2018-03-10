package org.dressdiscover.lib.services.configuration;

@com.google.inject.Singleton
public class LoggingConfigurationQueryService implements org.dressdiscover.api.services.configuration.ConfigurationQueryService {
    public final static class ConfigurationQueryServiceLogMarkers {
        public final static org.slf4j.Marker GET_COLLECTION_CONFIGURATION = org.slf4j.MarkerFactory.getMarker("GET_COLLECTION_CONFIGURATION");
        public final static org.slf4j.Marker GET_INSTITUTION_CONFIGURATION = org.slf4j.MarkerFactory.getMarker("GET_INSTITUTION_CONFIGURATION");

        public final static org.slf4j.Marker CONFIGURATION_QUERY_SERVICE = org.slf4j.MarkerFactory.getMarker("CONFIGURATION_QUERY_SERVICE");
        static {
            CONFIGURATION_QUERY_SERVICE.add(GET_COLLECTION_CONFIGURATION);
            CONFIGURATION_QUERY_SERVICE.add(GET_INSTITUTION_CONFIGURATION);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.configuration.LoggingConfigurationQueryService.delegate");

    @com.google.inject.Inject
    public LoggingConfigurationQueryService(@com.google.inject.name.Named("org.dressdiscover.lib.services.configuration.LoggingConfigurationQueryService.delegate") final org.dressdiscover.api.services.configuration.ConfigurationQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public org.dressdiscover.api.models.configuration.CollectionConfiguration getCollectionConfiguration(final org.dressdiscover.api.models.collection.CollectionId collectionId) throws org.dressdiscover.api.services.IoException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = collectionId;

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(ConfigurationQueryServiceLogMarkers.GET_COLLECTION_CONFIGURATION, LogMessages.GET_COLLECTION_CONFIGURATION, __logMessageArgs);

        try {
            final org.dressdiscover.api.models.configuration.CollectionConfiguration __returnValue = delegate.getCollectionConfiguration(collectionId);

            __logMessageArgs[__logMessageArgs.length - 1] = __returnValue;
            logger.info(ConfigurationQueryServiceLogMarkers.GET_COLLECTION_CONFIGURATION, LogMessages.GET_COLLECTION_CONFIGURATION, __logMessageArgs);

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(ConfigurationQueryServiceLogMarkers.GET_COLLECTION_CONFIGURATION, LogMessages.GET_COLLECTION_CONFIGURATION, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(ConfigurationQueryServiceLogMarkers.GET_COLLECTION_CONFIGURATION, LogMessages.GET_COLLECTION_CONFIGURATION, __logMessageArgs);
            throw e;
        }
    }

    @Override
    public org.dressdiscover.api.models.configuration.InstitutionConfiguration getInstitutionConfiguration(final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws org.dressdiscover.api.services.IoException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = institutionId;

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(ConfigurationQueryServiceLogMarkers.GET_INSTITUTION_CONFIGURATION, LogMessages.GET_INSTITUTION_CONFIGURATION, __logMessageArgs);

        try {
            final org.dressdiscover.api.models.configuration.InstitutionConfiguration __returnValue = delegate.getInstitutionConfiguration(institutionId);

            __logMessageArgs[__logMessageArgs.length - 1] = __returnValue;
            logger.info(ConfigurationQueryServiceLogMarkers.GET_INSTITUTION_CONFIGURATION, LogMessages.GET_INSTITUTION_CONFIGURATION, __logMessageArgs);

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(ConfigurationQueryServiceLogMarkers.GET_INSTITUTION_CONFIGURATION, LogMessages.GET_INSTITUTION_CONFIGURATION, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(ConfigurationQueryServiceLogMarkers.GET_INSTITUTION_CONFIGURATION, LogMessages.GET_INSTITUTION_CONFIGURATION, __logMessageArgs);
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingConfigurationQueryService.class);
    private final org.dressdiscover.api.services.configuration.ConfigurationQueryService delegate;

    private final static class LogMessages {
        public final static String GET_COLLECTION_CONFIGURATION = "get_collection_configuration(collectionId={}) -> {}";
        public final static String GET_INSTITUTION_CONFIGURATION = "get_institution_configuration(institutionId={}) -> {}";
    }

    public final static String PRE_RETURN_VALUE = "...";
}
