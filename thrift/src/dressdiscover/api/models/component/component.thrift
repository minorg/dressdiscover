namespace bean_java org.dressdiscover.gui.models.component
namespace java org.dressdiscover.api.models.component
namespace * costume.api.models.component

include "costume/api/models/component/component_term.thrift"
include "costume/api/models/structure/structure_set.thrift"

// Costume Core component element
// @java_implements net.lab1318.costume.api.models.Element
struct Component {
	1: component_term.ComponentTerm term;

	2: optional structure_set.StructureSet structures;
}
