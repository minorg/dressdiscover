package net.lab1318.costume.lib.services.collection;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.lib.stores.collection.CollectionFileSystem;

@Singleton
public class FileSystemCollectionQueryService extends StoreCollectionQueryService {
    @Inject
    public FileSystemCollectionQueryService(final CollectionFileSystem store) {
        super(store);
    }
}
