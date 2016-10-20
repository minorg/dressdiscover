namespace bean_java org.dressdiscover.gui.models
namespace java org.dressdiscover.api.models
namespace * dressdiscover.api.models

include "dressdiscover/api/models/vocab.thrift"
include "thryft/native/uri.thrift"

struct VocabRef {
	2: vocab.Vocab vocab;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	1: optional string refid;

	3: optional uri.Uri uri;
}
