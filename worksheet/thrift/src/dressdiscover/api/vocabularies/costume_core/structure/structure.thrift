namespace * dressdiscover.api.vocabularies.costume_core.structure

include "dressdiscover/api/vocabularies/costume_core/structure/structure_type.thrift"
include "dressdiscover/api/vocabularies/vra_core/vocab_ref.thrift"

// Costume Core structure* elements
// @java_implements org.dressdiscover.api.vocabularies.vra_core.Element
struct Structure {
	// @validation {"minLength": 1}
	1: string text;

	2: structure_type.StructureType type;

	3: optional vocab_ref.VocabRef vocab_ref;
}
