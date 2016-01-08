package net.lab1318.costume.lib.services.collection;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.lib.stores.collection.CollectionCache;

@Singleton
public class CachingCollectionQueryService extends StoreCollectionQueryService {
    @Inject
    public CachingCollectionQueryService(final CollectionCache store) {
        super(store);
    }
}
