namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_enum_feature_value_id.thrift"

struct WorksheetEnumFeatureState {
    // @validation {"minLength": 1}
    list<worksheet_enum_feature_value_id.WorksheetEnumFeatureValueId> selected_values;
}
