namespace * dressdiscover.vocabularies.costume_core.color

include "dressdiscover/vocabularies/costume_core/color/color.thrift"

// Costume Core colorSet element
// @java_implements org.dressdiscover.api.models.ElementSet<org.dressdiscover.api.models.color.Color>
struct ColorSet {
	// @validation {"minLength": 1}
	1: list<color.Color> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
