package net.lab1318.costume.lib.services.object;

@com.google.inject.Singleton
public class LoggingObjectCommandService implements net.lab1318.costume.api.services.object.ObjectCommandService {
    public static class Markers {
        public final static org.slf4j.Marker DELETE_OBJECTS = org.slf4j.MarkerFactory.getMarker("DELETE_OBJECTS");
        public final static org.slf4j.Marker POST_OBJECT = org.slf4j.MarkerFactory.getMarker("POST_OBJECT");

        public final static org.slf4j.Marker OBJECT_COMMAND_SERVICE = org.slf4j.MarkerFactory.getMarker("OBJECT_COMMAND_SERVICE");
        static {
            OBJECT_COMMAND_SERVICE.add(DELETE_OBJECTS);
            OBJECT_COMMAND_SERVICE.add(POST_OBJECT);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("net.lab1318.costume.lib.services.object.LoggingObjectCommandService.delegate");

    @com.google.inject.Inject
    public LoggingObjectCommandService(@com.google.inject.name.Named("net.lab1318.costume.lib.services.object.LoggingObjectCommandService.delegate") final net.lab1318.costume.api.services.object.ObjectCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    public void deleteObjects() throws net.lab1318.costume.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("delete_objects(");
        __logMessageStringBuilder.append(")");

        try {
            delegate.deleteObjects();

            logger.debug(Markers.DELETE_OBJECTS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.DELETE_OBJECTS, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    public net.lab1318.costume.api.models.object.ObjectId postObject(final net.lab1318.costume.api.models.object.Object object) throws net.lab1318.costume.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("post_object(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(new Messages.PostObjectRequest(object));
        __logMessageStringBuilder.append(")");

        try {
            net.lab1318.costume.api.models.object.ObjectId __returnValue = delegate.postObject(object);

            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(__returnValue);

            logger.debug(Markers.POST_OBJECT, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());

            return __returnValue;
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.POST_OBJECT, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingObjectCommandService.class);
    private final net.lab1318.costume.api.services.object.ObjectCommandService delegate;
}
