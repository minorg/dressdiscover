namespace bean_java net.lab1318.costume.gui.models.component
namespace java net.lab1318.costume.api.models.component
namespace * costume.api.models.component

include "costume/api/models/vocab_ref.thrift"

struct ComponentTerm {
	// @validation {"minLength": 1}
	1: string text;

	2: optional vocab_ref.VocabRef vocab_ref;
}
