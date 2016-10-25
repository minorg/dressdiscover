package org.dressdiscover.lib.properties;

import com.google.inject.AbstractModule;

public final class LibPropertiesModule extends AbstractModule {
    public LibPropertiesModule() {
        globalProperties = GlobalProperties.load();
        storeProperties = StoreProperties.load();
    }

    public GlobalProperties getGlobalProperties() {
        return globalProperties;
    }

    public StoreProperties getStoreProperties() {
        return storeProperties;
    }

    @Override
    protected void configure() {
        bind(GlobalProperties.class).toInstance(globalProperties);
        bind(StoreProperties.class).toInstance(storeProperties);
    }

    private final StoreProperties storeProperties;
    private final GlobalProperties globalProperties;
}
