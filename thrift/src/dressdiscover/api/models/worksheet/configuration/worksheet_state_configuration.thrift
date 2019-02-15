namespace * dressdiscover.api.models.worksheet.configuration

include "dressdiscover/api/models/worksheet/configuration/google_sheets_worksheet_state_configuration.thrift"
include "dressdiscover/api/models/worksheet/configuration/local_storage_worksheet_state_configuration.thrift"

// @union
struct WorksheetStateConfiguration {
    2: optional google_sheets_worksheet_state_configuration.GoogleSheetsWorksheetStateConfiguration google_sheets;
    1: optional local_storage_worksheet_state_configuration.LocalStorageWorksheetStateConfiguration local_storage;
}
