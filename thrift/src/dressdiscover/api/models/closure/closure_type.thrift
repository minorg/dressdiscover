namespace bean_java org.dressdiscover.gui.models.closure
namespace java org.dressdiscover.api.models.closure
namespace * costume.api.models.closure

include "costume/api/models/vocab_ref.thrift"

struct ClosureType {
	// @validation {"minLength": 1}
	1: string text;

	2: optional vocab_ref.VocabRef vocab_ref;
}
