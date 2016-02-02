package net.lab1318.costume.lib.services.user;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thryft.waf.lib.stores.NoSuchModelException;

import net.lab1318.costume.api.models.user.User;
import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.models.user.UserId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.user.DuplicateUserException;
import net.lab1318.costume.api.services.user.NoSuchUserException;
import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.lib.services.IoExceptions;
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
            throw IoExceptions.wrap(e, "error deleting user by id");
        }
    }

    @Override
    public void deleteUsers() throws IoException {
        try {
            store.deleteUsers(logger, Markers.DELETE_USERS);
        } catch (final IOException e) {
            throw IoExceptions.wrap(e, "error deleting users");
        }
    }

    @Override
    public UserEntry postAndGetUser(final User user) throws DuplicateUserException, IoException {
        try {
            return new UserEntry(store.postUser(user, logger, Markers.POST_AND_GET_USER), user);
        } catch (final IOException e) {
            throw IoExceptions.wrap(e, "error posting user");
        }
    }

    @Override
    public UserId postUser(final User user) throws DuplicateUserException, IoException {
        return postAndGetUser(user).getId();
    }

    @Override
    public void putUser(final UserId id, final User user) throws IoException, NoSuchUserException {
        try {
            store.putUser(user, id, logger, Markers.PUT_USER);
        } catch (final IOException e) {
            throw IoExceptions.wrap(e, "error putting user");
        } catch (final NoSuchModelException e) {
            throw new NoSuchUserException();
        }
    }

    private final UserStore store;
    private final static Logger logger = LoggerFactory.getLogger(StoreUserCommandService.class);
}
