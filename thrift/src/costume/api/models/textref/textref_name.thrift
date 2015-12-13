namespace bean_java net.lab1318.costume.gui.models.textref
namespace java net.lab1318.costume.api.models.textref
namespace * costume.api.models.textref

include "costume/api/models/textref/textref_name_type.thrift"

// VRA Core 4.0 textref.name subelement
struct TextrefName {
	// @validation {"minLength": 1}
	1: string text;

	2: textref_name_type.TextrefNameType type;
}
