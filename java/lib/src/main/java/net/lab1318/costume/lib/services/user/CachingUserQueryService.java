package net.lab1318.costume.lib.services.user;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.lib.stores.user.UserCache;

@Singleton
public class CachingUserQueryService extends StoreUserQueryService {
    @Inject
    public CachingUserQueryService(final UserCache store) {
        super(store);
    }
}
