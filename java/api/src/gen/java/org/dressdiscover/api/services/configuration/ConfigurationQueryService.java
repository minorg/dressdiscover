package org.dressdiscover.api.services.configuration;

public interface ConfigurationQueryService {
    public enum FunctionMetadata {
        GET_COLLECTION_CONFIGURATION("get_collection_configuration"),
        GET_INSTITUTION_CONFIGURATION("get_institution_configuration");

        public String getThriftName() {
            return thriftName;
        }

        private FunctionMetadata(final String thriftName) {
            this.thriftName = thriftName;
        }

        private final String thriftName;
    }

    public org.dressdiscover.api.models.configuration.CollectionConfiguration getCollectionConfiguration(final org.dressdiscover.api.models.collection.CollectionId collectionId) throws org.dressdiscover.api.services.IoException;

    public org.dressdiscover.api.models.configuration.InstitutionConfiguration getInstitutionConfiguration(final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws org.dressdiscover.api.services.IoException;
}
