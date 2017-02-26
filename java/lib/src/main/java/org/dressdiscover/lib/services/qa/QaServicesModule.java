package org.dressdiscover.lib.services.qa;

import org.dressdiscover.api.services.qa.AnswerCommandService;
import org.dressdiscover.api.services.qa.AnswerQueryService;
import org.dressdiscover.api.services.qa.LoggingAnswerCommandService;
import org.dressdiscover.api.services.qa.LoggingAnswerQueryService;
import org.dressdiscover.api.services.qa.ValidatingAnswerCommandService;
import org.dressdiscover.api.services.qa.ValidatingAnswerQueryService;

import com.google.inject.AbstractModule;

public final class QaServicesModule extends AbstractModule {
    protected void _configureAnswerCommandService() {
        bind(AnswerCommandService.class).annotatedWith(LoggingAnswerCommandService.DELEGATE_NAME)
                .to(MongoAnswerCommandService.class).asEagerSingleton();
        bind(AnswerCommandService.class).annotatedWith(ValidatingAnswerCommandService.DELEGATE_NAME)
                .to(LoggingAnswerCommandService.class).asEagerSingleton();
        bind(AnswerCommandService.class).to(ValidatingAnswerCommandService.class).asEagerSingleton();
    }

    protected void _configureAnswerQueryService() {
        bind(AnswerQueryService.class).annotatedWith(LoggingAnswerQueryService.DELEGATE_NAME)
                .to(MongoAnswerQueryService.class).asEagerSingleton();
        bind(AnswerQueryService.class).annotatedWith(ValidatingAnswerQueryService.DELEGATE_NAME)
                .to(LoggingAnswerQueryService.class).asEagerSingleton();
        bind(AnswerQueryService.class).to(ValidatingAnswerQueryService.class).asEagerSingleton();
    }

    @Override
    protected void configure() {
        _configureAnswerCommandService();
        _configureAnswerQueryService();
    }
}
