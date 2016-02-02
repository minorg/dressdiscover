package net.lab1318.costume.lib.services.user;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.lib.stores.user.JdbcUserStore;

@Singleton
public class JdbcUserCommandService extends StoreUserCommandService {
    @Inject
    public JdbcUserCommandService(final JdbcUserStore store) {
        super(store);
    }
}
