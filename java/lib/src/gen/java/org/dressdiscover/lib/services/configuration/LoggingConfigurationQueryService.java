package org.dressdiscover.lib.services.configuration;

@com.google.inject.Singleton
public class LoggingConfigurationQueryService implements org.dressdiscover.api.services.configuration.ConfigurationQueryService {
    public static class Markers {
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

    public org.dressdiscover.api.models.configuration.CollectionConfiguration getCollectionConfiguration(final org.dressdiscover.api.models.collection.CollectionId collectionId) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.configuration.NoSuchCollectionConfigurationException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("get_collection_configuration(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(Messages.GetCollectionConfigurationRequest.create(collectionId));
        __logMessageStringBuilder.append(")");

        try {
            org.dressdiscover.api.models.configuration.CollectionConfiguration __returnValue = delegate.getCollectionConfiguration(collectionId);

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.info(Markers.GET_COLLECTION_CONFIGURATION, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_COLLECTION_CONFIGURATION, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final org.dressdiscover.api.services.configuration.NoSuchCollectionConfigurationException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_COLLECTION_CONFIGURATION, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public org.dressdiscover.api.models.configuration.InstitutionConfiguration getInstitutionConfiguration(final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.configuration.NoSuchInstitutionConfigurationException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("get_institution_configuration(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(Messages.GetInstitutionConfigurationRequest.create(institutionId));
        __logMessageStringBuilder.append(")");

        try {
            org.dressdiscover.api.models.configuration.InstitutionConfiguration __returnValue = delegate.getInstitutionConfiguration(institutionId);

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.info(Markers.GET_INSTITUTION_CONFIGURATION, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_INSTITUTION_CONFIGURATION, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final org.dressdiscover.api.services.configuration.NoSuchInstitutionConfigurationException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_INSTITUTION_CONFIGURATION, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingConfigurationQueryService.class);
    private final org.dressdiscover.api.services.configuration.ConfigurationQueryService delegate;
}
