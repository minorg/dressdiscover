namespace bean_java org.dressdiscover.gui.models.structure
namespace java org.dressdiscover.api.models.structure
namespace * dressdiscover.api.models.structure

include "dressdiscover/api/models/vocab_ref.thrift"

struct StructureType {
	// @validation {"minLength": 1}
	1: string text;

	2: optional vocab_ref.VocabRef vocab_ref;
}
