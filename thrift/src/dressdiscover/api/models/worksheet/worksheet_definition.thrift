namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_feature_set_definition.thrift"

struct WorksheetDefinition {
    list<worksheet_feature_set_definition.WorksheetFeatureSetDefinition> root_feature_sets;
}
