namespace * dressdiscover.api.vocabularies.vra_core.description

include "dressdiscover/api/vocabularies/vra_core/description/description.thrift"

// VRA Core 4.0 descriptionSet element
// @java_implements org.dressdiscover.api.vocabularies.vra_core.ElementSet<org.dressdiscover.api.vocabularies.vra_core.description.Description>
struct DescriptionSet {
	// @validation {"minLength": 1}
	1: list<description.Description> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
