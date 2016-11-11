namespace * dressdiscover.api.models.worksheet

include "thryft/native/url.thrift"

struct WorksheetEnumFeatureValueImage {
    string rights;
    url.Url thumbnail_url;
    optional url.Url full_size_url;
}
