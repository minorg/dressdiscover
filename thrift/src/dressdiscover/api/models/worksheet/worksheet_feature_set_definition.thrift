namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_extent_id_set.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_id.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_set_id.thrift"
include "thryft/waf/api/models/non_blank_string.thrift"

struct WorksheetFeatureSetDefinition {
    // @validation {"minLength": 1}
    list<worksheet_feature_id.WorksheetFeatureId> feature_ids;

	worksheet_feature_set_id.WorksheetFeatureSetId id;

    optional non_blank_string.NonBlankString display_name;

    optional worksheet_extent_id_set.WorksheetExtentIdSet extent_ids;
}
