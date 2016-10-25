package org.dressdiscover.lib.stores.collection;

import org.dressdiscover.api.models.configuration.CollectionStoreConfiguration;
import org.dressdiscover.lib.stores.StoreFactory;

public interface CollectionStoreFactory extends StoreFactory {
    public CollectionStore createCollectionStore(CollectionStoreConfiguration configuration);
}
