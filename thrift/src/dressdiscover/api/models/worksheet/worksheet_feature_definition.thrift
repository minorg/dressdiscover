namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_feature_type.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_value_definition.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_value_id.thrift"

struct WorksheetFeatureDefinition {
    // @validation {"blank": false, "minLength": 1}
    string display_name;

    worksheet_feature_type.WorksheetFeatureType type;

    // @validation {"minLength": 1}
    optional map<worksheet_feature_value_id.WorksheetFeatureValueId, worksheet_feature_value_definition.WorksheetFeatureValueDefinition> feature_values;
}
