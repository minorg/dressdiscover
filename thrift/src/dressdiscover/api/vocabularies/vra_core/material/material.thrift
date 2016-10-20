namespace * dressdiscover.api.vocabularies.vra_core.material

include "dressdiscover/api/vocabularies/vra_core/vocab_ref.thrift"
include "dressdiscover/api/vocabularies/vra_core/material/material_type.thrift"

// VRA Core 4.0 material element
// @java_implements org.dressdiscover.api.vocabularies.vra_core.Element
struct Material {
	// @validation {"minLength": 1}
	2: string text;

	1: material_type.MaterialType type;

	5: optional vocab_ref.VocabRef vocab_ref;
}
