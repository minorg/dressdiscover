package org.dressdiscover.lib.stores.object;

import org.dressdiscover.lib.DressDiscoverProperties;
import org.dressdiscover.lib.stores.StoreFactory;
import org.thryft.native_.Uri;

import com.google.common.collect.ImmutableMap;

public interface ObjectStoreFactory extends StoreFactory {
    public ObjectStore createObjectStore(ImmutableMap<String, String> parameters, DressDiscoverProperties properties,
            final Uri uri);
}
