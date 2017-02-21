package org.dressdiscover.lib.services.user;

import org.dressdiscover.api.services.user.UserCommandService;
import org.dressdiscover.api.services.user.UserQueryService;

import com.google.inject.AbstractModule;

public final class UserServicesModule extends AbstractModule {
    protected void _configureUserCommandService() {
        bind(UserCommandService.class).annotatedWith(LoggingUserCommandService.DELEGATE_NAME)
                .to(JdbcUserCommandService.class).asEagerSingleton();
        bind(UserCommandService.class).annotatedWith(ValidatingUserCommandService.DELEGATE_NAME)
                .to(LoggingUserCommandService.class).asEagerSingleton();
        bind(UserCommandService.class).to(ValidatingUserCommandService.class).asEagerSingleton();
    }

    protected void _configureUserQueryService() {
        bind(IterableUserQueryService.class).annotatedWith(LoggingUserQueryService.DELEGATE_NAME)
                .to(JdbcUserQueryService.class).asEagerSingleton();
        bind(UserQueryService.class).annotatedWith(LoggingUserQueryService.DELEGATE_NAME).to(JdbcUserQueryService.class)
                .asEagerSingleton();
        bind(UserQueryService.class).annotatedWith(ValidatingUserQueryService.DELEGATE_NAME)
                .to(LoggingUserQueryService.class).asEagerSingleton();
        bind(UserQueryService.class).to(ValidatingUserQueryService.class).asEagerSingleton();
    }

    @Override
    protected void configure() {
        _configureUserCommandService();
        _configureUserQueryService();
    }
}
