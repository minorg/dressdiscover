namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_rights.thrift"
include "thryft/waf/api/models/non_blank_string.thrift"

struct WorksheetDescription {
    worksheet_rights.WorksheetRights rights;
    non_blank_string.NonBlankString text;
}
