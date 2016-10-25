package org.dressdiscover.lib.services.configuration;

import static com.google.common.base.Preconditions.checkNotNull;

import javax.annotation.Nullable;

import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.configuration.CollectionConfiguration;
import org.dressdiscover.api.models.configuration.CollectionStoreConfiguration;
import org.dressdiscover.api.models.configuration.InstitutionConfiguration;
import org.dressdiscover.api.models.configuration.ObjectStoreConfiguration;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.configuration.ConfigurationQueryService;
import org.dressdiscover.lib.properties.StoreProperties;
import org.dressdiscover.lib.stores.configuration.MemConfigurationStore;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class StoreConfigurationQueryService implements ConfigurationQueryService {
    @Inject
    public StoreConfigurationQueryService(final MemConfigurationStore store, final StoreProperties storeProperties) {
        defaultCollectionConfiguration = CollectionConfiguration.builder()
                .setObjectStoreConfiguration(ObjectStoreConfiguration.builder()
                        .setParameters(ImmutableMap.of("data_directory_path", storeProperties.getDataDirectoryPath()))
                        .setType("file").build())
                .build();
        defaultInstitutionConfiguration = InstitutionConfiguration.builder()
                .setCollectionStoreConfiguration(CollectionStoreConfiguration.builder()
                        .setParameters(ImmutableMap.of("data_directory_path", storeProperties.getDataDirectoryPath()))
                        .setType("file").build())
                .setDefaultCollectionConfiguration(defaultCollectionConfiguration).build();
        this.store = checkNotNull(store);
    }

    @Override
    public CollectionConfiguration getCollectionConfiguration(final CollectionId collectionId) throws IoException {
        {
            @Nullable
            final CollectionConfiguration collectionConfiguration = store.getCollectionConfigurationMap()
                    .get(collectionId);
            if (collectionConfiguration != null) {
                return collectionConfiguration;
            }
        }

        {
            @Nullable
            final InstitutionConfiguration institutionConfiguration = store.getInstitutionConfigurationMap()
                    .get(collectionId.getInstitutionId());
            if (institutionConfiguration != null) {
                if (institutionConfiguration.getDefaultCollectionConfiguration().isPresent()) {
                    return institutionConfiguration.getDefaultCollectionConfiguration().get();
                }
            }
        }

        return defaultCollectionConfiguration;
    }

    @Override
    public InstitutionConfiguration getInstitutionConfiguration(final InstitutionId institutionId) throws IoException {
        {
            @Nullable
            final InstitutionConfiguration institutionConfiguration = store.getInstitutionConfigurationMap()
                    .get(institutionId);
            if (institutionConfiguration != null) {
                return institutionConfiguration;
            }
        }

        return defaultInstitutionConfiguration;
    }

    private final InstitutionConfiguration defaultInstitutionConfiguration;

    private final CollectionConfiguration defaultCollectionConfiguration;

    private final MemConfigurationStore store;
}
