namespace * dressdiscover.api.services.worksheet

include "dressdiscover/api/models/worksheet/worksheet_state.thrift"
include "dressdiscover/api/models/worksheet/worksheet_state_id.thrift"
include "dressdiscover/api/services/io_exception.thrift"
include "dressdiscover/api/services/worksheet/no_such_worksheet_state_exception.thrift"

service WorksheetStateQueryService {
    worksheet_state.WorksheetState
    get_worksheet_state(
        worksheet_state_id.WorksheetStateId id
    ) throws (
        io_exception.IoException e1,
        no_such_worksheet_state_exception.NoSuchWorksheetStateException e2
    );

    list<worksheet_state_id.WorksheetStateId>
    get_worksheet_state_ids(
    ) throws (
        io_exception.IoException e
    );
}
