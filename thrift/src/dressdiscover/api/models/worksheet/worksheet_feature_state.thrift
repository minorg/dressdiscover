namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_feature_value_id.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_value_state.thrift"

struct WorksheetFeatureState {
    // @validation {"minLength": 1}
    map<worksheet_feature_value_id.WorksheetFeatureValueId, worksheet_feature_value_state.WorksheetFeatureValueState> feature_values;
}
