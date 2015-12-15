package net.lab1318.costume.lib.stores.object;

import org.thryft.waf.lib.clients.ElasticSearchClient;
import org.thryft.waf.lib.stores.ElasticSearchIndex;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

import net.lab1318.costume.api.models.object.Object;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.models.object.ObjectId;

@Singleton
public class ObjectElasticSearchIndex extends ElasticSearchIndex<Object, ObjectEntry, ObjectId> {
    @Inject
    public ObjectElasticSearchIndex(final ElasticSearchClient client, @Named("environment") final String environment) {
        super(client, DOCUMENT_TYPE, INDEX_NAME_PREFIX + '_' + environment);
    }

    public final static String DOCUMENT_TYPE = "object";
    public final static String INDEX_NAME_PREFIX = "object_detail";
}
