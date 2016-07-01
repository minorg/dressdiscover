namespace bean_java org.dressdiscover.gui.models.inscription
namespace java org.dressdiscover.api.models.inscription
namespace * costume.api.models.inscription

include "costume/api/models/vocab_ref.thrift"

struct InscriptionAuthor {
	// @validation {"minLength": 1}
	1: string text;

	4: optional vocab_ref.VocabRef vocab_ref;
}
