namespace * dressdiscover.api.models.worksheet

struct WorksheetFeatureValueState {
    // @validation {"acceptance": true}
    optional bool selected;

    // @validation {"blank": false, "minLength": 1}
    optional string text;
}
