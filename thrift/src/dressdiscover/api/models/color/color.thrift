namespace bean_java org.dressdiscover.gui.models.color
namespace java org.dressdiscover.api.models.color
namespace * costume.api.models.color

include "costume/api/models/color/color_type.thrift"
include "costume/api/models/vocab_ref.thrift"

// Costume Core color element
// @java_implements net.lab1318.costume.api.models.Element
struct Color {
	// @validation {"minLength": 1}
	1: string text;

	2: color_type.ColorType type;

	3: optional vocab_ref.VocabRef vocab_ref;
}
