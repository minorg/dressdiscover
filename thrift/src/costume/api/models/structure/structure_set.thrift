namespace bean_java net.lab1318.costume.gui.models.structure
namespace java net.lab1318.costume.api.models.structure
namespace * costume.api.models.structure

include "costume/api/models/structure/structure.thrift"

// Costume Core structure* elements
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.structure.Structure>
struct StructureSet {
	// @validation {"minLength": 1}
	1: list<structure.Structure> elements;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	2: optional string display;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	3: optional string notes;
}
