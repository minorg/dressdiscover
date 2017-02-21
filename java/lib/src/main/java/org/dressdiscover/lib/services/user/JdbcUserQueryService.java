package org.dressdiscover.lib.services.user;

import org.dressdiscover.lib.stores.user.UserBookmarkJdbcTable;
import org.dressdiscover.lib.stores.user.UserJdbcTable;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
class JdbcUserQueryService extends StoreUserQueryService {
    @Inject
    public JdbcUserQueryService(final UserBookmarkJdbcTable userBookmarkStore, final UserJdbcTable userStore) {
        super(userBookmarkStore, userStore);
    }
}
