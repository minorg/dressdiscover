namespace cs DressDiscover.Api.Models.Worksheet
namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_feature_value_image_rights.thrift"

struct WorksheetFeatureValueImage {
    worksheet_feature_value_image_rights.WorksheetFeatureValueImageRights rights;
    // Thumbnail and full size URLs can be relative
    // @validation {"blank": false, "minLength": 1}
    string thumbnail_url;
    // @validation {"blank": false, "minLength": 1}
    optional string full_size_url;
}
