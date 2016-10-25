package org.dressdiscover.lib.services.configuration;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.configuration.CollectionConfiguration;
import org.dressdiscover.api.models.configuration.InstitutionConfiguration;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.configuration.ConfigurationCommandService;
import org.dressdiscover.lib.stores.configuration.MemConfigurationStore;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class StoreConfigurationCommandService implements ConfigurationCommandService {
    @Inject
    public StoreConfigurationCommandService(final MemConfigurationStore store) {
        this.store = checkNotNull(store);
    }

    @Override
    public void putCollectionConfiguration(final CollectionId collectionId,
            final CollectionConfiguration collectionConfiguration) throws IoException {
        store.getCollectionConfigurationMap().put(collectionId, collectionConfiguration);
    }

    @Override
    public void putInstitutionConfiguration(final InstitutionId institutionId,
            final InstitutionConfiguration institutionConfiguration) throws IoException {
        store.getInstitutionConfigurationMap().put(institutionId, institutionConfiguration);
    }

    private final MemConfigurationStore store;
}