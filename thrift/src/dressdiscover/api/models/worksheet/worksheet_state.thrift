namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_feature_state.thrift"

struct WorksheetState {
    list<worksheet_feature_state.WorksheetFeatureState> features;
}
