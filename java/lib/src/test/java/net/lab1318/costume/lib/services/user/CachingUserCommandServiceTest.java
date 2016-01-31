package net.lab1318.costume.lib.services.user;

import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;
import net.lab1318.costume.lib.services.ServicesModule;

public final class CachingUserCommandServiceTest extends UserCommandServiceTest {
    @Override
    protected ServicesModule _newServicesModule() {
        return new ServicesModule() {
            @Override
            protected void _configureUserCommandService() {
                bind(UserCommandService.class).to(CachingUserCommandService.class);
            }

            @Override
            protected void _configureUserQueryService() {
                bind(IterableUserQueryService.class).to(CachingUserQueryService.class);
                bind(UserQueryService.class).to(CachingUserQueryService.class);
            }
        };
    }
}
