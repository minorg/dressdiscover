package net.lab1318.costume.lib.services.user;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.lib.stores.user.UserBookmarkJdbcTable;
import net.lab1318.costume.lib.stores.user.UserJdbcTable;

@Singleton
public class JdbcUserCommandService extends StoreUserCommandService {
    @Inject
    public JdbcUserCommandService(final UserBookmarkJdbcTable userBookmarkStore, final UserJdbcTable userStore) {
        super(userBookmarkStore, userStore);
    }
}
