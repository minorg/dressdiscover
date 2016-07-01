package org.dressdiscover.lib.stores.user;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.dressdiscover.lib.CostumeProperties;
import org.thryft.waf.api.models.Model;

import net.lab1318.costume.api.services.IoException;

abstract class AbstractJdbcTable<ModelT extends Model> extends org.thryft.waf.lib.stores.AbstractJdbcTable<ModelT> {
    protected static IoException _wrap(final SQLException cause, final String message) {
        final IoException exception = new IoException(message);
        exception.initCause(cause);
        return exception;
    }

    protected AbstractJdbcTable(final CostumeProperties properties) throws SQLException {
        this(properties, "jdbc:h2:" + new File(new File(new File(properties.getHomeDirectoryPath()), "data"), "users")
                + ";TRACE_LEVEL_FILE=0");
    }

    protected AbstractJdbcTable(final CostumeProperties properties, final String url) throws SQLException {
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
                statement.execute(UserJdbcTable.CREATE_TABLE_SQL);
                statement.execute(UserBookmarkJdbcTable.CREATE_TABLE_SQL);
            }
            connection.commit();
        }
    }
}
