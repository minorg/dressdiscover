package net.lab1318.costume.lib.services.user;

import static com.google.common.base.Preconditions.checkNotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thryft.native_.EmailAddress;

import net.lab1318.costume.api.models.user.User;
import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.models.user.UserId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.user.NoSuchUserException;
import net.lab1318.costume.lib.stores.user.UserStore;

abstract class StoreUserQueryService implements IterableUserQueryService {
    protected StoreUserQueryService(final UserStore store) {
        this.store = checkNotNull(store);
    }

    @Override
    public UserEntry getUserByEmailAddress(final EmailAddress emailAddress) throws IoException, NoSuchUserException {
        return store.getUserByEmailAddress(emailAddress, logger,
                net.lab1318.costume.lib.services.user.LoggingUserQueryService.Markers.GET_USER_BY_ID);
    }

    @Override
    public User getUserById(final UserId id) throws IoException, NoSuchUserException {
        return store.getUserById(id, logger,
                net.lab1318.costume.lib.services.user.LoggingUserQueryService.Markers.GET_USER_BY_ID);
    }

    @Override
    public Iterable<UserEntry> getUsers() throws IoException {
        return store.getUsers(logger, Markers.GET_USERS);
    }

    private final UserStore store;
    private final static Logger logger = LoggerFactory.getLogger(StoreUserQueryService.class);
}
