namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_feature_state_id.thrift"

struct WorksheetFeatureState {
    worksheet_feature_state_id.WorksheetFeatureStateId id;

    // @validation {"acceptance": true}
    optional bool selected;

    // @validation {"blank": false, "minLength": 1}
    optional string text;
}
