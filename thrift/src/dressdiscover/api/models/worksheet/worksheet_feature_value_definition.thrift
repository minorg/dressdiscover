namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_feature_value_description.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_value_id.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_value_image.thrift"
include "thryft/waf/api/models/non_blank_string.thrift"

struct WorksheetFeatureValueDefinition {
	worksheet_feature_value_id.WorksheetFeatureValueId id;

    optional worksheet_feature_value_description.WorksheetFeatureValueDescription description;

    optional non_blank_string.NonBlankString display_name;

    optional worksheet_feature_value_image.WorksheetFeatureValueImage image;
}
