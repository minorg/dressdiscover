namespace bean_java org.dressdiscover.gui.models.technique
namespace java org.dressdiscover.api.models.technique
namespace * dressdiscover.api.models.technique

include "costume/api/models/vocab_ref.thrift"

// VRA Core 4.0 technique element
// @java_implements net.lab1318.costume.api.models.Element
struct Technique {
	// @validation {"minLength": 1}
	1: string text;

	4: optional vocab_ref.VocabRef vocab_ref;
}
