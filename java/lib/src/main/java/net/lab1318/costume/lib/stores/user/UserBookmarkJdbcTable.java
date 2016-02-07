package net.lab1318.costume.lib.stores.user;

import static com.google.common.base.Preconditions.checkState;

import java.io.StringWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.thryft.protocol.InputProtocolException;
import org.thryft.protocol.JacksonJsonInputProtocol;
import org.thryft.protocol.JacksonJsonOutputProtocol;
import org.thryft.protocol.OutputProtocolException;
import org.thryft.waf.lib.protocols.JdbcResultSetInputProtocol;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.models.user.UserBookmark;
import net.lab1318.costume.api.models.user.UserBookmarkEntry;
import net.lab1318.costume.api.models.user.UserBookmarkId;
import net.lab1318.costume.api.models.user.UserId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.user.DuplicateUserBookmarkException;
import net.lab1318.costume.api.services.user.NoSuchUserBookmarkException;
import net.lab1318.costume.lib.CostumeProperties;
import net.lab1318.costume.lib.services.IoExceptions;

@Singleton
public class UserBookmarkJdbcTable extends AbstractJdbcTable<UserBookmark> implements UserBookmarkStore {
    @Inject
    public UserBookmarkJdbcTable(final CostumeProperties properties) throws SQLException {
        super(properties);
    }

    public UserBookmarkJdbcTable(final CostumeProperties properties, final String url) throws SQLException {
        super(properties, url);
    }

    @Override
    public void deleteUserBookmarkById(final Logger logger, final Marker logMarker, final UserBookmarkId userBookmarkId)
            throws IoException, NoSuchUserBookmarkException {
        try (Connection connection = _getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement(deleteUserBookmarkByIdSql)) {
                statement.setInt(1, userBookmarkId.asInteger());
                final int updateCount = statement.executeUpdate();
                if (updateCount == 1) {
                    return;
                } else if (updateCount == 0) {
                    throw new NoSuchUserBookmarkException();
                } else {
                    throw new IllegalStateException("" + updateCount);
                }
            }
        } catch (final SQLException e) {
            throw _wrap(e, "error deleting user bookmark by ID");
        }
    }

    @Override
    public ImmutableList<UserBookmarkEntry> getUserBookmarksByUserId(final Logger logger, final Marker logMarker,
            final UserId userId) throws IoException {
        try (Connection connection = _getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement(getUserBookmarksByUserIdSql)) {
                statement.setInt(1, userId.asInteger());
                try (final ResultSet resultSet = statement.executeQuery()) {
                    return __getUserBookmarks(logger, logMarker, resultSet);
                }
            }
        } catch (final SQLException e) {
            throw _wrap(e, "error getting user bookmarks by user ID");
        }
    }

    @Override
    public UserBookmarkId postUserBookmark(final Logger logger, final Marker logMarker, final UserBookmark userBookmark)
            throws DuplicateUserBookmarkException, IoException {
        checkState(userBookmark.getObjectId().isPresent() ^ userBookmark.getObjectQuery().isPresent());

        try (Connection connection = _getConnection()) {
            // Check uniqueness manually

            ImmutableMap<String, Object> extraColumns;
            if (userBookmark.getObjectId().isPresent()) {
                try (PreparedStatement selectStatement = connection
                        .prepareStatement(selectDuplicateObjectIdUserBookmarksSql)) {
                    selectStatement.setString(1, userBookmark.getObjectId().get().toString());
                    selectStatement.setString(2, userBookmark.getUserId().toString());
                    try (ResultSet resultSet = selectStatement.executeQuery()) {
                        if (resultSet.next()) {
                            final int id = resultSet.getInt("id");
                            throw new DuplicateUserBookmarkException(
                                    String.format("duplicate bookmark %d with same object id", id));
                        }
                    }
                }
                extraColumns = ImmutableMap.of();
            } else {
                final StringWriter objectQueryJsonStringWriter = new StringWriter();
                final JacksonJsonOutputProtocol oprot = new JacksonJsonOutputProtocol(objectQueryJsonStringWriter);
                userBookmark.getObjectQuery().get().writeAsStruct(oprot);
                oprot.flush();
                final String objectQueryJson = objectQueryJsonStringWriter.toString();
                try (PreparedStatement selectStatement = connection
                        .prepareStatement(selectDuplicateObjectQueryUserBookmarksSql)) {
                    selectStatement.setString(1, objectQueryJson);
                    selectStatement.setString(2, userBookmark.getUserId().toString());
                    try (ResultSet resultSet = selectStatement.executeQuery()) {
                        if (resultSet.next()) {
                            final int id = resultSet.getInt("id");
                            throw new DuplicateUserBookmarkException(
                                    String.format("duplicate bookmark %d with same object query", id));
                        }
                    }
                }
                extraColumns = ImmutableMap.of(UserBookmark.FieldMetadata.OBJECT_QUERY.getThriftName(),
                        objectQueryJson);
            }

            try (PreparedStatement insertStatement = connection
                    .prepareStatement(_getInsertSql(userBookmark, TABLE_NAME, extraColumns))) {
                _setParameters(insertStatement, userBookmark, extraColumns);
                insertStatement.execute();
                try (final ResultSet insertResultSet = insertStatement.getGeneratedKeys()) {
                    if (insertResultSet.next()) {
                        return new UserBookmarkId(insertResultSet.getInt(1));
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
        } catch (final OutputProtocolException e) {
            throw IoExceptions.wrap(e, "error posting user bookmark");
        } catch (final SQLException e) {
            throw _wrap(e, "error posting user bookmark");
        }
    }

    private ImmutableList<UserBookmarkEntry> __getUserBookmarks(final Logger logger, final Marker logMarker,
            final ResultSet resultSet) throws SQLException {
        final JdbcResultSetInputProtocol iprot = new JdbcResultSetInputProtocol(resultSet);
        final ImmutableList.Builder<UserBookmarkEntry> userBookmarksBuilder = ImmutableList.builder();
        while (resultSet.next()) {
            final UserBookmarkId userBookmarkId = new UserBookmarkId(resultSet.getInt("id"));
            try {
                final UserBookmark.Builder userBookmarkBuilder = UserBookmark.builder().readAsStruct(iprot);
                final String objectQueryJson = resultSet
                        .getString(UserBookmark.FieldMetadata.OBJECT_QUERY.getThriftName());
                if (objectQueryJson != null) {
                    userBookmarkBuilder
                            .setObjectQuery(ObjectQuery.readAsStruct(new JacksonJsonInputProtocol(objectQueryJson)));
                }
                userBookmarksBuilder.add(new UserBookmarkEntry(userBookmarkId, userBookmarkBuilder.build()));
            } catch (final InputProtocolException e) {
                logger.warn(logMarker, "user bookmark model {} is invalid: {}", userBookmarkId,
                        ExceptionUtils.getRootCauseMessage(e));
            }
        }
        return userBookmarksBuilder.build();
    }

    private final String selectDuplicateObjectIdUserBookmarksSql = String.format(
            "SELECT id FROM %s WHERE %s = ? AND %s = ? LIMIT 1", TABLE_NAME,
            UserBookmark.FieldMetadata.OBJECT_ID.getThriftName(), UserBookmark.FieldMetadata.USER_ID.getThriftName());
    private final String selectDuplicateObjectQueryUserBookmarksSql = String.format(
            "SELECT id FROM %s WHERE %s = ? AND %s = ? LIMIT 1", TABLE_NAME,
            UserBookmark.FieldMetadata.OBJECT_QUERY.getThriftName(),
            UserBookmark.FieldMetadata.USER_ID.getThriftName());
    private final String deleteUserBookmarkByIdSql = String.format("DELETE FROM %s WHERE id = ?", TABLE_NAME);
    private final String getUserBookmarksByUserIdSql = String.format("SELECT * FROM %s WHERE %s = ?", TABLE_NAME,
            UserBookmark.FieldMetadata.USER_ID.getThriftName());
    final static String CREATE_TABLE_SQL = "CREATE TABLE IF NOT EXISTS user_bookmark(\n"
            + "    id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,\n" + "    object_query VARCHAR,\n"
            + "    user_id INTEGER NOT NULL,\n" + "    folder VARCHAR,\n" + "    object_id VARCHAR,\n"
            + "    FOREIGN KEY (user_id) REFERENCES user (id) ON DELETE CASCADE ON UPDATE CASCADE\n" + ")";
    private final static String TABLE_NAME = "user_bookmark";
}
