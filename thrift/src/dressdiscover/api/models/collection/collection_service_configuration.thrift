namespace * dressdiscover.api.models.collection

struct CollectionServiceConfiguration {
    // @validation {"blank": false, "minLength": 1}
    1: string type;
    // @validation {"minLength": 1}
    2: optional map<string, string> parameters;
}
