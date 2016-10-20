namespace * dressdiscover.vocabularies.costume_core.component

include "dressdiscover/vocabularies/vra_core/vocab_ref.thrift"

struct ComponentTerm {
	// @validation {"minLength": 1}
	1: string text;

	2: optional vocab_ref.VocabRef vocab_ref;
}
