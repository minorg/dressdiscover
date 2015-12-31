namespace bean_java net.lab1318.costume.gui.models.closure
namespace java net.lab1318.costume.api.models.closure
namespace * costume.api.models.closure

include "costume/api/models/closure/closure.thrift"

// Costume Core closureSet
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.closure.Closure>
struct ClosureSet {
	// @validation {"minLength": 1}
	1: list<closure.Closure> elements;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	2: optional string display;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	3: optional string notes;
}
