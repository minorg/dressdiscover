namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_enum_feature_value_id.thrift"
include "dressdiscover/api/models/worksheet/worksheet_enum_feature_value_image.thrift"

struct WorksheetEnumFeatureValueDefinition {
	worksheet_enum_feature_value_id.WorksheetEnumFeatureValueId id;

    // @validation {"blank": false, "minLength": 1}
    optional string display_name;

    optional worksheet_enum_feature_value_image.WorksheetEnumFeatureValueImage image;
}
