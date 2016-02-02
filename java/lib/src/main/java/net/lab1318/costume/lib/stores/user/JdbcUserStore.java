package net.lab1318.costume.lib.stores.user;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.thryft.native_.EmailAddress;
import org.thryft.protocol.InputProtocolException;
import org.thryft.protocol.OutputProtocolException;
import org.thryft.waf.lib.protocols.JdbcResultSetInputProtocol;
import org.thryft.waf.lib.stores.AbstractJdbcStore;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.user.User;
import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.models.user.UserId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.user.NoSuchUserException;
import net.lab1318.costume.lib.CostumeProperties;
import net.lab1318.costume.lib.services.IoExceptions;

@Singleton
public final class JdbcUserStore extends AbstractJdbcStore<User> implements UserStore {
    @Inject
    public JdbcUserStore(final CostumeProperties properties) throws SQLException {
        this(properties, "jdbc:h2:" + new File(new File(new File(properties.getHomeDirectoryPath()), "data"), "users"));
    }

    public JdbcUserStore(final CostumeProperties properties, final String url) throws SQLException {
        super(url);
        try {
            Class.forName("org.h2.Driver");
        } catch (final ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try (Connection connection = _getConnection()) {
            connection.setAutoCommit(false);
            try (Statement statement = connection.createStatement()) {
                // Order is important
                statement.execute(USER_CREATE_TABLE_SQL);
            }
            connection.commit();
        }

        deleteUserByIdSql = String.format("DELETE FROM %s WHERE id = ?", USER_TABLE_NAME);
        deleteUsersSql = String.format("DELETE FROM %s", USER_TABLE_NAME);
        getUserByEmailAddressSql = String.format("SELECT * FROM %s WHERE %s.email_address = ?", USER_TABLE_NAME,
                USER_TABLE_NAME);
        getUserByIdSql = String.format("SELECT * FROM %s WHERE %s.id = ?", USER_TABLE_NAME, USER_TABLE_NAME);
        getUsersSql = String.format("SELECT * FROM %s", USER_TABLE_NAME);
    }

    @Override
    public boolean deleteUserById(final UserId userId, final Logger logger, final Marker logMarker) throws IoException {
        try (Connection connection = _getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement(deleteUserByIdSql)) {
                statement.setInt(1, userId.asInteger());
                final int updateCount = statement.executeUpdate();
                if (updateCount == 1) {
                    return true;
                } else if (updateCount == 0) {
                    return false;
                } else {
                    throw new IllegalStateException("" + updateCount);
                }
            }
        } catch (final SQLException e) {
            throw __wrap(e, "error deleting user by ID");
        }
    }

    @Override
    public void deleteUsers(final Logger logger, final Marker logMarker) throws IoException {
        try (Connection connection = _getConnection()) {
            try (Statement statement = connection.createStatement()) {
                statement.execute(deleteUsersSql);
            }
        } catch (final SQLException e) {
            throw __wrap(e, "error deleting users");
        }
    }

    @Override
    public UserEntry getUserByEmailAddress(final EmailAddress emailAddress, final Logger logger, final Marker logMarker)
            throws IoException, NoSuchUserException {
        try (Connection connection = _getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement(getUserByEmailAddressSql)) {
                statement.setString(1, emailAddress.toString());
                try (final ResultSet resultSet = statement.executeQuery()) {
                    final ImmutableList<UserEntry> users = __getUsers(logger, logMarker, resultSet);
                    if (!users.isEmpty()) {
                        return users.get(0);
                    } else {
                        throw new NoSuchUserException();
                    }
                }
            }
        } catch (final SQLException e) {
            throw __wrap(e, "error getting user by email address");
        }
    }

    @Override
    public User getUserById(final UserId userId, final Logger logger, final Marker logMarker)
            throws IoException, NoSuchUserException {
        try (Connection connection = _getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement(getUserByIdSql)) {
                statement.setInt(1, userId.asInteger());
                try (final ResultSet resultSet = statement.executeQuery()) {
                    final ImmutableList<UserEntry> users = __getUsers(logger, logMarker, resultSet);
                    if (!users.isEmpty()) {
                        return users.get(0).getModel();
                    } else {
                        throw new NoSuchUserException();
                    }
                }
            }
        } catch (final SQLException e) {
            throw __wrap(e, "error getting user by ID");
        }
    }

    @Override
    public ImmutableList<UserEntry> getUsers(final Logger logger, final Marker logMarker) throws IoException {
        try (Connection connection = _getConnection()) {
            try (Statement statement = connection.createStatement()) {
                try (final ResultSet resultSet = statement.executeQuery(getUsersSql)) {
                    return __getUsers(logger, logMarker, resultSet);
                }
            }
        } catch (final SQLException e) {
            throw __wrap(e, "error getting user by ID");
        }
    }

    @Override
    public UserId postUser(final User user, final Logger logger, final Marker logMarker) throws IoException {
        try (Connection connection = _getConnection()) {
            try (PreparedStatement userInsertStatement = connection
                    .prepareStatement(_getInsertSql(user, USER_TABLE_NAME))) {
                _setParameters(userInsertStatement, user);
                userInsertStatement.execute();
                try (final ResultSet userInsertResultSet = userInsertStatement.getGeneratedKeys()) {
                    if (userInsertResultSet.next()) {
                        return new UserId(userInsertResultSet.getInt(1));
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
        } catch (final OutputProtocolException e) {
            throw IoExceptions.wrap(e, "error posting user");
        } catch (final SQLException e) {
            throw __wrap(e, "error posting user");
        }
    }

    @Override
    public void putUser(final User user, final UserId userId, final Logger logger, final Marker logMarker)
            throws IoException, NoSuchUserException {
        try (Connection connection = _getConnection()) {
            try (PreparedStatement userUpdateStatement = connection
                    .prepareStatement(_getUpdateSql(user, USER_TABLE_NAME) + " WHERE id = ?")) {
                {
                    final int parameterCount = _setParameters(userUpdateStatement, user);
                    userUpdateStatement.setInt(parameterCount + 1, userId.asInteger());
                }
                final int updateCount = userUpdateStatement.executeUpdate();
                if (updateCount == 1) {
                    return;
                } else if (updateCount == 0) {
                    throw new NoSuchUserException();
                } else {
                    throw new IllegalStateException("" + updateCount);
                }
            }
        } catch (final OutputProtocolException e) {
            throw IoExceptions.wrap(e, "error putting user");
        } catch (final SQLException e) {
            throw __wrap(e, "error putting user");
        }
    }

    private ImmutableList<UserEntry> __getUsers(final Logger logger, final Marker logMarker, final ResultSet resultSet)
            throws SQLException {
        final JdbcResultSetInputProtocol iprot = new JdbcResultSetInputProtocol(resultSet);
        final ImmutableList.Builder<UserEntry> usersBuilder = ImmutableList.builder();
        while (resultSet.next()) {
            final UserId userId = new UserId(resultSet.getInt("id"));
            try {
                final User user = User.readAsStruct(iprot);
                usersBuilder.add(new UserEntry(userId, user));
            } catch (final InputProtocolException e) {
                logger.warn(logMarker, "user model {} is invalid: {}", userId, ExceptionUtils.getRootCauseMessage(e));
            }
        }
        return usersBuilder.build();
    }

    private IoException __wrap(final SQLException cause, final String message) {
        final IoException exception = new IoException(message);
        exception.initCause(cause);
        return exception;
    }

    private final String deleteUserByIdSql;
    private final String deleteUsersSql;
    private final String getUserByEmailAddressSql;
    private final String getUserByIdSql;
    private final String getUsersSql;

    private final static String USER_CREATE_TABLE_SQL = "CREATE TABLE IF NOT EXISTS user(\n"
            + "    id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,\n" + "    email_address VARCHAR NOT NULL UNIQUE\n"
            + ")";
    private final static String USER_TABLE_NAME = "user";
}
