package org.dressdiscover.lib.stores.object;

import org.dressdiscover.api.models.object.ObjectId;
import org.dressdiscover.api.models.object.ObjectSummary;
import org.dressdiscover.api.models.object.ObjectSummaryEntry;
import org.dressdiscover.api.services.object.NoSuchObjectException;
import org.dressdiscover.lib.properties.GlobalProperties;
import org.dressdiscover.lib.stores.ElasticSearchClient;
import org.dressdiscover.lib.stores.ElasticSearchIndex;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class ObjectSummaryElasticSearchIndex
        extends ElasticSearchIndex<ObjectSummary, ObjectSummaryEntry, ObjectId, NoSuchObjectException> {
    @Inject
    public ObjectSummaryElasticSearchIndex(final ElasticSearchClient client, final GlobalProperties properties) {
        super(client, DOCUMENT_TYPE, new AbstractExceptionFactory<ObjectId, NoSuchObjectException>() {
            @Override
            public NoSuchObjectException newNoSuchModelException(final ObjectId id) {
                return NoSuchObjectException.create(id);
            }
        }, INDEX_NAME_PREFIX + '_' + properties.getEnvironment().name().toLowerCase());
    }

    public final static String DOCUMENT_TYPE = "object_summary";
    public final static String INDEX_NAME_PREFIX = "object_summary";
}
