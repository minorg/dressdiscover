namespace * dressdiscover.api.models.worksheet

include "thryft/native/url.thrift"

struct WorksheetEnumFeatureValueImage {
    // @validation {"blank": false, "minLength": 1}
    string rights;
    url.Url thumbnail_url;
    optional url.Url full_size_url;
}
