package net.lab1318.costume.lib.stores.user;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.Marker;
import org.thryft.waf.lib.stores.InvalidModelException;
import org.thryft.waf.lib.stores.NoSuchModelException;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.user.User;
import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.models.user.UserId;

@Singleton
public class UserCache implements UserStore {
    @Inject
    public UserCache(final UserFileSystem fileSystem) {
        this.fileSystem = checkNotNull(fileSystem);
    }

    @Override
    public synchronized boolean deleteUserById(final UserId userId, final Logger logger, final Marker logMarker)
            throws IOException {
        __clear(logger, logMarker);
        return fileSystem.deleteUserById(userId, logger, logMarker);
    }

    @Override
    public synchronized void deleteUsers(final Logger logger, final Marker logMarker) throws IOException {
        __clear(logger, logMarker);
        fileSystem.deleteUsers(logger, logMarker);
    }

    @Override
    public synchronized User getUserById(final UserId userId, final Logger logger, final Marker logMarker)
            throws InvalidModelException, IOException, NoSuchModelException {
        __fill(logger, logMarker);
        final User result = usersById.get(userId);
        if (result != null) {
            return result;
        } else {
            throw new NoSuchModelException();
        }
    }

    @Override
    public ImmutableList<UserEntry> getUsers(final Logger logger, final Marker logMarker) throws IOException {
        __fill(logger, logMarker);
        return users;
    }

    @Override
    public synchronized void putUser(final User user, final UserId userId, final Logger logger, final Marker logMarker)
            throws IOException {
        __clear(logger, logMarker);
        fileSystem.putUser(user, userId, logger, logMarker);
    }

    private void __clear(final Logger logger, final Marker logMarker) {
        logger.debug(logMarker, "clearing user cache");
        users = ImmutableList.of();
    }

    private void __fill(final Logger logger, final Marker logMarker) throws IOException {
        if (!users.isEmpty()) {
            return;
        }

        logger.debug(logMarker, "filling user cache");

        users = fileSystem.getUsers(logger, logMarker);

        {
            final ImmutableMap.Builder<UserId, User> usersByIdBuilder = ImmutableMap.builder();
            for (final UserEntry userEntry : users) {
                usersByIdBuilder.put(userEntry.getId(), userEntry.getModel());
            }
            usersById = usersByIdBuilder.build();
        }

    }

    private ImmutableList<UserEntry> users = ImmutableList.of();
    private ImmutableMap<UserId, User> usersById = ImmutableMap.of();
    private final UserFileSystem fileSystem;
}
