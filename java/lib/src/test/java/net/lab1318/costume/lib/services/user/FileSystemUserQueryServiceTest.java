package net.lab1318.costume.lib.services.user;

import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;
import net.lab1318.costume.lib.services.ServicesModule;

public final class FileSystemUserQueryServiceTest extends UserQueryServiceTest {
    @Override
    protected ServicesModule _newServicesModule() {
        return new ServicesModule() {
            @Override
            protected void _configureUserCommandService() {
                bind(UserCommandService.class).to(FileSystemUserCommandService.class);
            }

            @Override
            protected void _configureUserQueryService() {
                bind(IterableUserQueryService.class).to(FileSystemUserQueryService.class);
                bind(UserQueryService.class).to(FileSystemUserQueryService.class);
            }
        };
    }
}
