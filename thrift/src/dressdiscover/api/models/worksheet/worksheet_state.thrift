namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_feature_set_id.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_set_state.thrift"

struct WorksheetState {
    // @validation {"minLength": 1}
    optional map<worksheet_feature_set_id.WorksheetFeatureSetId, worksheet_feature_set_state.WorksheetFeatureSetState> root_feature_sets;
}
