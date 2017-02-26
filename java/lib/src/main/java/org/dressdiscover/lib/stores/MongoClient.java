package org.dressdiscover.lib.stores;

import org.dressdiscover.lib.properties.StoreProperties;

import com.google.common.collect.ImmutableList;
import com.google.common.net.HostAndPort;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class MongoClient extends org.thryft.waf.lib.clients.mongodb.MongoClient {
    public MongoClient(final ImmutableList<HostAndPort> seeds) {
        super(seeds);
    }

    @Inject
    public MongoClient(final StoreProperties properties) {
        this(properties.getMongoHosts());
    }
}
