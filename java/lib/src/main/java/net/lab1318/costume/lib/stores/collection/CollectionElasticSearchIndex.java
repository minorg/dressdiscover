package net.lab1318.costume.lib.stores.collection;

import org.notaweb.lib.clients.ElasticSearchClient;
import org.notaweb.lib.stores.ElasticSearchIndex;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.collection.CollectionId;

@Singleton
public class CollectionElasticSearchIndex extends ElasticSearchIndex<Collection, CollectionEntry, CollectionId> {
    @Inject
    public CollectionElasticSearchIndex(final ElasticSearchClient client,
            @Named("environment") final String environment) {
        super(client, DOCUMENT_TYPE, INDEX_NAME_PREFIX + '_' + environment);
    }

    public final static String DOCUMENT_TYPE = "collection";
    public final static String INDEX_NAME_PREFIX = "collection";
}
