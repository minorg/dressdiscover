namespace * dressdiscover.api.models.worksheet.state

include "dressdiscover/api/models/worksheet/state/worksheet_state_id.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_id.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_set_id.thrift"
include "thryft/waf/api/models/true_bool.thrift"

struct WorksheetStateMark {
    worksheet_state_id.WorksheetStateId worksheet_state_id;
    optional worksheet_feature_id.WorksheetFeatureId feature_id;
    optional worksheet_feature_set_id.WorksheetFeatureSetId feature_set_id;
    optional true_bool.TrueBool review;
}
