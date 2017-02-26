package org.dressdiscover.lib.stores;

import java.io.IOException;

import org.dressdiscover.api.services.IoException;
import org.dressdiscover.lib.services.IoExceptions;
import org.elasticsearch.ElasticsearchException;
import org.thryft.protocol.OutputProtocolException;
import org.thryft.waf.api.models.Model;
import org.thryft.waf.api.models.ModelEntry;
import org.thryft.waf.api.models.ModelId;
import org.thryft.waf.api.services.NoSuchModelException;

public class ElasticSearchIndex<ModelT extends Model, ModelEntryT extends ModelEntry<ModelT, ModelIdT>, ModelIdT extends ModelId, NoSuchModelExceptionT extends NoSuchModelException>
        extends
        org.thryft.waf.lib.stores.elasticsearch.ElasticSearchIndex<IoException, ModelT, ModelEntryT, ModelIdT, NoSuchModelExceptionT> {
    public abstract static class AbstractExceptionFactory<ModelIdT extends ModelId, NoSuchModelExceptionT extends Exception>
            implements ExceptionFactory<IoException, ModelIdT, NoSuchModelExceptionT> {
        @Override
        public final IoException newIoException(final ElasticsearchException cause, final String message) {
            return IoExceptions.wrap(cause, message);
        }

        @Override
        public final IoException newIoException(final IOException cause, final String message) {
            return IoExceptions.wrap(cause, message);
        }

        @Override
        public final IoException newIoException(final OutputProtocolException cause, final String message) {
            return IoExceptions.wrap(cause, message);
        }

        @Override
        public final IoException newIoException(final String message) {
            return IoException.create(message);
        }
    }

    public ElasticSearchIndex(final ElasticSearchClient client, final String documentType,
            final ExceptionFactory<IoException, ModelIdT, NoSuchModelExceptionT> exceptionFactory,
            final String indexName) {
        super(client, documentType, exceptionFactory, indexName);
    }
}
