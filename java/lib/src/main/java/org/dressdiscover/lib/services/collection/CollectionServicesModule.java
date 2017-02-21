package org.dressdiscover.lib.services.collection;

import org.dressdiscover.api.services.collection.CollectionCommandService;
import org.dressdiscover.api.services.collection.CollectionQueryService;

import com.google.inject.AbstractModule;

public final class CollectionServicesModule extends AbstractModule {
    protected void _configureCollectionCommandService() {
        bind(CollectionCommandService.class).annotatedWith(LoggingCollectionCommandService.DELEGATE_NAME)
                .to(StoreCollectionCommandService.class).asEagerSingleton();
        bind(CollectionCommandService.class).annotatedWith(ValidatingCollectionCommandService.DELEGATE_NAME)
                .to(LoggingCollectionCommandService.class).asEagerSingleton();
        bind(CollectionCommandService.class).to(ValidatingCollectionCommandService.class).asEagerSingleton();
    }

    protected void _configureCollectionQueryService() {
        bind(CollectionQueryService.class).annotatedWith(LoggingCollectionQueryService.DELEGATE_NAME)
                .to(StoreCollectionQueryService.class).asEagerSingleton();
        bind(CollectionQueryService.class).annotatedWith(ValidatingCollectionQueryService.DELEGATE_NAME)
                .to(LoggingCollectionQueryService.class).asEagerSingleton();
        bind(CollectionQueryService.class).to(ValidatingCollectionQueryService.class).asEagerSingleton();
    }

    @Override
    protected void configure() {
        _configureCollectionCommandService();
        _configureCollectionQueryService();
    }
}
