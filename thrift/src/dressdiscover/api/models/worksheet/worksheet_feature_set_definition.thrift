namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_feature_id.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_set_id.thrift"

struct WorksheetFeatureSetDefinition {
	worksheet_feature_set_id.WorksheetFeatureSetId id;
    // @validation {"blank": false, "minLength": 1}
    optional string display_name;
    // @validation {"minLength": 1}
    optional list<worksheet_feature_id.WorksheetFeatureId> feature_ids;
}
