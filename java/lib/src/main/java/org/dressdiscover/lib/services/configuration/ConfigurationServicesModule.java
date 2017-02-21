package org.dressdiscover.lib.services.configuration;

import org.dressdiscover.api.services.configuration.ConfigurationCommandService;
import org.dressdiscover.api.services.configuration.ConfigurationQueryService;

import com.google.inject.AbstractModule;

public final class ConfigurationServicesModule extends AbstractModule {
    protected void _configureConfigurationCommandService() {
        bind(ConfigurationCommandService.class).annotatedWith(LoggingConfigurationCommandService.DELEGATE_NAME)
                .to(StoreConfigurationCommandService.class).asEagerSingleton();
        bind(ConfigurationCommandService.class).annotatedWith(ValidatingConfigurationCommandService.DELEGATE_NAME)
                .to(LoggingConfigurationCommandService.class).asEagerSingleton();
        bind(ConfigurationCommandService.class).to(ValidatingConfigurationCommandService.class).asEagerSingleton();
    }

    protected void _configureConfigurationQueryService() {
        bind(ConfigurationQueryService.class).annotatedWith(LoggingConfigurationQueryService.DELEGATE_NAME)
                .to(StoreConfigurationQueryService.class).asEagerSingleton();
        bind(ConfigurationQueryService.class).annotatedWith(ValidatingConfigurationQueryService.DELEGATE_NAME)
                .to(LoggingConfigurationQueryService.class).asEagerSingleton();
        bind(ConfigurationQueryService.class).to(ValidatingConfigurationQueryService.class).asEagerSingleton();
    }

    @Override
    protected void configure() {
        _configureConfigurationCommandService();
        _configureConfigurationQueryService();
    }
}
