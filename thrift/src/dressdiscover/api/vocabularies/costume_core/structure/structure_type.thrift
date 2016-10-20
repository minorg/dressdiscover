namespace * dressdiscover.api.vocabularies.costume_core.structure

include "dressdiscover/api/vocabularies/vra_core/vocab_ref.thrift"

struct StructureType {
	// @validation {"minLength": 1}
	1: string text;

	2: optional vocab_ref.VocabRef vocab_ref;
}
