namespace * dressdiscover.api.models.worksheet.definition

include "dressdiscover/api/models/worksheet/definition/worksheet_feature_value_image_url.thrift"
include "dressdiscover/api/models/worksheet/definition/worksheet_rights.thrift"

struct WorksheetFeatureValueImage {
    worksheet_rights.WorksheetRights rights;
    worksheet_feature_value_image_url.WorksheetFeatureValueImageUrl thumbnail_url;
    optional worksheet_feature_value_image_url.WorksheetFeatureValueImageUrl full_size_url;
}
