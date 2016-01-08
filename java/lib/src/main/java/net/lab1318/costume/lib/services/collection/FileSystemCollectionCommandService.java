package net.lab1318.costume.lib.services.collection;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.services.object.ObjectCommandService;
import net.lab1318.costume.lib.stores.collection.CollectionFileSystem;

@Singleton
public class FileSystemCollectionCommandService extends StoreCollectionCommandService {
    @Inject
    public FileSystemCollectionCommandService(final ObjectCommandService objectCommandService,
            final CollectionFileSystem store) {
        super(objectCommandService, store);
    }
}
