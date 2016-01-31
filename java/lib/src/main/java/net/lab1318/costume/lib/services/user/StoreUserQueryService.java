package net.lab1318.costume.lib.services.user;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thryft.waf.lib.stores.InvalidModelException;
import org.thryft.waf.lib.stores.NoSuchModelException;

import net.lab1318.costume.api.models.user.User;
import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.models.user.UserId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.user.NoSuchUserException;
import net.lab1318.costume.lib.services.ServiceExceptionHelper;
import net.lab1318.costume.lib.stores.user.UserStore;

abstract class StoreUserQueryService implements IterableUserQueryService {
    protected StoreUserQueryService(final UserStore store) {
        this.store = checkNotNull(store);
    }

    @Override
    public User getUserById(final UserId id) throws IoException, NoSuchUserException {
        try {
            return store.getUserById(id, logger,
                    net.lab1318.costume.lib.services.user.LoggingUserQueryService.Markers.GET_USER_BY_ID);
        } catch (final InvalidModelException e) {
            logger.warn(net.lab1318.costume.lib.services.user.LoggingUserQueryService.Markers.GET_USER_BY_ID,
                    "invalid collection model {}: ", id, e);
            throw new NoSuchUserException();
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting user " + id);
        } catch (final NoSuchModelException e) {
            throw new NoSuchUserException();
        }
    }

    @Override
    public Iterable<UserEntry> getUsers() throws IoException {
        try {
            return store.getUsers(logger, Markers.GET_USERS);
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error getting users");
        }
    }

    private final UserStore store;
    private final static Logger logger = LoggerFactory.getLogger(StoreUserQueryService.class);
}
