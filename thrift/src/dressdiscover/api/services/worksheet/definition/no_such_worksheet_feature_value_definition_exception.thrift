namespace * dressdiscover.api.services.worksheet.definition

include "dressdiscover/api/models/worksheet/worksheet_feature_value_id.thrift"

exception NoSuchWorksheetFeatureValueDefinitionException {
	worksheet_feature_value_id.WorksheetFeatureValueId id;
}
