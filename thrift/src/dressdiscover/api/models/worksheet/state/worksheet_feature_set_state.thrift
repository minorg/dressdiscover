namespace * dressdiscover.api.models.worksheet.state

include "dressdiscover/api/models/worksheet/worksheet_feature_set_id.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_state.thrift"

struct WorksheetFeatureSetState {
    list<worksheet_feature_state.WorksheetFeatureState> features;
    worksheet_feature_set_id.WorksheetFeatureSetId id;
}
