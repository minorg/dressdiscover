package org.dressdiscover.api.services.user;

@com.google.inject.Singleton
public class LoggingUserSettingsQueryService implements org.dressdiscover.api.services.user.UserSettingsQueryService {
    public final static class UserSettingsQueryServiceLogMarkers {
        public final static org.slf4j.Marker GET_USER_SETTINGS = org.slf4j.MarkerFactory.getMarker("GET_USER_SETTINGS");

        public final static org.slf4j.Marker USER_SETTINGS_QUERY_SERVICE = org.slf4j.MarkerFactory.getMarker("USER_SETTINGS_QUERY_SERVICE");
        static {
            USER_SETTINGS_QUERY_SERVICE.add(GET_USER_SETTINGS);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.api.services.user.LoggingUserSettingsQueryService.delegate");

    @com.google.inject.Inject
    public LoggingUserSettingsQueryService(@com.google.inject.name.Named("org.dressdiscover.api.services.user.LoggingUserSettingsQueryService.delegate") final org.dressdiscover.api.services.user.UserSettingsQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public org.dressdiscover.api.models.user.UserSettings getUserSettings(final org.dressdiscover.api.models.user.UserId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException, org.dressdiscover.api.services.user.NoSuchUserSettingsException {
        final Object[] __logMessageArgs = new Object[2];
        __logMessageArgs[0] = id;

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(UserSettingsQueryServiceLogMarkers.GET_USER_SETTINGS, LogMessages.GET_USER_SETTINGS, __logMessageArgs);

        try {
            final org.dressdiscover.api.models.user.UserSettings __returnValue = delegate.getUserSettings(id);

            __logMessageArgs[__logMessageArgs.length - 1] = __returnValue;
            logger.info(UserSettingsQueryServiceLogMarkers.GET_USER_SETTINGS, LogMessages.GET_USER_SETTINGS, __logMessageArgs);

            return __returnValue;
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(UserSettingsQueryServiceLogMarkers.GET_USER_SETTINGS, LogMessages.GET_USER_SETTINGS, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.user.NoSuchUserException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(UserSettingsQueryServiceLogMarkers.GET_USER_SETTINGS, LogMessages.GET_USER_SETTINGS, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.user.NoSuchUserSettingsException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(UserSettingsQueryServiceLogMarkers.GET_USER_SETTINGS, LogMessages.GET_USER_SETTINGS, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(UserSettingsQueryServiceLogMarkers.GET_USER_SETTINGS, LogMessages.GET_USER_SETTINGS, __logMessageArgs);
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingUserSettingsQueryService.class);
    private final org.dressdiscover.api.services.user.UserSettingsQueryService delegate;

    private final static class LogMessages {
        public final static String GET_USER_SETTINGS = "get_user_settings(id={}) -> {}";
    }

    public final static String PRE_RETURN_VALUE = "...";
}
