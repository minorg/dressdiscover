namespace cs DressDiscover.Api.Services.Worksheet
namespace * dressdiscover.api.services.worksheet

include "dressdiscover/api/models/worksheet/worksheet_state_id.thrift"

exception DuplicateWorksheetStateException {
	worksheet_state_id.WorksheetStateId id;
}
