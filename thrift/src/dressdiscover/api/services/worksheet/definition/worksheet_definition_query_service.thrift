namespace * dressdiscover.api.services.worksheet.definition

include "dressdiscover/api/models/worksheet/definition/worksheet_definition.thrift"
include "dressdiscover/api/services/io_exception.thrift"

service WorksheetDefinitionQueryService {
    worksheet_definition.WorksheetDefinition
    get_worksheet_definition(
    ) throws (
        io_exception.IoException e
    );
}
