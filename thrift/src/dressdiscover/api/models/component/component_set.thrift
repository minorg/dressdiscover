namespace bean_java org.dressdiscover.gui.models.component
namespace java org.dressdiscover.api.models.component
namespace * dressdiscover.api.models.component

include "costume/api/models/component/component.thrift"

// Costume Core componentSet element
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.component.Component>
struct ComponentSet {
	// @validation {"minLength": 1}
	1: list<component.Component> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
