package net.lab1318.costume.lib.services.collection;

import net.lab1318.costume.api.services.collection.CollectionCommandService;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.lib.services.ServicesModule;

public final class CachingCollectionQueryServiceTest extends CollectionQueryServiceTest {
    @Override
    protected ServicesModule _newServicesModule() {
        return new ServicesModule() {
            @Override
            protected void _configureCollectionCommandService() {
                bind(CollectionCommandService.class).to(CachingCollectionCommandService.class);
            }

            @Override
            protected void _configureCollectionQueryService() {
                bind(CollectionQueryService.class).to(CachingCollectionQueryService.class);
            }
        };
    }
}
