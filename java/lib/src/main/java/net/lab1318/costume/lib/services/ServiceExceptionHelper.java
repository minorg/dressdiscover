package net.lab1318.costume.lib.services;

import java.io.IOException;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.elasticsearch.ElasticsearchException;
import org.thryft.protocol.OutputProtocolException;
import org.xml.sax.SAXException;

import net.lab1318.costume.api.services.IoException;

public final class ServiceExceptionHelper {
    public static String combineMessages(final Exception cause, final String message) {
        final String causeMessage = ExceptionUtils.getRootCauseMessage(cause);
        if (causeMessage != null && !causeMessage.equals(message)) {
            return causeMessage + ": " + message;
        } else {
            return message;
        }
    }

    public static IoException wrapException(final ElasticsearchException cause, final String message) {
        return (IoException) IoException.builder().setCauseMessage(combineMessages(cause, message)).build()
                .initCause(cause);
    }

    public static IoException wrapException(final IOException cause, final String message) {
        return (IoException) IoException.builder().setCauseMessage(combineMessages(cause, message)).build()
                .initCause(cause);
    }

    public static IoException wrapException(final OutputProtocolException cause, final String message) {
        return (IoException) IoException.builder().setCauseMessage(combineMessages(cause, message)).build()
                .initCause(cause);
    }

    public static IoException wrapException(final SAXException cause, final String message) {
        return (IoException) IoException.builder().setCauseMessage(combineMessages(cause, message)).build()
                .initCause(cause);
    }

    private ServiceExceptionHelper() {
    }
}
