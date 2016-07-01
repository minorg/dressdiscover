namespace bean_java org.dressdiscover.gui.models.textref
namespace java org.dressdiscover.api.models.textref
namespace * dressdiscover.api.models.textref

include "costume/api/models/textref/textref_name_type.thrift"

// VRA Core 4.0 textref.name subelement
struct TextrefName {
	// @validation {"minLength": 1}
	1: string text;

	2: textref_name_type.TextrefNameType type;
}
