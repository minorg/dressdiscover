namespace * dressdiscover.api.services.worksheet

include "dressdiscover/api/models/worksheet/worksheet_state.thrift"
include "dressdiscover/api/models/worksheet/worksheet_state_id.thrift"
include "dressdiscover/api/services/io_exception.thrift"

service WorksheetStateQueryService {
    worksheet_state.WorksheetState
    get_worksheet_state(
        worksheet_state_id.WorksheetStateId id
    ) throws (
        io_exception.IoException e
    );

    list<worksheet_state_id.WorksheetStateId>
    get_worksheet_state_ids(
    ) throws (
        io_exception.IoException e
    );
}
