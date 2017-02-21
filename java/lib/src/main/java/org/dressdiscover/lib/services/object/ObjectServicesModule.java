package org.dressdiscover.lib.services.object;

import org.dressdiscover.api.services.object.ObjectCommandService;
import org.dressdiscover.api.services.object.ObjectQueryService;
import org.dressdiscover.api.services.object.ObjectSummaryQueryService;

import com.google.inject.AbstractModule;

public final class ObjectServicesModule extends AbstractModule {
    protected void _configureObjectCommandService() {
        bind(ObjectCommandService.class).annotatedWith(LoggingObjectCommandService.DELEGATE_NAME)
                .to(StoreObjectCommandService.class).asEagerSingleton();
        bind(ObjectCommandService.class).annotatedWith(ValidatingObjectCommandService.DELEGATE_NAME)
                .to(LoggingObjectCommandService.class).asEagerSingleton();
        bind(ObjectCommandService.class).to(ValidatingObjectCommandService.class).asEagerSingleton();
    }

    protected void _configureObjectQueryService() {
        bind(ObjectQueryService.class).annotatedWith(LoggingObjectQueryService.DELEGATE_NAME)
                .to(StoreObjectQueryService.class).asEagerSingleton();
        bind(ObjectQueryService.class).annotatedWith(ValidatingObjectQueryService.DELEGATE_NAME)
                .to(LoggingObjectQueryService.class).asEagerSingleton();
        bind(ObjectQueryService.class).to(ValidatingObjectQueryService.class).asEagerSingleton();
    }

    protected void _configureObjectSummaryQueryService() {
        bind(ObjectSummaryQueryService.class).annotatedWith(LoggingObjectSummaryQueryService.DELEGATE_NAME)
                .to(ElasticSearchObjectSummaryQueryService.class).asEagerSingleton();
        bind(ObjectSummaryQueryService.class).annotatedWith(ValidatingObjectSummaryQueryService.DELEGATE_NAME)
                .to(LoggingObjectSummaryQueryService.class).asEagerSingleton();
        bind(ObjectSummaryQueryService.class).to(ValidatingObjectSummaryQueryService.class).asEagerSingleton();
    }

    @Override
    protected void configure() {
        _configureObjectCommandService();
        _configureObjectQueryService();
        _configureObjectSummaryQueryService();
    }
}
