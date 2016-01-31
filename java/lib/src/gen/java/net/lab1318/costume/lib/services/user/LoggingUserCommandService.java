package net.lab1318.costume.lib.services.user;

@com.google.inject.Singleton
public class LoggingUserCommandService implements net.lab1318.costume.api.services.user.UserCommandService {
    public static class Markers {
        public final static org.slf4j.Marker DELETE_USER_BY_ID = org.slf4j.MarkerFactory.getMarker("DELETE_USER_BY_ID");
        public final static org.slf4j.Marker DELETE_USERS = org.slf4j.MarkerFactory.getMarker("DELETE_USERS");
        public final static org.slf4j.Marker PUT_USER = org.slf4j.MarkerFactory.getMarker("PUT_USER");

        public final static org.slf4j.Marker USER_COMMAND_SERVICE = org.slf4j.MarkerFactory.getMarker("USER_COMMAND_SERVICE");
        static {
            USER_COMMAND_SERVICE.add(DELETE_USER_BY_ID);
            USER_COMMAND_SERVICE.add(DELETE_USERS);
            USER_COMMAND_SERVICE.add(PUT_USER);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("net.lab1318.costume.lib.services.user.LoggingUserCommandService.delegate");

    @com.google.inject.Inject
    public LoggingUserCommandService(@com.google.inject.name.Named("net.lab1318.costume.lib.services.user.LoggingUserCommandService.delegate") final net.lab1318.costume.api.services.user.UserCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    public void deleteUserById(final net.lab1318.costume.api.models.user.UserId id) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.user.NoSuchUserException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("delete_user_by_id(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(new Messages.DeleteUserByIdRequest(id));
        __logMessageStringBuilder.append(")");

        try {
            delegate.deleteUserById(id);

            logger.debug(Markers.DELETE_USER_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.DELETE_USER_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final net.lab1318.costume.api.services.user.NoSuchUserException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.DELETE_USER_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public void deleteUsers() throws net.lab1318.costume.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("delete_users(");
        __logMessageStringBuilder.append(")");

        try {
            delegate.deleteUsers();

            logger.debug(Markers.DELETE_USERS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.DELETE_USERS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public void putUser(final net.lab1318.costume.api.models.user.UserId id, final net.lab1318.costume.api.models.user.User user) throws net.lab1318.costume.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("put_user(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(new Messages.PutUserRequest(id, user));
        __logMessageStringBuilder.append(")");

        try {
            delegate.putUser(id, user);

            logger.debug(Markers.PUT_USER, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.PUT_USER, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingUserCommandService.class);
    private final net.lab1318.costume.api.services.user.UserCommandService delegate;
}
