namespace bean_java net.lab1318.costume.gui.models.component
namespace java net.lab1318.costume.api.models.component
namespace * costume.api.models.component

include "costume/api/models/component/component.thrift"

// Costume Core componentSet element
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.component.Component>
struct ComponentSet {
	// @validation {"minLength": 1}
	1: list<component.Component> elements;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	2: optional string display;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	3: optional string notes;
}
