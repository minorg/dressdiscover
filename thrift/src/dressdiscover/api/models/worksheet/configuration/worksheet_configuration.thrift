namespace * dressdiscover.api.models.worksheet.configuration

include "dressdiscover/api/models/worksheet/configuration/worksheet_definition_configuration.thrift"
include "dressdiscover/api/models/worksheet/configuration/worksheet_state_configuration.thrift"

struct WorksheetConfiguration {
    1: worksheet_definition_configuration.WorksheetDefinitionConfiguration definition;
    2: worksheet_state_configuration.WorksheetStateConfiguration state;
}
