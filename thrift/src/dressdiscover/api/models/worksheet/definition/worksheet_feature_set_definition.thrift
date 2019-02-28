namespace * dressdiscover.api.models.worksheet.definition

include "dressdiscover/api/models/worksheet/definition/worksheet_description.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_id.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_set_id.thrift"
include "thryft/waf/api/models/non_blank_string.thrift"

struct WorksheetFeatureSetDefinition {
    non_blank_string.NonBlankString display_name_en;

    // @validation {"minLength": 1}
    list<worksheet_feature_id.WorksheetFeatureId> feature_ids;

	worksheet_feature_set_id.WorksheetFeatureSetId id;

    optional worksheet_description.WorksheetDescription description;
}
