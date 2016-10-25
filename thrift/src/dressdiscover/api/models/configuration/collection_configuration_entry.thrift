namespace * dressdiscover.api.models.configuration

include "dressdiscover/api/models/collection/collection_id.thrift"
include "dressdiscover/api/models/configuration/collection_configuration.thrift"

// @java_implements org.thryft.waf.api.models.ModelEntry<org.dressdiscover.api.models.configuration.CollectionConfiguration, org.dressdiscover.api.models.collection.CollectionId>
struct CollectionConfigurationEntry {
    collection_id.CollectionId id;
    collection_configuration.CollectionConfiguration model;
}
