namespace bean_java net.lab1318.costume.gui.models.image
namespace java net.lab1318.costume.api.models.image
namespace * costume.api.models.image

include "costume/api/models/image/image_type.thrift"
include "thryft/native/u32.thrift"
include "thryft/native/url.thrift"

struct Image {
	1: url.Url url;
	2: optional u32.u32 height_px;
	4: optional image_type.ImageType type;
	3: optional u32.u32 width_px;
}
