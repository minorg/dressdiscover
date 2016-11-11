namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_enum_feature_state.thrift"
include "dressdiscover/api/models/worksheet/worksheet_text_feature_state.thrift"

struct WorksheetFeatureState {
    optional worksheet_enum_feature_state.WorksheetEnumFeatureState enum_;
    optional worksheet_text_feature_state.WorksheetTextFeatureState text;
}
