package org.dressdiscover.lib.services.user;

@com.google.inject.Singleton
public class LoggingUserCommandService implements org.dressdiscover.api.services.user.UserCommandService {
    public final static class UserCommandServiceLogMarkers {
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

    @Override
    public void deleteUserBookmarkById(final org.dressdiscover.api.models.user.UserBookmarkId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserBookmarkException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = id;

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(UserCommandServiceLogMarkers.DELETE_USER_BOOKMARK_BY_ID, LogMessages.DELETE_USER_BOOKMARK_BY_ID, __logMessageArgs);

        try {
            delegate.deleteUserBookmarkById(id);

            __logMessageArgs[__logMessageArgs.length - 1] = VOID_RETURN_VALUE;
            logger.info(UserCommandServiceLogMarkers.DELETE_USER_BOOKMARK_BY_ID, LogMessages.DELETE_USER_BOOKMARK_BY_ID, __logMessageArgs);
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(UserCommandServiceLogMarkers.DELETE_USER_BOOKMARK_BY_ID, LogMessages.DELETE_USER_BOOKMARK_BY_ID, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.user.NoSuchUserBookmarkException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(UserCommandServiceLogMarkers.DELETE_USER_BOOKMARK_BY_ID, LogMessages.DELETE_USER_BOOKMARK_BY_ID, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(UserCommandServiceLogMarkers.DELETE_USER_BOOKMARK_BY_ID, LogMessages.DELETE_USER_BOOKMARK_BY_ID, __logMessageArgs);
            throw e;
        }
    }

    @Override
    public void deleteUserById(final org.dressdiscover.api.models.user.UserId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = id;

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(UserCommandServiceLogMarkers.DELETE_USER_BY_ID, LogMessages.DELETE_USER_BY_ID, __logMessageArgs);

        try {
            delegate.deleteUserById(id);

            __logMessageArgs[__logMessageArgs.length - 1] = VOID_RETURN_VALUE;
            logger.info(UserCommandServiceLogMarkers.DELETE_USER_BY_ID, LogMessages.DELETE_USER_BY_ID, __logMessageArgs);
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(UserCommandServiceLogMarkers.DELETE_USER_BY_ID, LogMessages.DELETE_USER_BY_ID, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.user.NoSuchUserException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(UserCommandServiceLogMarkers.DELETE_USER_BY_ID, LogMessages.DELETE_USER_BY_ID, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(UserCommandServiceLogMarkers.DELETE_USER_BY_ID, LogMessages.DELETE_USER_BY_ID, __logMessageArgs);
            throw e;
        }
    }

    @Override
    public void deleteUsers() throws org.dressdiscover.api.services.IoException {
        Object __logMessageArgs = null;

        __logMessageArgs = PRE_RETURN_VALUE;
        logger.debug(UserCommandServiceLogMarkers.DELETE_USERS, LogMessages.DELETE_USERS, __logMessageArgs);

        try {
            delegate.deleteUsers();

            __logMessageArgs = VOID_RETURN_VALUE;
            logger.info(UserCommandServiceLogMarkers.DELETE_USERS, LogMessages.DELETE_USERS, __logMessageArgs);
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs = e.toString();
            logger.error(UserCommandServiceLogMarkers.DELETE_USERS, LogMessages.DELETE_USERS, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs = e;
            logger.error(UserCommandServiceLogMarkers.DELETE_USERS, LogMessages.DELETE_USERS, __logMessageArgs);
            throw e;
        }
    }

    @Override
    public org.dressdiscover.api.models.user.UserId postUser(final org.dressdiscover.api.models.user.User user) throws org.dressdiscover.api.services.user.DuplicateUserException, org.dressdiscover.api.services.IoException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = user;

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(UserCommandServiceLogMarkers.POST_USER, LogMessages.POST_USER, __logMessageArgs);

        try {
            final org.dressdiscover.api.models.user.UserId __returnValue = delegate.postUser(user);

            __logMessageArgs[__logMessageArgs.length - 1] = __returnValue;
            logger.info(UserCommandServiceLogMarkers.POST_USER, LogMessages.POST_USER, __logMessageArgs);

            return __returnValue;
        } catch (final org.dressdiscover.api.services.user.DuplicateUserException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(UserCommandServiceLogMarkers.POST_USER, LogMessages.POST_USER, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(UserCommandServiceLogMarkers.POST_USER, LogMessages.POST_USER, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(UserCommandServiceLogMarkers.POST_USER, LogMessages.POST_USER, __logMessageArgs);
            throw e;
        }
    }

    @Override
    public org.dressdiscover.api.models.user.UserBookmarkId postUserBookmark(final org.dressdiscover.api.models.user.UserBookmark userBookmark) throws org.dressdiscover.api.services.user.DuplicateUserBookmarkException, org.dressdiscover.api.services.IoException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = userBookmark;

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(UserCommandServiceLogMarkers.POST_USER_BOOKMARK, LogMessages.POST_USER_BOOKMARK, __logMessageArgs);

        try {
            final org.dressdiscover.api.models.user.UserBookmarkId __returnValue = delegate.postUserBookmark(userBookmark);

            __logMessageArgs[__logMessageArgs.length - 1] = __returnValue;
            logger.info(UserCommandServiceLogMarkers.POST_USER_BOOKMARK, LogMessages.POST_USER_BOOKMARK, __logMessageArgs);

            return __returnValue;
        } catch (final org.dressdiscover.api.services.user.DuplicateUserBookmarkException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(UserCommandServiceLogMarkers.POST_USER_BOOKMARK, LogMessages.POST_USER_BOOKMARK, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(UserCommandServiceLogMarkers.POST_USER_BOOKMARK, LogMessages.POST_USER_BOOKMARK, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(UserCommandServiceLogMarkers.POST_USER_BOOKMARK, LogMessages.POST_USER_BOOKMARK, __logMessageArgs);
            throw e;
        }
    }

    @Override
    public void putUser(final org.dressdiscover.api.models.user.UserId id, final org.dressdiscover.api.models.user.User user) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        final Object[] __logMessageArgs = new Object[3];
        __logMessageArgs[0] = id;
        __logMessageArgs[1] = user;

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(UserCommandServiceLogMarkers.PUT_USER, LogMessages.PUT_USER, __logMessageArgs);

        try {
            delegate.putUser(id, user);

            __logMessageArgs[__logMessageArgs.length - 1] = VOID_RETURN_VALUE;
            logger.info(UserCommandServiceLogMarkers.PUT_USER, LogMessages.PUT_USER, __logMessageArgs);
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(UserCommandServiceLogMarkers.PUT_USER, LogMessages.PUT_USER, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.user.NoSuchUserException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(UserCommandServiceLogMarkers.PUT_USER, LogMessages.PUT_USER, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(UserCommandServiceLogMarkers.PUT_USER, LogMessages.PUT_USER, __logMessageArgs);
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingUserCommandService.class);
    private final org.dressdiscover.api.services.user.UserCommandService delegate;

    private final static class LogMessages {
        public final static String DELETE_USER_BOOKMARK_BY_ID = "delete_user_bookmark_by_id(id={}) -> {}";
        public final static String DELETE_USER_BY_ID = "delete_user_by_id(id={}) -> {}";
        public final static String DELETE_USERS = "delete_users() -> {}";
        public final static String POST_USER = "post_user(user={}) -> {}";
        public final static String POST_USER_BOOKMARK = "post_user_bookmark(userBookmark={}) -> {}";
        public final static String PUT_USER = "put_user(id={}, user={}) -> {}";
    }

    public final static String PRE_RETURN_VALUE = "...";
    public final static String VOID_RETURN_VALUE = "void";
}
