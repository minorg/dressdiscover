namespace * dressdiscover.api.models.configuration

// @java_implements org.thryft.waf.api.models.Model
struct CollectionConfiguration {
    1: string store_type;
    // @validation {"minLength": 1}
    2: optional map<string, string> store_parameters;
}
