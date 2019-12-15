namespace * dressdiscover.api.vocabularies.vra_core.cultural_context

include "dressdiscover/api/vocabularies/vra_core/vocab_ref.thrift"

// VRA Core 4.0 culturalContext element
// @java_implements org.dressdiscover.api.vocabularies.vra_core.Element
struct CulturalContext {
	// @validation {"minLength": 1}
	1: string text;

	2: optional vocab_ref.VocabRef vocab_ref;
}
