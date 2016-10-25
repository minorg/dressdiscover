namespace * dressdiscover.api.models.configuration

include "dressdiscover/api/models/configuration/collection_configuration.thrift"
include "dressdiscover/api/models/configuration/collection_store_configuration.thrift"

struct InstitutionConfiguration {
    1: collection_store_configuration.CollectionStoreConfiguration collection_store_configuration;
    2: optional collection_configuration.CollectionConfiguration default_collection_configuration;
}
