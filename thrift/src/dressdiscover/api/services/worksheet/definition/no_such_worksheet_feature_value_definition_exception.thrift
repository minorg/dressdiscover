namespace * dressdiscover.api.services.worksheet

include "dressdiscover/api/models/worksheet/worksheet_feature_value_id.thrift"

exception NoSuchWorksheetFeatureValueDefinitionException {
	worksheet_feature_value_id.WorksheetFeatureValueId id;
}
