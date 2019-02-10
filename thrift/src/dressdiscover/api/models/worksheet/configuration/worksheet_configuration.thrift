namespace * dressdiscover.api.models.worksheet.configuration

struct WorksheetConfiguration {
    // @validation {"minLength": 1}
    list<worksheet_feature_set_definition.WorksheetFeatureSetDefinition> feature_sets;

    // @validation {"minLength": 1}
    list<worksheet_feature_value_definition.WorksheetFeatureValueDefinition> feature_values;

    // @validation {"minLength": 1}
    list<worksheet_feature_definition.WorksheetFeatureDefinition> features;
}
