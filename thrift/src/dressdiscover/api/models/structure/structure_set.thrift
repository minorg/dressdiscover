namespace bean_java org.dressdiscover.gui.models.structure
namespace java org.dressdiscover.api.models.structure
namespace * dressdiscover.api.models.structure

include "dressdiscover/api/models/structure/structure.thrift"

// Costume Core structure* elements
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.structure.Structure>
struct StructureSet {
	// @validation {"minLength": 1}
	1: list<structure.Structure> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
