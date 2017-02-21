package org.dressdiscover.lib.services.user;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.api.models.user.User;
import org.dressdiscover.api.models.user.UserBookmarkEntry;
import org.dressdiscover.api.models.user.UserEntry;
import org.dressdiscover.api.models.user.UserId;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.user.NoSuchUserException;
import org.dressdiscover.lib.stores.user.UserBookmarkStore;
import org.dressdiscover.lib.stores.user.UserStore;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;

abstract class StoreUserQueryService implements IterableUserQueryService {
    protected StoreUserQueryService(final UserBookmarkStore userBookmarkStore, final UserStore userStore) {
        this.userBookmarkStore = checkNotNull(userBookmarkStore);
        this.userStore = checkNotNull(userStore);
    }

    @Override
    public final ImmutableList<UserBookmarkEntry> getUserBookmarksByUserId(final UserId userId,
            final Optional<Boolean> objectIdsOnly) throws IoException, NoSuchUserException {
        return userBookmarkStore.getUserBookmarksByUserId(
                org.dressdiscover.lib.services.user.LoggingUserQueryService.Markers.GET_USER_BOOKMARKS_BY_USER_ID,
                objectIdsOnly.or(Boolean.FALSE), userId);
    }

    @Override
    public final UserEntry getUserByEmailAddress(final String emailAddress) throws IoException, NoSuchUserException {
        return userStore.getUserByEmailAddress(emailAddress,
                org.dressdiscover.lib.services.user.LoggingUserQueryService.Markers.GET_USER_BY_ID);
    }

    @Override
    public final User getUserById(final UserId id) throws IoException, NoSuchUserException {
        return userStore.getUserById(org.dressdiscover.lib.services.user.LoggingUserQueryService.Markers.GET_USER_BY_ID,
                id);
    }

    @Override
    public final Iterable<UserEntry> getUsers() throws IoException {
        return userStore.getUsers(Markers.GET_USERS);
    }

    private final UserBookmarkStore userBookmarkStore;
    private final UserStore userStore;
}
