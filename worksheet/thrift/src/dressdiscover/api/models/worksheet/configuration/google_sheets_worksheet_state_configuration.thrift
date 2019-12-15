namespace * dressdiscover.api.models.worksheet.configuration

include "thryft/waf/api/models/non_blank_string.thrift"

struct GoogleSheetsWorksheetStateConfiguration {
    1: non_blank_string.NonBlankString spreadsheet_id;
}
