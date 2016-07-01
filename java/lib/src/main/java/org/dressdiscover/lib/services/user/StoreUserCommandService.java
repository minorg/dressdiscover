package org.dressdiscover.lib.services.user;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.api.models.user.User;
import org.dressdiscover.api.models.user.UserBookmark;
import org.dressdiscover.api.models.user.UserBookmarkId;
import org.dressdiscover.api.models.user.UserId;
import org.dressdiscover.lib.services.user.LoggingUserCommandService.Markers;
import org.dressdiscover.lib.stores.user.UserBookmarkStore;
import org.dressdiscover.lib.stores.user.UserStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.user.DuplicateUserBookmarkException;
import net.lab1318.costume.api.services.user.DuplicateUserException;
import net.lab1318.costume.api.services.user.NoSuchUserBookmarkException;
import net.lab1318.costume.api.services.user.NoSuchUserException;
import net.lab1318.costume.api.services.user.UserCommandService;

abstract class StoreUserCommandService implements UserCommandService {
    protected StoreUserCommandService(final UserBookmarkStore userBookmarkStore, final UserStore userStore) {
        this.userBookmarkStore = checkNotNull(userBookmarkStore);
        this.userStore = checkNotNull(userStore);
    }

    @Override
    public void deleteUserBookmarkById(final UserBookmarkId id) throws IoException, NoSuchUserBookmarkException {
        userBookmarkStore.deleteUserBookmarkById(logger, Markers.DELETE_USER_BOOKMARK_BY_ID, id);
    }

    @Override
    public void deleteUserById(final UserId id) throws IoException, NoSuchUserException {
        userStore.deleteUserById(logger, Markers.DELETE_USER_BY_ID, id);
    }

    @Override
    public void deleteUsers() throws IoException {
        userStore.deleteUsers(logger, Markers.DELETE_USERS);
    }

    @Override
    public UserId postUser(final User user) throws DuplicateUserException, IoException {
        return userStore.postUser(logger, Markers.POST_USER, user);
    }

    @Override
    public UserBookmarkId postUserBookmark(final UserBookmark userBookmark)
            throws DuplicateUserBookmarkException, IoException {
        if (!(userBookmark.getObjectId().isPresent() ^ userBookmark.getObjectQuery().isPresent())) {
            throw new IoException("user bookmark must have object_id xor object_query");
        }

        return userBookmarkStore.postUserBookmark(logger, Markers.POST_USER_BOOKMARK, userBookmark);
    }

    @Override
    public void putUser(final UserId id, final User user) throws IoException, NoSuchUserException {
        userStore.putUser(logger, Markers.PUT_USER, user, id);
    }

    private final UserBookmarkStore userBookmarkStore;
    private final UserStore userStore;
    private final static Logger logger = LoggerFactory.getLogger(StoreUserCommandService.class);
}
