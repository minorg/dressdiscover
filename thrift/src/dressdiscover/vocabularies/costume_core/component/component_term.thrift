namespace * dressdiscover.api.models.component

include "dressdiscover/api/models/vocab_ref.thrift"

struct ComponentTerm {
	// @validation {"minLength": 1}
	1: string text;

	2: optional vocab_ref.VocabRef vocab_ref;
}
