namespace * dressdiscover.api.vocabularies.costume_core.component

include "dressdiscover/api/vocabularies/costume_core/component/component.thrift"

// Costume Core componentSet element
// @java_implements org.dressdiscover.api.vocabularies.vra_core.ElementSet<org.dressdiscover.api.vocabularies.costume_core.component.Component>
struct ComponentSet {
	// @validation {"minLength": 1}
	1: list<component.Component> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
