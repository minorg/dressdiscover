namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_feature_id.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_state.thrift"

struct WorksheetFeatureSetState {
    // @validation {"minLength": 1}
    map<worksheet_feature_id.WorksheetFeatureId, worksheet_feature_state.WorksheetFeatureState> features;
}
