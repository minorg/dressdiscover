namespace * dressdiscover.api.models.configuration

include "dressdiscover/api/models/configuration/object_store_configuration.thrift"

struct CollectionConfiguration {
    1: object_store_configuration.ObjectStoreConfiguration object_store_configuration;
}
