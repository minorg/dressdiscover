namespace * dressdiscover.api.services.worksheet

include "dressdiscover/api/models/worksheet/worksheet_state.thrift"
include "dressdiscover/api/services/io_exception.thrift"

service WorksheetCommandService {
    void
    put_worksheet_state(
        worksheet_state.WorksheetState state
    ) throws (
        io_exception.IoException e
    );
}
