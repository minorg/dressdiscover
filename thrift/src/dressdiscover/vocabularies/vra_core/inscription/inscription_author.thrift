namespace * dressdiscover.api.models.inscription

include "dressdiscover/api/models/vocab_ref.thrift"

struct InscriptionAuthor {
	// @validation {"minLength": 1}
	1: string text;

	4: optional vocab_ref.VocabRef vocab_ref;
}
