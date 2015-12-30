namespace bean_java net.lab1318.costume.gui.models.component
namespace java net.lab1318.costume.api.models.component
namespace * costume.api.models.component

include "costume/api/models/component/component_term.thrift"

// Costume Core component element
// @java_implements net.lab1318.costume.api.models.Element
struct Component {
	1: component_term.ComponentTerm term;
}
