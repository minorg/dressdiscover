namespace * dressdiscover.api.models.worksheet.definition

include "dressdiscover/api/models/worksheet/definition/worksheet_rights_license.thrift"
include "dressdiscover/api/models/worksheet/definition/worksheet_rights_source.thrift"
include "thryft/waf/api/models/non_blank_string.thrift"

struct WorksheetRights {
    non_blank_string.NonBlankString author;
    worksheet_rights_license.WorksheetRightsLicense license;
    worksheet_rights_source.WorksheetRightsSource source;
}
