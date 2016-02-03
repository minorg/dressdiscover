package net.lab1318.costume.lib.services;

import java.io.IOException;

import org.elasticsearch.ElasticsearchException;
import org.thryft.protocol.OutputProtocolException;
import org.thryft.waf.lib.ExceptionUtils;
import org.xml.sax.SAXException;

import net.lab1318.costume.api.services.IoException;

public final class IoExceptions {
    public static IoException wrap(final ElasticsearchException cause, final String message) {
        return (IoException) IoException.builder().setCauseMessage(ExceptionUtils.combineMessages(cause, message))
                .build().initCause(cause);
    }

    public static IoException wrap(final IOException cause, final String message) {
        return (IoException) IoException.builder().setCauseMessage(ExceptionUtils.combineMessages(cause, message))
                .build().initCause(cause);
    }

    public static IoException wrap(final OutputProtocolException cause, final String message) {
        return (IoException) IoException.builder().setCauseMessage(ExceptionUtils.combineMessages(cause, message))
                .build().initCause(cause);
    }

    public static IoException wrap(final SAXException cause, final String message) {
        return (IoException) IoException.builder().setCauseMessage(ExceptionUtils.combineMessages(cause, message))
                .build().initCause(cause);
    }

    private IoExceptions() {
    }
}
