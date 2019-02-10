namespace * dressdiscover.api.services.worksheet

include "dressdiscover/api/models/worksheet/worksheet_definition.thrift"
include "dressdiscover/api/services/io_exception.thrift"

service WorksheetDefinitionQueryService {
    worksheet_definition.WorksheetDefinition
    get_worksheet_definition(
    ) throws (
        io_exception.IoException e
    );
}
