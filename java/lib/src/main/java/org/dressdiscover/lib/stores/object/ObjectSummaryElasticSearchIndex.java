package org.dressdiscover.lib.stores.object;

import java.io.IOException;

import org.dressdiscover.api.models.object.ObjectId;
import org.dressdiscover.api.models.object.ObjectSummary;
import org.dressdiscover.api.models.object.ObjectSummaryEntry;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.object.NoSuchObjectException;
import org.dressdiscover.lib.properties.GlobalProperties;
import org.dressdiscover.lib.properties.StoreProperties;
import org.dressdiscover.lib.services.IoExceptions;
import org.elasticsearch.ElasticsearchException;
import org.thryft.protocol.OutputProtocolException;
import org.thryft.waf.lib.clients.ElasticSearchClient;
import org.thryft.waf.lib.stores.ElasticSearchIndex;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class ObjectSummaryElasticSearchIndex
        extends ElasticSearchIndex<IoException, ObjectSummary, ObjectSummaryEntry, ObjectId, NoSuchObjectException> {
    @Inject
    public ObjectSummaryElasticSearchIndex(final GlobalProperties globalProperties,
            final StoreProperties storeProperties) {
        super(new ElasticSearchClient(storeProperties.getElasticSearchHost(), storeProperties.getElasticSearchPort()),
                DOCUMENT_TYPE, new ExceptionFactory<IoException, ObjectId, NoSuchObjectException>() {
                    @Override
                    public IoException newIoException(final ElasticsearchException cause, final String message) {
                        return IoExceptions.wrap(cause, message);
                    }

                    @Override
                    public IoException newIoException(final IOException cause, final String message) {
                        return IoExceptions.wrap(cause, message);
                    }

                    @Override
                    public IoException newIoException(final OutputProtocolException cause, final String message) {
                        return IoExceptions.wrap(cause, message);
                    }

                    @Override
                    public IoException newIoException(final String message) {
                        return IoException.create(message);
                    }

                    @Override
                    public NoSuchObjectException newNoSuchModelException(final ObjectId id) {
                        return new NoSuchObjectException();
                    }
                }, INDEX_NAME_PREFIX + '_' + globalProperties.getEnvironment());
    }

    public final static String DOCUMENT_TYPE = "object_summary";
    public final static String INDEX_NAME_PREFIX = "object_summary";
}
