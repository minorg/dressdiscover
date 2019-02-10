namespace * dressdiscover.api.services.worksheet.definition

include "dressdiscover/api/models/worksheet/worksheet_feature_set_id.thrift"

exception NoSuchWorksheetFeatureSetDefinitionException {
	worksheet_feature_set_id.WorksheetFeatureSetId id;
}

