namespace * dressdiscover.api.services.worksheet.definition

include "dressdiscover/api/models/worksheet/worksheet_feature_id.thrift"

exception NoSuchWorksheetFeatureDefinitionException {
	worksheet_feature_id.WorksheetFeatureId id;
}
