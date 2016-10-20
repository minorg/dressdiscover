namespace * dressdiscover.vocabularies.costume_core.component

include "dressdiscover/vocabularies/costume_core/component/component.thrift"

// Costume Core componentSet element
// @java_implements org.dressdiscover.api.models.ElementSet<org.dressdiscover.api.models.component.Component>
struct ComponentSet {
	// @validation {"minLength": 1}
	1: list<component.Component> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
