namespace * dressdiscover.api.models.worksheet.configuration

include "dressdiscover/api/models/worksheet/configuration/bundled_worksheet_definition_configuration.thrift"

// @union
struct WorksheetDefinitionConfiguration {
    1: optional bundled_worksheet_definition_configuration.BundledWorksheetDefinitionConfiguration bundled;
}
