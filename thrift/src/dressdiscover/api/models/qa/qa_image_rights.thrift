namespace * dressdiscover.api.models.qa

include "thryft/native/url.thrift"

struct QaImageRights {
    // @validation {"blank": false, "minLength": 1}
    string author;
    // @validation {"blank": false, "minLength": 1}
    string license;
    // @validation {"blank": false, "minLength": 1}
    string source_name;
    url.Url source_url;
}
