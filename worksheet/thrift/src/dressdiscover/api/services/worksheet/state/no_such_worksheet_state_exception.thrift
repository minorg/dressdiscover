namespace * dressdiscover.api.services.worksheet.state

include "dressdiscover/api/models/worksheet/state/worksheet_state_id.thrift"

exception NoSuchWorksheetStateException {
	worksheet_state_id.WorksheetStateId id;
}
