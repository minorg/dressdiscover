namespace bean_java net.lab1318.costume.gui.models.textref
namespace java net.lab1318.costume.api.models.textref
namespace * costume.api.models.textref

include "costume/api/models/textref/textref.thrift"

// VRA Core 4.0 textrefSet element
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.textref.Textref>
struct TextrefSet {
	// @validation {"minLength": 1}
	1: list<textref.Textref> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
