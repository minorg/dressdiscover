namespace * dressdiscover.api.models.qa

include "dressdiscover/api/models/qa/qa_image_rights.thrift"

struct QaImage {
    // Thumbnail and full size URLs can be relative
    // @validation {"blank": false, "minLength": 1}
    string full_size_url;
    qa_image_rights.QaImageRights rights;
    // @validation {"blank": false, "minLength": 1}
    string thumbnail_url;
}
