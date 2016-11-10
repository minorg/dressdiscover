namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_feature_definition.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_set_id.thrift"

struct WorksheetFeatureSetDefinition {
    // @validation {"minLength": 1}
    list<worksheet_feature_definition.WorksheetFeatureDefinition> features;
	worksheet_feature_set_id.WorksheetFeatureSetId id;
    // @validation {"blank": false, "minLength": 1}
    optional string display_name;
}
