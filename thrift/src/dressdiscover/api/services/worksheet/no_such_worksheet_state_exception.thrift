namespace cs DressDiscover.Api.Services.Worksheet
namespace * dressdiscover.api.services.worksheet

include "dressdiscover/api/models/worksheet/worksheet_state_id.thrift"

exception NoSuchWorksheetStateException {
	worksheet_state_id.WorksheetStateId id;
}
