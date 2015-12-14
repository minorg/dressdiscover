package net.lab1318.costume.lib.stores.object;

import org.notaweb.lib.clients.ElasticSearchClient;
import org.notaweb.lib.stores.ElasticSearchIndex;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

import net.lab1318.costume.api.models.object.Object;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.models.object.ObjectId;

@Singleton
public class ObjectSummaryElasticSearchIndex extends ElasticSearchIndex<Object, ObjectEntry, ObjectId> {
    @Inject
    public ObjectSummaryElasticSearchIndex(final ElasticSearchClient client,
            @Named("environment") final String environment) {
        super(client, DOCUMENT_TYPE, INDEX_NAME_PREFIX + '_' + environment);
    }

    public final static String DOCUMENT_TYPE = "object_summary";
    public final static String INDEX_NAME_PREFIX = "object_summary";
}
