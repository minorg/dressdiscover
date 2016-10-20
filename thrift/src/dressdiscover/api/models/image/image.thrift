namespace * dressdiscover.api.models.image

include "dressdiscover/api/models/image/image_version.thrift"
include "dressdiscover/api/vocabularies/vra_core/rights/rights_set.thrift"

struct Image {
	2: optional image_version.ImageVersion full_size;

	3: optional image_version.ImageVersion original;

	6: optional rights_set.RightsSet rights;

	4: optional image_version.ImageVersion square_thumbnail;

	5: optional image_version.ImageVersion thumbnail;
}
