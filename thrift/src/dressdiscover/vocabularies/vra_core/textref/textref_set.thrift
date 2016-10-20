namespace * dressdiscover.vocabularies.vra_core.textref

include "dressdiscover/api/models/textref/textref.thrift"

// VRA Core 4.0 textrefSet element
// @java_implements org.dressdiscover.api.models.ElementSet<org.dressdiscover.api.models.textref.Textref>
struct TextrefSet {
	// @validation {"minLength": 1}
	1: list<textref.Textref> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
