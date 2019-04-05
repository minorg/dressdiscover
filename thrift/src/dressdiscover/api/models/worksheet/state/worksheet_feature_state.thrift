namespace * dressdiscover.api.models.worksheet.state

include "dressdiscover/api/models/worksheet/worksheet_feature_id.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_value_id.thrift"

// @ts_mutable
struct WorksheetFeatureState {
    worksheet_feature_id.WorksheetFeatureId id;

    // @validation {"minLength": 1}
    optional list<worksheet_feature_value_id.WorksheetFeatureValueId> selected_value_ids;

    // @validation {"blank": false, "minLength": 1}
    optional string text;
}