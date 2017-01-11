namespace cs DressDiscover.Api.Models.Worksheet
namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_feature_value_id.thrift"

struct WorksheetFeatureState {
    // @validation {"minLength": 1}
    optional list<worksheet_feature_value_id.WorksheetFeatureValueId> selected_values;

    // @validation {"blank": false, "minLength": 1}
    optional string text;
}
