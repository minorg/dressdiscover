namespace * dressdiscover.api.models.structure

include "dressdiscover/api/models/structure/structure.thrift"

// Costume Core structure* elements
// @java_implements org.dressdiscover.api.models.ElementSet<org.dressdiscover.api.models.structure.Structure>
struct StructureSet {
	// @validation {"minLength": 1}
	1: list<structure.Structure> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
