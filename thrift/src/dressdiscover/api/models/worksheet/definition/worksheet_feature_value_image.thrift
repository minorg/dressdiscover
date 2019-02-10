namespace * dressdiscover.api.models.worksheet.definition

include "dressdiscover/api/models/worksheet/definition/worksheet_rights.thrift"

struct WorksheetFeatureValueImage {
    worksheet_rights.WorksheetRights rights;
    // Thumbnail and full size URLs can be relative
    // @validation {"blank": false, "minLength": 1}
    string thumbnail_url;
    // @validation {"blank": false, "minLength": 1}
    optional string full_size_url;
}
