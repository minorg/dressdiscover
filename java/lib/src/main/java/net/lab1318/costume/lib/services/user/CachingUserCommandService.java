package net.lab1318.costume.lib.services.user;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.lib.stores.user.UserCache;

@Singleton
public class CachingUserCommandService extends StoreUserCommandService {
    @Inject
    public CachingUserCommandService(final UserCache store) {
        super(store);
    }
}
