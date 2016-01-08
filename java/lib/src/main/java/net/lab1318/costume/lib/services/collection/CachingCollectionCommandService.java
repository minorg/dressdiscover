package net.lab1318.costume.lib.services.collection;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.services.object.ObjectCommandService;
import net.lab1318.costume.lib.stores.collection.CollectionCache;

@Singleton
public class CachingCollectionCommandService extends StoreCollectionCommandService {
    @Inject
    public CachingCollectionCommandService(final ObjectCommandService objectCommandService,
            final CollectionCache store) {
        super(objectCommandService, store);
    }
}
