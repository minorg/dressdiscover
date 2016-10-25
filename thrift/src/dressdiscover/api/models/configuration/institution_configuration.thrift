namespace * dressdiscover.api.models.configuration

include "dressdiscover/api/models/configuration/collection_configuration.thrift"

// @java_implements org.thryft.waf.api.models.Model
struct InstitutionConfiguration {
    1: string store_type;
    2: optional collection_configuration.CollectionConfiguration default_collection_configuration;
    // @validation {"minLength": 1}
    3: optional map<string, string> store_parameters;
}
