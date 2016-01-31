package net.lab1318.costume.lib.services.user;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.lab1318.costume.api.models.user.User;
import net.lab1318.costume.api.models.user.UserId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.user.NoSuchUserException;
import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.lib.services.ServiceExceptionHelper;
import net.lab1318.costume.lib.services.user.LoggingUserCommandService.Markers;
import net.lab1318.costume.lib.stores.user.UserStore;

abstract class StoreUserCommandService implements UserCommandService {
    protected StoreUserCommandService(final UserStore store) {
        this.store = checkNotNull(store);
    }

    @Override
    public void deleteUserById(final UserId id) throws IoException, NoSuchUserException {
        try {
            if (!store.deleteUserById(id, logger, Markers.DELETE_USER_BY_ID)) {
                throw new NoSuchUserException();
            }
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error deleting user by id");
        }
    }

    @Override
    public void deleteUsers() throws IoException {
        try {
            store.deleteUsers(logger, Markers.DELETE_USERS);
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error deleting users");
        }
    }

    @Override
    public void putUser(final UserId id, final User user) throws IoException {
        try {
            store.putUser(user, id, logger, Markers.PUT_USER);
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error putting user");
        }
    }

    private final UserStore store;
    private final static Logger logger = LoggerFactory.getLogger(StoreUserCommandService.class);
}
