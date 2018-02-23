namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_extent_definition.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_definition.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_set_definition.thrift"

struct WorksheetDefinition {
    list<worksheet_extent_definition.WorksheetExtentDefinition> extents;

    list<worksheet_feature_set_definition.WorksheetFeatureSetDefinition> feature_sets;

    list<worksheet_feature_definition.WorksheetFeatureDefinition> features;
}
