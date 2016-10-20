namespace * dressdiscover.api.vocabularies.vra_core.technique

include "dressdiscover/api/vocabularies/vra_core/vocab_ref.thrift"

// VRA Core 4.0 technique element
// @java_implements org.dressdiscover.api.vocabularies.vra_core.Element
struct Technique {
	// @validation {"minLength": 1}
	1: string text;

	4: optional vocab_ref.VocabRef vocab_ref;
}