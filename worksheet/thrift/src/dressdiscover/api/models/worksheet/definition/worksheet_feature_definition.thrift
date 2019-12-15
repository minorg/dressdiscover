namespace * dressdiscover.api.models.worksheet.definition

include "dressdiscover/api/models/worksheet/definition/worksheet_description.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_id.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_value_id.thrift"
include "thryft/waf/api/models/non_blank_string.thrift"

struct WorksheetFeatureDefinition {
    non_blank_string.NonBlankString display_name_en;

	worksheet_feature_id.WorksheetFeatureId id;

    // @validation {"minLength": 1}
    list<worksheet_feature_value_id.WorksheetFeatureValueId> value_ids;

    optional worksheet_description.WorksheetDescription description;
}
