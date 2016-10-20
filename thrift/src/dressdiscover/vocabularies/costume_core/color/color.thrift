namespace * dressdiscover.vocabularies.costume_core.color

include "dressdiscover/api/models/color/color_type.thrift"
include "dressdiscover/vocabularies/vra_core/vocab_ref.thrift"

// Costume Core color element
// @java_implements org.dressdiscover.api.models.Element
struct Color {
	// @validation {"minLength": 1}
	1: string text;

	2: color_type.ColorType type;

	3: optional vocab_ref.VocabRef vocab_ref;
}
