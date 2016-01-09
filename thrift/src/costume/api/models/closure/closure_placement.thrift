namespace bean_java net.lab1318.costume.gui.models.closure
namespace java net.lab1318.costume.api.models.closure
namespace * costume.api.models.closure

include "costume/api/models/vocab_ref.thrift"

struct ClosurePlacement {
	// @validation {"minLength": 1}
	1: string text;

	2: optional vocab_ref.VocabRef vocab_ref;
}
