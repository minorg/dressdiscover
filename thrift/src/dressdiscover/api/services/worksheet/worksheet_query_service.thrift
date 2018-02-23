namespace * dressdiscover.api.services.worksheet

include "dressdiscover/api/models/worksheet/worksheet_accession_number.thrift"
include "dressdiscover/api/models/worksheet/worksheet_definition.thrift"
include "dressdiscover/api/models/worksheet/worksheet_state.thrift"
include "dressdiscover/api/services/io_exception.thrift"

service WorksheetQueryService {
    list<worksheet_accession_number.WorksheetAccessionNumber>
    get_worksheet_accession_numbers(
    ) throws (
        io_exception.IoException e
    );

    worksheet_definition.WorksheetDefinition
    get_worksheet_definition(
    ) throws (
        io_exception.IoException e
    );

    worksheet_state.WorksheetState
    get_worksheet_state(
        worksheet_accession_number.WorksheetAccessionNumber accession_number
    ) throws (
        io_exception.IoException e
    );
}
