namespace * dressdiscover.api.models.worksheet.state

include "dressdiscover/api/models/worksheet/state/worksheet_feature_set_state.thrift"
include "dressdiscover/api/models/worksheet/state/worksheet_state_id.thrift"
include "thryft/waf/api/models/non_blank_string.thrift"

// @mutable
struct WorksheetState {
    list<worksheet_feature_set_state.WorksheetFeatureSetState> feature_sets;
    worksheet_state_id.WorksheetStateId id;
    optional non_blank_string.NonBlankString text;
}
