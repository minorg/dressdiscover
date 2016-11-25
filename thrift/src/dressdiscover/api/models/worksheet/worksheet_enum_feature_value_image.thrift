namespace * dressdiscover.api.models.worksheet

struct WorksheetEnumFeatureValueImage {
    // @validation {"blank": false, "minLength": 1}
    string rights;
    // Thumbnail and full size URLs can be relatives
    // @validation {"blank": false, "minLength": 1}
    string thumbnail_url;
    // @validation {"blank": false, "minLength": 1}
    optional string full_size_url;
}
