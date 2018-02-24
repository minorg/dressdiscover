namespace * dressdiscover.api.models.worksheet

include "thryft/native/url.thrift"
include "thryft/waf/api/models/non_blank_string.thrift"

struct WorksheetRights {
    non_blank_string.NonBlankString author;
    non_blank_string.NonBlankString license;
    non_blank_string.NonBlankString source_name;
    url.Url source_url;
}
