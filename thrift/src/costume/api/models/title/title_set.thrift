namespace bean_java net.lab1318.costume.gui.models.title
namespace java net.lab1318.costume.api.models.title
namespace * costume.api.models.title

include "costume/api/models/title/title.thrift"

// VRA Core 4.0 titleSet element
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.title.Title>
struct TitleSet {
	// @validation {"minLength": 1}
	1: list<title.Title> elements;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	2: optional string display;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	3: optional string notes;
}
