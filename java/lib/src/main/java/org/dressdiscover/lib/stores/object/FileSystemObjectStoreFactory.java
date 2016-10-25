package org.dressdiscover.lib.stores.object;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.File;

import org.dressdiscover.api.models.configuration.ObjectStoreConfiguration;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.lib.properties.GlobalProperties;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class FileSystemObjectStoreFactory implements ObjectStoreFactory {
    @Inject
    public FileSystemObjectStoreFactory(final GlobalProperties globalProperties) {
        this.globalProperties = checkNotNull(globalProperties);
    }

    @Override
    public ObjectStore createObjectStore(final ObjectStoreConfiguration configuration) throws IoException {
        final String dataDirectoryPath = configuration.getParameters().or(ImmutableMap.of()).get("data_directory_path");
        if (dataDirectoryPath == null) {
            throw IoException.create("missing data_directory_path");
        }
        return new FileSystemObjectStore(new File(dataDirectoryPath), globalProperties);
    }

    private final GlobalProperties globalProperties;
}
