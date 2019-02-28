namespace * dressdiscover.api.models.worksheet.definition

include "thryft/native/url.thrift"
include "thryft/waf/api/models/non_blank_string.thrift"

// @union
struct WorksheetFeatureValueImageUrl {
    optional url.Url absolute;
    optional non_blank_string.NonBlankString relative;
}
