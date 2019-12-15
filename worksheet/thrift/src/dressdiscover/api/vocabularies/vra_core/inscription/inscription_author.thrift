namespace * dressdiscover.api.vocabularies.vra_core.inscription

include "dressdiscover/api/vocabularies/vra_core/vocab_ref.thrift"

struct InscriptionAuthor {
	// @validation {"minLength": 1}
	1: string text;

	4: optional vocab_ref.VocabRef vocab_ref;
}
