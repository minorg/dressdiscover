package org.dressdiscover.lib.services.user;

@com.google.inject.Singleton
public class LoggingUserCommandService implements org.dressdiscover.api.services.user.UserCommandService {
    public static class Markers {
        public final static org.slf4j.Marker DELETE_USER_BOOKMARK_BY_ID = org.slf4j.MarkerFactory.getMarker("DELETE_USER_BOOKMARK_BY_ID");
        public final static org.slf4j.Marker DELETE_USER_BY_ID = org.slf4j.MarkerFactory.getMarker("DELETE_USER_BY_ID");
        public final static org.slf4j.Marker DELETE_USERS = org.slf4j.MarkerFactory.getMarker("DELETE_USERS");
        public final static org.slf4j.Marker POST_USER = org.slf4j.MarkerFactory.getMarker("POST_USER");
        public final static org.slf4j.Marker POST_USER_BOOKMARK = org.slf4j.MarkerFactory.getMarker("POST_USER_BOOKMARK");
        public final static org.slf4j.Marker PUT_USER = org.slf4j.MarkerFactory.getMarker("PUT_USER");

        public final static org.slf4j.Marker USER_COMMAND_SERVICE = org.slf4j.MarkerFactory.getMarker("USER_COMMAND_SERVICE");
        static {
            USER_COMMAND_SERVICE.add(DELETE_USER_BOOKMARK_BY_ID);
            USER_COMMAND_SERVICE.add(DELETE_USER_BY_ID);
            USER_COMMAND_SERVICE.add(DELETE_USERS);
            USER_COMMAND_SERVICE.add(POST_USER);
            USER_COMMAND_SERVICE.add(POST_USER_BOOKMARK);
            USER_COMMAND_SERVICE.add(PUT_USER);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.user.LoggingUserCommandService.delegate");

    @com.google.inject.Inject
    public LoggingUserCommandService(@com.google.inject.name.Named("org.dressdiscover.lib.services.user.LoggingUserCommandService.delegate") final org.dressdiscover.api.services.user.UserCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    public void deleteUserBookmarkById(final org.dressdiscover.api.models.user.UserBookmarkId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserBookmarkException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("delete_user_bookmark_by_id(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(new Messages.DeleteUserBookmarkByIdRequest(id));
        __logMessageStringBuilder.append(")");

        try {
            delegate.deleteUserBookmarkById(id);

            logger.debug(Markers.DELETE_USER_BOOKMARK_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.DELETE_USER_BOOKMARK_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final org.dressdiscover.api.services.user.NoSuchUserBookmarkException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.DELETE_USER_BOOKMARK_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public void deleteUserById(final org.dressdiscover.api.models.user.UserId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("delete_user_by_id(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(new Messages.DeleteUserByIdRequest(id));
        __logMessageStringBuilder.append(")");

        try {
            delegate.deleteUserById(id);

            logger.debug(Markers.DELETE_USER_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.DELETE_USER_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final org.dressdiscover.api.services.user.NoSuchUserException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.DELETE_USER_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public void deleteUsers() throws org.dressdiscover.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("delete_users(");
        __logMessageStringBuilder.append(")");

        try {
            delegate.deleteUsers();

            logger.debug(Markers.DELETE_USERS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.DELETE_USERS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public org.dressdiscover.api.models.user.UserId postUser(final org.dressdiscover.api.models.user.User user) throws org.dressdiscover.api.services.user.DuplicateUserException, org.dressdiscover.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("post_user(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(new Messages.PostUserRequest(user));
        __logMessageStringBuilder.append(")");

        try {
            org.dressdiscover.api.models.user.UserId __returnValue = delegate.postUser(user);

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.debug(Markers.POST_USER, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final org.dressdiscover.api.services.user.DuplicateUserException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.POST_USER, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.POST_USER, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public org.dressdiscover.api.models.user.UserBookmarkId postUserBookmark(final org.dressdiscover.api.models.user.UserBookmark userBookmark) throws org.dressdiscover.api.services.user.DuplicateUserBookmarkException, org.dressdiscover.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("post_user_bookmark(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(new Messages.PostUserBookmarkRequest(userBookmark));
        __logMessageStringBuilder.append(")");

        try {
            org.dressdiscover.api.models.user.UserBookmarkId __returnValue = delegate.postUserBookmark(userBookmark);

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.debug(Markers.POST_USER_BOOKMARK, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final org.dressdiscover.api.services.user.DuplicateUserBookmarkException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.POST_USER_BOOKMARK, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.POST_USER_BOOKMARK, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public void putUser(final org.dressdiscover.api.models.user.UserId id, final org.dressdiscover.api.models.user.User user) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("put_user(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(new Messages.PutUserRequest(id, user));
        __logMessageStringBuilder.append(")");

        try {
            delegate.putUser(id, user);

            logger.debug(Markers.PUT_USER, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.PUT_USER, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final org.dressdiscover.api.services.user.NoSuchUserException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.PUT_USER, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingUserCommandService.class);
    private final org.dressdiscover.api.services.user.UserCommandService delegate;
}
