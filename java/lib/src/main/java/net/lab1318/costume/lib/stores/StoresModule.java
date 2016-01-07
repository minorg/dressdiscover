package net.lab1318.costume.lib.stores;

import com.google.inject.AbstractModule;

import net.lab1318.costume.lib.stores.institution.InstitutionCache;
import net.lab1318.costume.lib.stores.institution.InstitutionStore;

public class StoresModule extends AbstractModule {
    protected void _configureInstitutionStore() {
        bind(InstitutionStore.class).to(InstitutionCache.class);
    }

    @Override
    protected void configure() {
        _configureInstitutionStore();
    }
}
