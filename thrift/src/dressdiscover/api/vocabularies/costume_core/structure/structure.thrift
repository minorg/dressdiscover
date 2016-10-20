namespace * dressdiscover.vocabularies.costume_core.structure

include "dressdiscover/vocabularies/vra_core/vocab_ref.thrift"
include "dressdiscover/vocabularies/costume_core/structure/structure_type.thrift"

// Costume Core structure* elements
// @java_implements org.dressdiscover.api.models.Element
struct Structure {
	// @validation {"minLength": 1}
	1: string text;

	2: structure_type.StructureType type;

	3: optional vocab_ref.VocabRef vocab_ref;
}
