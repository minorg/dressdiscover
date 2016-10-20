namespace * dressdiscover.vocabularies.vra_core.textref

include "dressdiscover/vocabularies/vra_core/textref/textref_name_type.thrift"

// VRA Core 4.0 textref.name subelement
struct TextrefName {
	// @validation {"minLength": 1}
	1: string text;

	2: textref_name_type.TextrefNameType type;
}
