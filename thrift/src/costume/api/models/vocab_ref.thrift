namespace bean_java net.lab1318.costume.gui.models
namespace java net.lab1318.costume.api.models
namespace * costume.api.models

include "costume/api/models/vocab.thrift"
include "thryft/native/uri.thrift"

struct VocabRef {
	2: vocab.Vocab vocab;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	1: optional string refid;

	3: optional uri.Uri uri;
}
