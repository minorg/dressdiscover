namespace bean_java net.lab1318.costume.gui.models.image
namespace java net.lab1318.costume.api.models.image
namespace * costume.api.models.image

include "costume/api/models/image/image_version.thrift"
include "costume/api/models/rights/rights_set.thrift"

struct Image {
	2: optional image_version.ImageVersion full_size;

	3: optional image_version.ImageVersion original;

	6: optional rights_set.RightsSet rights;

	4: optional image_version.ImageVersion square_thumbnail;

	5: optional image_version.ImageVersion thumbnail;
}
