namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_feature_definition.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_id.thrift"

struct WorksheetFeatureSetDefinition {
    // @validation {"blank": false, "minLength": 1}
    string display_name;
    // @validation {"minLength": 1}
    map<worksheet_feature_id.WorksheetFeatureId, worksheet_feature_definition.WorksheetFeatureDefinition> features;
}
