package org.dressdiscover.lib.stores;

import org.dressdiscover.lib.properties.StoreProperties;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class ElasticSearchClient extends org.thryft.waf.lib.clients.elasticsearch.ElasticSearchClient {
    @Inject
    public ElasticSearchClient(final StoreProperties properties) {
        super(properties.getElasticSearchHost().getHost(), properties.getElasticSearchHost().getPortOrDefault(9300));
    }
}
