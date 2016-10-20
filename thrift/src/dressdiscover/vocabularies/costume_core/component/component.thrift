namespace * dressdiscover.api.models.component

include "dressdiscover/api/models/component/component_term.thrift"
include "dressdiscover/api/models/structure/structure_set.thrift"

// Costume Core component element
// @java_implements org.dressdiscover.api.models.Element
struct Component {
	1: component_term.ComponentTerm term;

	2: optional structure_set.StructureSet structures;
}
