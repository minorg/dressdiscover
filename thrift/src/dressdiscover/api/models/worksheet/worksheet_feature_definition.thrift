namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_extent_id_set.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_id.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_value_id.thrift"
include "thryft/waf/api/models/non_blank_string.thrift"

struct WorksheetFeatureDefinition {
	worksheet_feature_id.WorksheetFeatureId id;

    optional non_blank_string.NonBlankString display_name;

    optional worksheet_extent_id_set.WorksheetExtentIdSet extent_ids;

    // @validation {"minLength": 1}
    optional list<worksheet_feature_value_id.WorksheetFeatureValueId> value_ids;
}
