namespace * dressdiscover.api.models.worksheet

include "thryft/native/url.thrift"

struct WorksheetRights {
    // @validation {"blank": false, "minLength": 1}
    string author;
    // @validation {"blank": false, "minLength": 1}
    string license;
    // @validation {"blank": false, "minLength": 1}
    string source_name;
    url.Url source_url;
}
