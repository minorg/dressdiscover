package net.lab1318.costume.lib.services.user;

@com.google.inject.Singleton
public class LoggingUserQueryService implements net.lab1318.costume.api.services.user.UserQueryService {
    public static class Markers {
        public final static org.slf4j.Marker GET_USER_BY_ID = org.slf4j.MarkerFactory.getMarker("GET_USER_BY_ID");

        public final static org.slf4j.Marker USER_QUERY_SERVICE = org.slf4j.MarkerFactory.getMarker("USER_QUERY_SERVICE");
        static {
            USER_QUERY_SERVICE.add(GET_USER_BY_ID);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("net.lab1318.costume.lib.services.user.LoggingUserQueryService.delegate");

    @com.google.inject.Inject
    public LoggingUserQueryService(@com.google.inject.name.Named("net.lab1318.costume.lib.services.user.LoggingUserQueryService.delegate") final net.lab1318.costume.api.services.user.UserQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    public net.lab1318.costume.api.models.user.User getUserById(final net.lab1318.costume.api.models.user.UserId id) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.user.NoSuchUserException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("get_user_by_id(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(new Messages.GetUserByIdRequest(id));
        __logMessageStringBuilder.append(")");

        try {
            net.lab1318.costume.api.models.user.User __returnValue = delegate.getUserById(id);

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.debug(Markers.GET_USER_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_USER_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final net.lab1318.costume.api.services.user.NoSuchUserException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.GET_USER_BY_ID, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingUserQueryService.class);
    private final net.lab1318.costume.api.services.user.UserQueryService delegate;
}
