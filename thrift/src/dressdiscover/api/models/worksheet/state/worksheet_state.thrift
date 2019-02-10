namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_feature_set_state.thrift"
include "dressdiscover/api/models/worksheet/worksheet_state_id.thrift"
include "thryft/waf/api/models/non_blank_string.thrift"

struct WorksheetState {
    list<worksheet_feature_set_state.WorksheetFeatureSetState> feature_sets;
    worksheet_state_id.WorksheetStateId id;
    optional non_blank_string.NonBlankString text;
}
