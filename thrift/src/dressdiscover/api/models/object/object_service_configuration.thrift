namespace * dressdiscover.api.models.object

struct ObjectServiceConfiguration {
    // @validation {"blank": false, "minLength": 1}
    1: string type;
    // @validation {"minLength": 1}
    2: optional map<string, string> parameters;
}
