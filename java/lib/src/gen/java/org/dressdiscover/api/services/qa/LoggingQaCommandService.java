package org.dressdiscover.api.services.qa;

@com.google.inject.Singleton
public class LoggingQaCommandService implements org.dressdiscover.api.services.qa.QaCommandService {
    public static class Markers {
        public final static org.slf4j.Marker PUT_ANSWER = org.slf4j.MarkerFactory.getMarker("PUT_ANSWER");

        public final static org.slf4j.Marker QA_COMMAND_SERVICE = org.slf4j.MarkerFactory.getMarker("QA_COMMAND_SERVICE");
        static {
            QA_COMMAND_SERVICE.add(PUT_ANSWER);
        }
    }

    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.api.services.qa.LoggingQaCommandService.delegate");

    @com.google.inject.Inject
    public LoggingQaCommandService(@com.google.inject.name.Named("org.dressdiscover.api.services.qa.LoggingQaCommandService.delegate") final org.dressdiscover.api.services.qa.QaCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    public void putAnswer(final org.dressdiscover.api.models.qa.Answer answer) throws org.dressdiscover.api.services.IoException {
        final StringBuilder __logMessageStringBuilder = new StringBuilder();
        final java.util.List<Object> __logMessageArgs = new java.util.ArrayList<Object>();

        __logMessageStringBuilder.append("put_answer(");
        __logMessageStringBuilder.append("{}");
        __logMessageArgs.add(Messages.PutAnswerRequest.create(answer));
        __logMessageStringBuilder.append(")");

        try {
            delegate.putAnswer(answer);

            logger.info(Markers.PUT_ANSWER, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
        } catch (final org.dressdiscover.api.services.IoException e) {
            __logMessageStringBuilder.append(" -> {}");
            __logMessageArgs.add(e.toString());
            logger.error(Markers.PUT_ANSWER, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        } catch (final RuntimeException e) {
            __logMessageStringBuilder.append(" -> ");
            __logMessageArgs.add(e);
            logger.error(Markers.PUT_ANSWER, __logMessageStringBuilder.toString(), __logMessageArgs.toArray());
            throw e;
        }
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LoggingQaCommandService.class);
    private final org.dressdiscover.api.services.qa.QaCommandService delegate;
}
