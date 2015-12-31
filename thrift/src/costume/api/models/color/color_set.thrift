namespace bean_java net.lab1318.costume.gui.models.color
namespace java net.lab1318.costume.api.models.color
namespace * costume.api.models.color

include "costume/api/models/color/color.thrift"

// Costume Core colorSet element
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.color.Color>
struct ColorSet {
	// @validation {"minLength": 1}
	1: list<color.Color> elements;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	2: optional string display;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	3: optional string notes;
}
