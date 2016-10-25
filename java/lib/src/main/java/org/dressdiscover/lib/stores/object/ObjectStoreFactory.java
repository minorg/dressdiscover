package org.dressdiscover.lib.stores.object;

import org.dressdiscover.api.models.configuration.ObjectStoreConfiguration;
import org.dressdiscover.lib.stores.StoreFactory;

public interface ObjectStoreFactory extends StoreFactory {
    public ObjectStore createObjectStore(ObjectStoreConfiguration configuration);
}
