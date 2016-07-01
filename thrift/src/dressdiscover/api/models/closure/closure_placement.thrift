namespace bean_java org.dressdiscover.gui.models.closure
namespace java org.dressdiscover.api.models.closure
namespace * dressdiscover.api.models.closure

include "dressdiscover/api/models/vocab_ref.thrift"

struct ClosurePlacement {
	// @validation {"minLength": 1}
	1: string text;

	2: optional vocab_ref.VocabRef vocab_ref;
}
