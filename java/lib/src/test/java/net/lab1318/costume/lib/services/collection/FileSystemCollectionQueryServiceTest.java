package net.lab1318.costume.lib.services.collection;

import net.lab1318.costume.api.services.collection.CollectionCommandService;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.lib.CostumeProperties;
import net.lab1318.costume.lib.services.ServicesModule;

public final class FileSystemCollectionQueryServiceTest extends CollectionQueryServiceTest {
    @Override
    protected ServicesModule _newServicesModule(final CostumeProperties properties) {
        return new ServicesModule() {
            @Override
            protected void _configureCollectionCommandService() {
                bind(CollectionCommandService.class).to(FileSystemCollectionCommandService.class);
            }

            @Override
            protected void _configureCollectionQueryService() {
                bind(CollectionQueryService.class).to(FileSystemCollectionQueryService.class);
            }
        };
    }
}
