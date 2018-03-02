namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_feature_set_id.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_set_state.thrift"
include "dressdiscover/api/models/worksheet/worksheet_state_id.thrift"

struct WorksheetState {
    worksheet_state_id.WorksheetStateId id;
    optional map<worksheet_feature_set_id.WorksheetFeatureSetId, worksheet_feature_set_state.WorksheetFeatureSetState> feature_sets;
}
