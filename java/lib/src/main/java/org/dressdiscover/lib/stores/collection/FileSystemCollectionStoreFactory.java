package org.dressdiscover.lib.stores.collection;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.File;

import org.dressdiscover.api.models.configuration.CollectionStoreConfiguration;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.lib.properties.GlobalProperties;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class FileSystemCollectionStoreFactory implements CollectionStoreFactory {
    @Inject
    public FileSystemCollectionStoreFactory(final GlobalProperties globalProperties) {
        this.globalProperties = checkNotNull(globalProperties);
    }

    @Override
    public CollectionStore createCollectionStore(final CollectionStoreConfiguration configuration) throws IoException {
        final String dataDirectoryPath = configuration.getParameters().or(ImmutableMap.of()).get("data_directory_path");
        if (dataDirectoryPath == null) {
            throw IoException.create("missing data_directory_path");
        }
        return new FileSystemCollectionStore(new File(dataDirectoryPath), globalProperties);
    }

    private final GlobalProperties globalProperties;
}
