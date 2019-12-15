namespace * dressdiscover.api.models.worksheet.definition

include "dressdiscover/api/models/worksheet/definition/worksheet_rights.thrift"
include "thryft/waf/api/models/non_blank_string.thrift"

struct WorksheetDescription {
    worksheet_rights.WorksheetRights rights;
    non_blank_string.NonBlankString text_en;
}
