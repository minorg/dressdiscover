namespace * dressdiscover.api.models.worksheet.definition

include "thryft/native/uri.thrift"
include "thryft/waf/api/models/non_blank_string.thrift"

struct WorksheetRightsLicense {
    non_blank_string.NonBlankString nickname;
    non_blank_string.NonBlankString statement;
    uri.Uri uri;
}
