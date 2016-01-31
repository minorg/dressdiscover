package net.lab1318.costume.lib.stores.user;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.thryft.protocol.InputProtocol;
import org.thryft.protocol.InputProtocolException;
import org.thryft.waf.lib.stores.InvalidModelException;
import org.thryft.waf.lib.stores.NoSuchModelException;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.user.InvalidUserIdException;
import net.lab1318.costume.api.models.user.User;
import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.models.user.UserId;
import net.lab1318.costume.lib.CostumeProperties;
import net.lab1318.costume.lib.stores.AbstractFileSystem;

@Singleton
public class UserFileSystem extends AbstractFileSystem<User> implements UserStore {
    @Inject
    public UserFileSystem(final CostumeProperties properties) {
        super(new File(new File(new File(new File(properties.getHomeDirectoryPath()), "data"), "users"),
                properties.getEnvironment()));
    }

    @Override
    public final boolean deleteUserById(final UserId userId, final Logger logger, final Marker logMarker)
            throws IOException {
        return __getUserFilePath(userId).delete();
    }

    @Override
    public final void deleteUsers(final Logger logger, final Marker logMarker) throws IOException {
        _deleteDirectoryContents(true, _getRootDirectoryPath(), logger, logMarker);
    }

    @Override
    public final User getUserById(final UserId userId, final Logger logger, final Marker logMarker)
            throws InvalidModelException, IOException, NoSuchModelException {
        return _getModel(__getUserFilePath(userId), logger, logMarker);
    }

    @Override
    public ImmutableList<UserEntry> getUsers(final Logger logger, final Marker logMarker) throws IOException {
        final ImmutableList.Builder<UserEntry> resultBuilder = ImmutableList.builder();
        for (final File providerDirectoryPath : _getSubdirectoryPaths(_getRootDirectoryPath(), logger, logMarker)) {
            final File[] userFilePaths = providerDirectoryPath.listFiles();
            if (userFilePaths == null || userFilePaths.length == 0) {
                logger.warn(logMarker, "{} is empty or not listable", providerDirectoryPath);
                continue;
            }
            for (final File userFilePath : userFilePaths) {
                if (!userFilePath.getName().endsWith(".json")) {
                    continue;
                } else if (!userFilePath.isFile()) {
                    continue;
                }

                final String userIdString = providerDirectoryPath.getName() + '/'
                        + _decodeFileName(FilenameUtils.getBaseName(userFilePath.getName()));
                UserId userId;
                try {
                    userId = UserId.parse(userIdString);
                } catch (final InvalidUserIdException e) {
                    logger.warn(logMarker, "invalid user ID from file system '{}': {}", userIdString,
                            ExceptionUtils.getRootCauseMessage(e));
                    continue;
                }

                User user;
                try {
                    user = _getModel(userFilePath, logger, logMarker);
                } catch (final InvalidModelException e) {
                    logger.warn(logMarker, "invalid user model {} from {}", userId, userFilePath);
                    continue;
                } catch (final NoSuchModelException e1) {
                    logger.warn(logMarker, "user model {} from {} deleted?", userId, userFilePath);
                    continue;
                }

                resultBuilder.add(new UserEntry(userId, user));
            }
        }
        return resultBuilder.build();
    }

    @Override
    public final void putUser(final User user, final UserId userId, final Logger logger, final Marker logMarker)
            throws IOException {
        _putModel(__getUserFilePath(userId), logger, logMarker, user);
    }

    @Override
    protected User _readModel(final InputProtocol iprot) throws InputProtocolException {
        return User.readAsStruct(iprot);
    }

    private File __getUserFilePath(final UserId userId) {
        return new File(new File(userId.getAuthProviderId()), _encodeFileName(userId.getUnqualifiedUserId()) + ".json");
    }
}
