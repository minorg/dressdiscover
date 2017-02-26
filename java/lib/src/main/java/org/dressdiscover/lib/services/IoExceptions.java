package org.dressdiscover.lib.services;

import java.io.IOException;

import org.dressdiscover.api.services.IoException;
import org.elasticsearch.ElasticsearchException;
import org.thryft.protocol.OutputProtocolException;
import org.thryft.waf.lib.ExceptionUtils;
import org.xml.sax.SAXException;

import com.mongodb.MongoException;

public final class IoExceptions {
    public static IoException wrap(final ElasticsearchException cause, final String message) {
        return (IoException) IoException.builder().setCauseMessage(ExceptionUtils.combineMessages(cause, message))
                .build().initCause(cause);
    }

    public static IoException wrap(final IOException cause, final String message) {
        return (IoException) IoException.builder().setCauseMessage(ExceptionUtils.combineMessages(cause, message))
                .build().initCause(cause);
    }

    public static IoException wrap(final MongoException cause, final String message) {
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
