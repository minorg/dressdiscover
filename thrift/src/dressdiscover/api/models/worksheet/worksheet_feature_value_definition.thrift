namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_feature_value_id.thrift"

struct WorksheetFeatureValueDefinition {
	worksheet_feature_value_id.WorksheetFeatureValueId id;

    // @validation {"blank": false, "minLength": 1}
    optional string display_name;
}
