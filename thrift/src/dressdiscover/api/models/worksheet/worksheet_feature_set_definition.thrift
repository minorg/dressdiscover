namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_feature_definition.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_set_id.thrift"

struct WorksheetFeatureSetDefinition {
	worksheet_feature_set_id.WorksheetFeatureSetId id;
    // @validation {"minLength": 1}
    optional list<worksheet_feature_set_definition.WorksheetFeatureSetDefinition> child_feature_sets;
    // @validation {"blank": false, "minLength": 1}
    optional string display_name;
    // @validation {"minLength": 1}
    optional list<worksheet_feature_definition.WorksheetFeatureDefinition> features;
}
