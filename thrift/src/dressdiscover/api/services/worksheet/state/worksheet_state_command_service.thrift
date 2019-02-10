namespace * dressdiscover.api.services.worksheet.state

include "dressdiscover/api/models/worksheet/state/worksheet_state.thrift"
include "dressdiscover/api/models/worksheet/state/worksheet_state_id.thrift"
include "dressdiscover/api/services/io_exception.thrift"
include "dressdiscover/api/services/worksheet/state/duplicate_worksheet_state_exception.thrift"
include "dressdiscover/api/services/worksheet/state/no_such_worksheet_state_exception.thrift"

service WorksheetStateCommandService {
    void
    delete_worksheet_state(
	    worksheet_state_id.WorksheetStateId id
    ) throws (
        io_exception.IoException e
    );

    void
    put_worksheet_state(
        worksheet_state.WorksheetState state
    ) throws (
        io_exception.IoException e
    );

    void
    rename_worksheet_state(
        worksheet_state_id.WorksheetStateId new_id,
        worksheet_state_id.WorksheetStateId old_id
    ) throws (
        duplicate_worksheet_state_exception.DuplicateWorksheetStateException e1,
        io_exception.IoException e2,
        no_such_worksheet_state_exception.NoSuchWorksheetStateException e3
    );
}
