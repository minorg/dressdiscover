package org.dressdiscover.lib.stores.object;

import org.dressdiscover.lib.CostumeProperties;
import org.dressdiscover.lib.stores.StoreFactory;
import org.thryft.native_.Uri;

import com.google.common.collect.ImmutableMap;

public interface ObjectStoreFactory extends StoreFactory {
    public ObjectStore createObjectStore(ImmutableMap<String, String> parameters, CostumeProperties properties,
            final Uri uri);
}
