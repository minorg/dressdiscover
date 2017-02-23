package org.dressdiscover.lib.services.qa;

import org.dressdiscover.api.services.qa.LoggingQaCommandService;
import org.dressdiscover.api.services.qa.LoggingQaQueryService;
import org.dressdiscover.api.services.qa.QaCommandService;
import org.dressdiscover.api.services.qa.QaQueryService;
import org.dressdiscover.api.services.qa.ValidatingQaCommandService;
import org.dressdiscover.api.services.qa.ValidatingQaQueryService;

import com.google.inject.AbstractModule;

public final class QaServicesModule extends AbstractModule {
    protected void _configureQaCommandService() {
        bind(QaCommandService.class).annotatedWith(LoggingQaCommandService.DELEGATE_NAME)
                .to(MongoQaCommandService.class).asEagerSingleton();
        bind(QaCommandService.class).annotatedWith(ValidatingQaCommandService.DELEGATE_NAME)
                .to(LoggingQaCommandService.class).asEagerSingleton();
        bind(QaCommandService.class).to(ValidatingQaCommandService.class).asEagerSingleton();
    }

    protected void _configureQaQueryService() {
        bind(QaQueryService.class).annotatedWith(LoggingQaQueryService.DELEGATE_NAME).to(MongoQaQueryService.class)
                .asEagerSingleton();
        bind(QaQueryService.class).annotatedWith(ValidatingQaQueryService.DELEGATE_NAME).to(LoggingQaQueryService.class)
                .asEagerSingleton();
        bind(QaQueryService.class).to(ValidatingQaQueryService.class).asEagerSingleton();
    }

    @Override
    protected void configure() {
        _configureQaCommandService();
        _configureQaQueryService();
    }
}
