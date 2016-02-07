package net.lab1318.costume.lib.services.user;

import static com.google.common.base.Preconditions.checkNotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thryft.native_.EmailAddress;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;

import net.lab1318.costume.api.models.user.User;
import net.lab1318.costume.api.models.user.UserBookmarkEntry;
import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.models.user.UserId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.user.NoSuchUserException;
import net.lab1318.costume.lib.stores.user.UserBookmarkStore;
import net.lab1318.costume.lib.stores.user.UserStore;

abstract class StoreUserQueryService implements IterableUserQueryService {
    protected StoreUserQueryService(final UserBookmarkStore userBookmarkStore, final UserStore userStore) {
        this.userBookmarkStore = checkNotNull(userBookmarkStore);
        this.userStore = checkNotNull(userStore);
    }

    @Override
    public ImmutableList<UserBookmarkEntry> getUserBookmarksByUserId(final UserId userId,
            final Optional<Boolean> objectIdsOnly) throws IoException, NoSuchUserException {
        return userBookmarkStore.getUserBookmarksByUserId(logger,
                net.lab1318.costume.lib.services.user.LoggingUserQueryService.Markers.GET_USER_BOOKMARKS_BY_USER_ID,
                objectIdsOnly.or(Boolean.FALSE), userId);
    }

    @Override
    public UserEntry getUserByEmailAddress(final EmailAddress emailAddress) throws IoException, NoSuchUserException {
        return userStore.getUserByEmailAddress(emailAddress, logger,
                net.lab1318.costume.lib.services.user.LoggingUserQueryService.Markers.GET_USER_BY_ID);
    }

    @Override
    public User getUserById(final UserId id) throws IoException, NoSuchUserException {
        return userStore.getUserById(logger,
                net.lab1318.costume.lib.services.user.LoggingUserQueryService.Markers.GET_USER_BY_ID, id);
    }

    @Override
    public Iterable<UserEntry> getUsers() throws IoException {
        return userStore.getUsers(logger, Markers.GET_USERS);
    }

    private final UserBookmarkStore userBookmarkStore;
    private final UserStore userStore;
    private final static Logger logger = LoggerFactory.getLogger(StoreUserQueryService.class);
}
