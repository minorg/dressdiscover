namespace * dressdiscover.vocabularies.vra_core.description

include "dressdiscover/api/models/description/description.thrift"

// VRA Core 4.0 descriptionSet element
// @java_implements org.dressdiscover.api.models.ElementSet<org.dressdiscover.api.models.description.Description>
struct DescriptionSet {
	// @validation {"minLength": 1}
	1: list<description.Description> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
