namespace * dressdiscover.api.models.worksheet.definition

include "thryft/native/url.thrift"
include "thryft/waf/api/models/non_blank_string.thrift"

struct WorksheetRightsSource {
    non_blank_string.NonBlankString name;
    url.Url url;
}
