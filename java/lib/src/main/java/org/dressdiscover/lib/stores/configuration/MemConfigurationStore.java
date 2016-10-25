package org.dressdiscover.lib.stores.configuration;

import java.util.HashMap;
import java.util.Map;

import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.configuration.CollectionConfiguration;
import org.dressdiscover.api.models.configuration.InstitutionConfiguration;
import org.dressdiscover.api.models.institution.InstitutionId;

import com.google.inject.Singleton;

@Singleton
public class MemConfigurationStore {
    public final Map<CollectionId, CollectionConfiguration> getCollectionConfigurationMap() {
        return collectionConfigurationMap;
    }

    public final Map<InstitutionId, InstitutionConfiguration> getInstitutionConfigurationMap() {
        return institutionConfigurationMap;
    }

    private final Map<CollectionId, CollectionConfiguration> collectionConfigurationMap = new HashMap<>();
    private final Map<InstitutionId, InstitutionConfiguration> institutionConfigurationMap = new HashMap<>();
}
