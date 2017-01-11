namespace cs DressDiscover.Api.Models.Worksheet
namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_feature_value_id.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_value_image.thrift"

struct WorksheetFeatureValueDefinition {
	worksheet_feature_value_id.WorksheetFeatureValueId id;

    // @validation {"blank": false, "minLength": 1}
    optional string display_name;

    optional worksheet_feature_value_image.WorksheetFeatureValueImage image;
}
