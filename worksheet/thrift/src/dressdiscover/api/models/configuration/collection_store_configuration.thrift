namespace * dressdiscover.api.models.configuration

struct CollectionStoreConfiguration {
    1: string type;
    // @validation {"minLength": 1}
    2: optional map<string, string> parameters;
}
