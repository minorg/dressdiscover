namespace * dressdiscover.api.vocabularies.vra_core.textref

include "dressdiscover/api/vocabularies/vra_core/textref/textref.thrift"

// VRA Core 4.0 textrefSet element
// @java_implements org.dressdiscover.api.vocabularies.vra_core.ElementSet<org.dressdiscover.api.vocabularies.vra_core.textref.Textref>
struct TextrefSet {
	// @validation {"minLength": 1}
	1: list<textref.Textref> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
