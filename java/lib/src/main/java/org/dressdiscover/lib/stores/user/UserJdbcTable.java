package org.dressdiscover.lib.stores.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.dressdiscover.api.models.user.User;
import org.dressdiscover.api.models.user.UserEntry;
import org.dressdiscover.api.models.user.UserId;
import org.dressdiscover.lib.CostumeProperties;
import org.dressdiscover.lib.services.IoExceptions;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.thryft.native_.EmailAddress;
import org.thryft.protocol.InputProtocolException;
import org.thryft.protocol.OutputProtocolException;
import org.thryft.waf.lib.protocols.JdbcResultSetInputProtocol;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.user.NoSuchUserException;

@Singleton
public final class UserJdbcTable extends AbstractJdbcTable<User> implements UserStore {
    @Inject
    public UserJdbcTable(final CostumeProperties properties) throws SQLException {
        super(properties);

    }

    public UserJdbcTable(final CostumeProperties properties, final String url) throws SQLException {
        super(properties, url);
    }

    @Override
    public void deleteUserById(final Logger logger, final Marker logMarker, final UserId userId)
            throws IoException, NoSuchUserException {
        try (Connection connection = _getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement(deleteUserByIdSql)) {
                statement.setInt(1, userId.asInteger());
                final int updateCount = statement.executeUpdate();
                if (updateCount == 1) {
                    return;
                } else if (updateCount == 0) {
                    throw new NoSuchUserException();
                } else {
                    throw new IllegalStateException("" + updateCount);
                }
            }
        } catch (final SQLException e) {
            throw _wrap(e, "error deleting user by ID");
        }
    }

    @Override
    public void deleteUsers(final Logger logger, final Marker logMarker) throws IoException {
        try (Connection connection = _getConnection()) {
            try (Statement statement = connection.createStatement()) {
                statement.execute(deleteUsersSql);
            }
        } catch (final SQLException e) {
            throw _wrap(e, "error deleting users");
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
            throw _wrap(e, "error getting user by email address");
        }
    }

    @Override
    public User getUserById(final Logger logger, final Marker logMarker, final UserId userId)
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
            throw _wrap(e, "error getting user by ID");
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
            throw _wrap(e, "error getting user by ID");
        }
    }

    @Override
    public UserId postUser(final Logger logger, final Marker logMarker, final User user) throws IoException {
        try (Connection connection = _getConnection()) {
            try (PreparedStatement userInsertStatement = connection.prepareStatement(_getInsertSql(user, TABLE_NAME))) {
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
            throw _wrap(e, "error posting user");
        }
    }

    @Override
    public void putUser(final Logger logger, final Marker logMarker, final User user, final UserId userId)
            throws IoException, NoSuchUserException {
        try (Connection connection = _getConnection()) {
            try (PreparedStatement userUpdateStatement = connection
                    .prepareStatement(_getUpdateSql(user, TABLE_NAME) + " WHERE id = ?")) {
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
            throw _wrap(e, "error putting user");
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

    private final String deleteUserByIdSql = String.format("DELETE FROM %s WHERE id = ?", TABLE_NAME);
    private final String deleteUsersSql = String.format("DELETE FROM %s", TABLE_NAME);
    private final String getUserByEmailAddressSql = String.format("SELECT * FROM %s WHERE %s.email_address = ?",
            TABLE_NAME, TABLE_NAME);
    private final String getUserByIdSql = String.format("SELECT * FROM %s WHERE %s.id = ?", TABLE_NAME, TABLE_NAME);
    private final String getUsersSql = String.format("SELECT * FROM %s", TABLE_NAME);
    final static String CREATE_TABLE_SQL = "CREATE TABLE IF NOT EXISTS user(\n"
            + "    id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,\n" + "    ctime TIMESTAMP NOT NULL,\n"
            + "    email_address VARCHAR NOT NULL UNIQUE\n" + ")";
    private final static String TABLE_NAME = "user";

}
