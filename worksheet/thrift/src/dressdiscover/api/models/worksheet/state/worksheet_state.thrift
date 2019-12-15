namespace * dressdiscover.api.models.worksheet.state

include "dressdiscover/api/models/worksheet/state/worksheet_feature_set_state.thrift"
include "dressdiscover/api/models/worksheet/state/worksheet_state_id.thrift"
include "thryft/native/date_time.thrift"
include "thryft/waf/api/models/non_blank_string.thrift"

// @ts_mutable
struct WorksheetState {
    date_time.DateTime ctime;
    list<worksheet_feature_set_state.WorksheetFeatureSetState> feature_sets;
    worksheet_state_id.WorksheetStateId id;
    date_time.DateTime mtime;
    optional non_blank_string.NonBlankString text;
}
