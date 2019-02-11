namespace * dressdiscover.api.models.worksheet.configuration

include "dressdiscover/api/models/worksheet/configuration/local_storage_worksheet_state_configuration.thrift"

// @union
struct WorksheetStateConfiguration {
    1: optional local_storage_worksheet_state_configuration.LocalStorageWorksheetStateConfiguration local_storage;
}
