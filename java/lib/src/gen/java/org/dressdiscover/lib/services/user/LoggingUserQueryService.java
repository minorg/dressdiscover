package org.dressdiscover.lib.services.user;

@com.google.inject.Singleton
public class LoggingUserQueryService implements org.dressdiscover.api.services.user.UserQueryService {
    public final static class UserQueryServiceLogMarkers {
        public final static org.slf4j.Marker GET_USER_BOOKMARKS_BY_USER_ID = org.slf4j.MarkerFactory.getMarker("GET_USER_BOOKMARKS_BY_USER_ID");
        public final static org.slf4j.Marker GET_USER_BY_EMAIL_ADDRESS = org.slf4j.MarkerFactory.getMarker("GET_USER_BY_EMAIL_ADDRESS");
        public final static org.slf4j.Marker GET_USER_BY_ID = org.slf4j.MarkerFactory.getMarker("GET_USER_BY_ID");

        public final static org.slf4j.Marker USER_QUERY_SERVICE = org.slf4j.MarkerFactory.getMarker("USER_QUERY_SERVICE");
        static {
            USER_QUERY_SERVICE.add(GET_USER_BOOKMARKS_BY_USER_ID);
            USER_QUERY_SERVICE.add(GET_USER_BY_EMAIL_ADDRESS);
            USER_QUERY_SERVICE.add(GET_USER_BY_ID);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.user.LoggingUserQueryService.delegate");

    @com.google.inject.Inject
    public LoggingUserQueryService(@com.google.inject.name.Named("org.dressdiscover.lib.services.user.LoggingUserQueryService.delegate") final org.dressdiscover.api.services.user.UserQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> getUserBookmarksByUserId(final org.dressdiscover.api.models.user.UserId userId, final com.google.common.base.Optional<Boolean> objectIdsOnly) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = Messages.GetUserBookmarksByUserIdRequest.create(userId, objectIdsOnly);

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(UserQueryServiceLogMarkers.GET_USER_BOOKMARKS_BY_USER_ID, LogMessages.GET_USER_BOOKMARKS_BY_USER_ID, __logMessageArgs);

        try {
            final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> __returnValue = delegate.getUserBookmarksByUserId(userId, objectIdsOnly);

            __logMessageArgs[__logMessageArgs.length - 1] = __returnValue;
            logger.info(UserQueryServiceLogMarkers.GET_USER_BOOKMARKS_BY_USER_ID, LogMessages.GET_USER_BOOKMARKS_BY_USER_ID, __logMessageArgs);

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(UserQueryServiceLogMarkers.GET_USER_BOOKMARKS_BY_USER_ID, LogMessages.GET_USER_BOOKMARKS_BY_USER_ID, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.user.NoSuchUserException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(UserQueryServiceLogMarkers.GET_USER_BOOKMARKS_BY_USER_ID, LogMessages.GET_USER_BOOKMARKS_BY_USER_ID, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(UserQueryServiceLogMarkers.GET_USER_BOOKMARKS_BY_USER_ID, LogMessages.GET_USER_BOOKMARKS_BY_USER_ID, __logMessageArgs);
            throw e;
        }
    }

    @Override
    public org.dressdiscover.api.models.user.UserEntry getUserByEmailAddress(final String emailAddress) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = Messages.GetUserByEmailAddressRequest.create(emailAddress);

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(UserQueryServiceLogMarkers.GET_USER_BY_EMAIL_ADDRESS, LogMessages.GET_USER_BY_EMAIL_ADDRESS, __logMessageArgs);

        try {
            final org.dressdiscover.api.models.user.UserEntry __returnValue = delegate.getUserByEmailAddress(emailAddress);

            __logMessageArgs[__logMessageArgs.length - 1] = __returnValue;
            logger.info(UserQueryServiceLogMarkers.GET_USER_BY_EMAIL_ADDRESS, LogMessages.GET_USER_BY_EMAIL_ADDRESS, __logMessageArgs);

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(UserQueryServiceLogMarkers.GET_USER_BY_EMAIL_ADDRESS, LogMessages.GET_USER_BY_EMAIL_ADDRESS, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.user.NoSuchUserException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(UserQueryServiceLogMarkers.GET_USER_BY_EMAIL_ADDRESS, LogMessages.GET_USER_BY_EMAIL_ADDRESS, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(UserQueryServiceLogMarkers.GET_USER_BY_EMAIL_ADDRESS, LogMessages.GET_USER_BY_EMAIL_ADDRESS, __logMessageArgs);
            throw e;
        }
    }

    @Override
    public org.dressdiscover.api.models.user.User getUserById(final org.dressdiscover.api.models.user.UserId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = Messages.GetUserByIdRequest.create(id);

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(UserQueryServiceLogMarkers.GET_USER_BY_ID, LogMessages.GET_USER_BY_ID, __logMessageArgs);

        try {
            final org.dressdiscover.api.models.user.User __returnValue = delegate.getUserById(id);

            __logMessageArgs[__logMessageArgs.length - 1] = __returnValue;
            logger.info(UserQueryServiceLogMarkers.GET_USER_BY_ID, LogMessages.GET_USER_BY_ID, __logMessageArgs);

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(UserQueryServiceLogMarkers.GET_USER_BY_ID, LogMessages.GET_USER_BY_ID, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.user.NoSuchUserException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(UserQueryServiceLogMarkers.GET_USER_BY_ID, LogMessages.GET_USER_BY_ID, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(UserQueryServiceLogMarkers.GET_USER_BY_ID, LogMessages.GET_USER_BY_ID, __logMessageArgs);
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingUserQueryService.class);
    private final org.dressdiscover.api.services.user.UserQueryService delegate;

    private final static class LogMessages {
        public final static String GET_USER_BOOKMARKS_BY_USER_ID = "get_user_bookmarks_by_user_id({}) -> {}";
        public final static String GET_USER_BY_EMAIL_ADDRESS = "get_user_by_email_address({}) -> {}";
        public final static String GET_USER_BY_ID = "get_user_by_id({}) -> {}";
    }

    public final static String PRE_RETURN_VALUE = "...";
}
