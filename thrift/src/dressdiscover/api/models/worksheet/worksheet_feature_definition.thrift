namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_enum_feature_definition.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_id.thrift"
include "dressdiscover/api/models/worksheet/worksheet_text_feature_definition.thrift"

struct WorksheetFeatureDefinition {
	worksheet_feature_id.WorksheetFeatureId id;

    // @validation {"blank": false, "minLength": 1}
    optional string display_name;

    optional worksheet_enum_feature_definition.WorksheetEnumFeatureDefinition enum_;
    optional worksheet_text_feature_definition.WorksheetTextFeatureDefinition text;
}
