namespace * dressdiscover.api.models.technique

include "dressdiscover/api/models/vocab_ref.thrift"

// VRA Core 4.0 technique element
// @java_implements org.dressdiscover.api.models.Element
struct Technique {
	// @validation {"minLength": 1}
	1: string text;

	4: optional vocab_ref.VocabRef vocab_ref;
}
