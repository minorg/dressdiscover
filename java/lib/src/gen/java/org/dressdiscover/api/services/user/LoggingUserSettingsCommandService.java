package org.dressdiscover.api.services.user;

@com.google.inject.Singleton
public class LoggingUserSettingsCommandService implements org.dressdiscover.api.services.user.UserSettingsCommandService {
    public final static class UserSettingsCommandServiceLogMarkers {
        public final static org.slf4j.Marker PUT_USER_SETTINGS = org.slf4j.MarkerFactory.getMarker("PUT_USER_SETTINGS");

        public final static org.slf4j.Marker USER_SETTINGS_COMMAND_SERVICE = org.slf4j.MarkerFactory.getMarker("USER_SETTINGS_COMMAND_SERVICE");
        static {
            USER_SETTINGS_COMMAND_SERVICE.add(PUT_USER_SETTINGS);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.api.services.user.LoggingUserSettingsCommandService.delegate");

    @com.google.inject.Inject
    public LoggingUserSettingsCommandService(@com.google.inject.name.Named("org.dressdiscover.api.services.user.LoggingUserSettingsCommandService.delegate") final org.dressdiscover.api.services.user.UserSettingsCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public void putUserSettings(final org.dressdiscover.api.models.user.UserId id, final org.dressdiscover.api.models.user.UserSettings userSettings) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        final Object[] __logMessageArgs = new Object[3];
        __logMessageArgs[0] = id;
        __logMessageArgs[1] = userSettings;

        __logMessageArgs[__logMessageArgs.length - 1] = PRE_RETURN_VALUE;
        logger.debug(UserSettingsCommandServiceLogMarkers.PUT_USER_SETTINGS, LogMessages.PUT_USER_SETTINGS, __logMessageArgs);

        try {
            delegate.putUserSettings(id, userSettings);

            __logMessageArgs[__logMessageArgs.length - 1] = VOID_RETURN_VALUE;
            logger.info(UserSettingsCommandServiceLogMarkers.PUT_USER_SETTINGS, LogMessages.PUT_USER_SETTINGS, __logMessageArgs);
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(UserSettingsCommandServiceLogMarkers.PUT_USER_SETTINGS, LogMessages.PUT_USER_SETTINGS, __logMessageArgs);
            throw e;
        } catch (final org.dressdiscover.api.services.user.NoSuchUserException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e.toString();
            logger.error(UserSettingsCommandServiceLogMarkers.PUT_USER_SETTINGS, LogMessages.PUT_USER_SETTINGS, __logMessageArgs);
            throw e;
        } catch (final RuntimeException e) {
            __logMessageArgs[__logMessageArgs.length - 1] = e;
            logger.error(UserSettingsCommandServiceLogMarkers.PUT_USER_SETTINGS, LogMessages.PUT_USER_SETTINGS, __logMessageArgs);
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingUserSettingsCommandService.class);
    private final org.dressdiscover.api.services.user.UserSettingsCommandService delegate;

    private final static class LogMessages {
        public final static String PUT_USER_SETTINGS = "put_user_settings(id={}, userSettings={}) -> {}";
    }

    public final static String PRE_RETURN_VALUE = "...";
    public final static String VOID_RETURN_VALUE = "void";
}
