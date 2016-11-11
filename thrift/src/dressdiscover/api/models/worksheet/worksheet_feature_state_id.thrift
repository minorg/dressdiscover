namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_enum_feature_value_id.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_id.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_set_id.thrift"

struct WorksheetFeatureStateId {
    worksheet_feature_id.WorksheetFeatureId feature_id;

    // @validation {"minLength": 1}
    list<worksheet_feature_set_id.WorksheetFeatureSetId> feature_set_ids;

    optional worksheet_enum_feature_value_id.WorksheetEnumFeatureValueId feature_value_id;
}
