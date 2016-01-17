namespace bean_java net.lab1318.costume.gui.models.image
namespace java net.lab1318.costume.api.models.image
namespace * costume.api.models.image

include "thryft/native/u32.thrift"
include "thryft/native/url.thrift"

struct ImageVersion {
	// @elastic_search_mapping {"index": "not_analyzed"}
	1: url.Url url;
	2: optional u32.u32 height_px;
	3: optional u32.u32 width_px;
}
