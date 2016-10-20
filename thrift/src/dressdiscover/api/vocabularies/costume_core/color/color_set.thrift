namespace * dressdiscover.api.vocabularies.costume_core.color

include "dressdiscover/api/vocabularies/costume_core/color/color.thrift"

// Costume Core colorSet element
// @java_implements org.dressdiscover.api.vocabularies.vra_core.ElementSet<org.dressdiscover.api.vocabularies.costume_core.color.Color>
struct ColorSet {
	// @validation {"minLength": 1}
	1: list<color.Color> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
