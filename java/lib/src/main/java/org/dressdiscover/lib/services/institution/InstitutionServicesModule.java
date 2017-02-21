package org.dressdiscover.lib.services.institution;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.api.services.institution.InstitutionCommandService;
import org.dressdiscover.api.services.institution.InstitutionQueryService;
import org.dressdiscover.lib.properties.StoreProperties;
import org.dressdiscover.lib.stores.institution.CachingInstitutionStore;
import org.dressdiscover.lib.stores.institution.FileSystemInstitutionStore;
import org.dressdiscover.lib.stores.institution.InstitutionStore;

import com.google.inject.AbstractModule;

public final class InstitutionServicesModule extends AbstractModule {
    public InstitutionServicesModule(final StoreProperties storeProperties) {
        this.storeProperties = checkNotNull(storeProperties);
    }

    protected void _configureInstitutionCommandService() {
        bind(InstitutionCommandService.class).annotatedWith(LoggingInstitutionCommandService.DELEGATE_NAME)
                .to(StoreInstitutionCommandService.class).asEagerSingleton();
        bind(InstitutionCommandService.class).annotatedWith(ValidatingInstitutionCommandService.DELEGATE_NAME)
                .to(LoggingInstitutionCommandService.class).asEagerSingleton();
        bind(InstitutionCommandService.class).to(ValidatingInstitutionCommandService.class).asEagerSingleton();
    }

    protected void _configureInstitutionQueryService() {
        bind(InstitutionQueryService.class).annotatedWith(LoggingInstitutionQueryService.DELEGATE_NAME)
                .to(StoreInstitutionQueryService.class).asEagerSingleton();
        bind(InstitutionQueryService.class).annotatedWith(ValidatingInstitutionQueryService.DELEGATE_NAME)
                .to(LoggingInstitutionQueryService.class).asEagerSingleton();
        bind(InstitutionQueryService.class).to(ValidatingInstitutionQueryService.class).asEagerSingleton();
    }

    protected void _configureInstitutionStore() {
        bind(InstitutionStore.class).to(storeProperties.getCacheInstitutions() ? CachingInstitutionStore.class
                : FileSystemInstitutionStore.class);
    }

    @Override
    protected void configure() {
        _configureInstitutionCommandService();
        _configureInstitutionQueryService();
        _configureInstitutionStore();
    }

    private final StoreProperties storeProperties;
}
