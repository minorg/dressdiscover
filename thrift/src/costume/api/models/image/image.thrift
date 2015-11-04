namespace bean_java net.lab1318.costume.gui.models.image
namespace java net.lab1318.costume.api.models.image
namespace * costume.api.models.image

include "thryft/native/u32.thrift"
include "thryft/native/url.thrift"

struct Image {
	url.Url url;
	optional u32.u32 height_px;
	optional u32.u32 width_px;
}
