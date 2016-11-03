namespace * dressdiscover.api.models.wizard

struct WizardFeatureValueState {
    // @validation {"acceptance": true}
    optional bool selected;

    // @validation {"blank": false, "minLength": 1}
    optional string text;
}
