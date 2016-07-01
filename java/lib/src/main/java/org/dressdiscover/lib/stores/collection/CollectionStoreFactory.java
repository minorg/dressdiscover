package org.dressdiscover.lib.stores.collection;

import org.dressdiscover.lib.CostumeProperties;
import org.dressdiscover.lib.stores.StoreFactory;
import org.thryft.native_.Uri;

import com.google.common.collect.ImmutableMap;

public interface CollectionStoreFactory extends StoreFactory {
    public CollectionStore createCollectionStore(ImmutableMap<String, String> parameters, CostumeProperties properties,
            final Uri uri);
}
