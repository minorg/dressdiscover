namespace * dressdiscover.api.vocabularies.costume_core.component

include "dressdiscover/api/vocabularies/costume_core/component/component_term.thrift"
include "dressdiscover/api/vocabularies/costume_core/structure/structure_set.thrift"

// Costume Core component element
// @java_implements org.dressdiscover.api.vocabularies.vra_core.Element
struct Component {
	1: component_term.ComponentTerm term;

	2: optional structure_set.StructureSet structures;
}
