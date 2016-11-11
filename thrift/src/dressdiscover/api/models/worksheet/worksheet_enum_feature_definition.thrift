namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_enum_feature_value_definition.thrift"

struct WorksheetEnumFeatureDefinition {
    // @validation {"minLength": 1}
    optional list<worksheet_enum_feature_value_definition.WorksheetEnumFeatureValueDefinition> values_;
}
