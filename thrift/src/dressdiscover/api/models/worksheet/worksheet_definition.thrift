namespace cs DressDiscover.Api.Models.Worksheet
namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_feature_set_definition.thrift"

struct WorksheetDefinition {
    list<worksheet_feature_set_definition.WorksheetFeatureSetDefinition> feature_sets;
}
