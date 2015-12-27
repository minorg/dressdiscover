namespace bean_java net.lab1318.costume.gui.models.color
namespace java net.lab1318.costume.api.models.color
namespace * costume.api.models.color

include "costume/api/models/color/color_type.thrift"
include "costume/api/models/vocab_ref.thrift"

// Costume Core color element
// @java_implements net.lab1318.costume.api.models.Element
struct Color {
	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	1: string text;

	2: color_type.ColorType type;

	3: optional vocab_ref.VocabRef vocab_ref;
}
