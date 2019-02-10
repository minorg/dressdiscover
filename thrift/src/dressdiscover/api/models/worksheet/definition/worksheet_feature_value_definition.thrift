namespace * dressdiscover.api.models.worksheet.definition

include "dressdiscover/api/models/worksheet/definition/worksheet_description.thrift"
include "dressdiscover/api/models/worksheet/definition/worksheet_feature_value_image.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_value_id.thrift"
include "thryft/waf/api/models/non_blank_string.thrift"

struct WorksheetFeatureValueDefinition {
	worksheet_feature_value_id.WorksheetFeatureValueId id;

    optional worksheet_description.WorksheetDescription description;

    optional non_blank_string.NonBlankString display_name;

    optional worksheet_feature_value_image.WorksheetFeatureValueImage image;
}
