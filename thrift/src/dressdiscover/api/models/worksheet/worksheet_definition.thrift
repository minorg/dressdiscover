namespace cs DressDiscover.Api.Models.Worksheet
namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_feature_definition.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_set_definition.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_value_definition.thrift"

struct WorksheetDefinition {
    // @validation {"minLength": 1}
    list<worksheet_feature_set_definition.WorksheetFeatureSetDefinition> feature_sets;

    // @validation {"minLength": 1}
    list<worksheet_feature_value_definition.WorksheetFeatureValueDefinition> feature_values;

    // @validation {"minLength": 1}
    list<worksheet_feature_definition.WorksheetFeatureDefinition> features;
}
