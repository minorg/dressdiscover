namespace cs DressDiscover.Api.Models.Worksheet
namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_feature_id.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_value_definition.thrift"

struct WorksheetFeatureDefinition {
	worksheet_feature_id.WorksheetFeatureId id;

    // @validation {"blank": false, "minLength": 1}
    optional string display_name;

    // @validation {"minLength": 1}
    optional list<worksheet_feature_value_definition.WorksheetFeatureValueDefinition> values_;
}
