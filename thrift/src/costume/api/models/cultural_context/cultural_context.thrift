namespace bean_java net.lab1318.costume.gui.models.cultural_context
namespace java net.lab1318.costume.api.models.cultural_context
namespace * costume.api.models.cultural_context

include "costume/api/models/vocab_ref.thrift"

// VRA Core 4.0 culturalContext element
// @java_implements net.lab1318.costume.api.models.Element
struct CulturalContext {
	// @validation {"minLength": 1}
	1: string text;

	2: optional vocab_ref.VocabRef vocab_ref;
}
