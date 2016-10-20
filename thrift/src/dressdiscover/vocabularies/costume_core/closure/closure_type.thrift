namespace * dressdiscover.vocabularies.costume_core.closure

include "dressdiscover/api/models/vocab_ref.thrift"

struct ClosureType {
	// @validation {"minLength": 1}
	1: string text;

	2: optional vocab_ref.VocabRef vocab_ref;
}
