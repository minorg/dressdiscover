package org.dressdiscover.lib.services;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.lib.properties.StoreProperties;
import org.dressdiscover.lib.services.collection.CollectionServicesModule;
import org.dressdiscover.lib.services.configuration.ConfigurationServicesModule;
import org.dressdiscover.lib.services.institution.InstitutionServicesModule;
import org.dressdiscover.lib.services.object.ObjectServicesModule;
import org.dressdiscover.lib.services.qa.QaServicesModule;
import org.dressdiscover.lib.services.user.UserServicesModule;

import com.google.inject.AbstractModule;

public class ServicesModule extends AbstractModule {
    public ServicesModule(final StoreProperties storeProperties) {
        this.storeProperties = checkNotNull(storeProperties);
    }

    protected void _configureCollectionServices() {
        install(new CollectionServicesModule());
    }

    protected void _configureConfigurationServices() {
        install(new ConfigurationServicesModule());
    }

    protected void _configureInstitutionServices() {
        install(new InstitutionServicesModule(storeProperties));
    }

    protected void _configureObjectServices() {
        install(new ObjectServicesModule());
    }

    protected void _configureQaServices() {
        install(new QaServicesModule());
    }

    protected void _configureUserServices() {
        install(new UserServicesModule());
    }

    @Override
    protected void configure() {
        _configureCollectionServices();
        _configureConfigurationServices();
        _configureInstitutionServices();
        _configureObjectServices();
        _configureQaServices();
        _configureUserServices();
    }

    private final StoreProperties storeProperties;
}
