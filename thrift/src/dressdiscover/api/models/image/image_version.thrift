namespace * dressdiscover.api.models.image

include "thryft/native/url.thrift"

struct ImageVersion {
	// @elastic_search_mapping {"index": "not_analyzed"}
	1: url.Url url;
	2: optional i32 height_px;
	3: optional i32 width_px;
}
