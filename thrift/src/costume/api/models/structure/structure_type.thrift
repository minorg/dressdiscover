namespace bean_java net.lab1318.costume.gui.models.structure
namespace java net.lab1318.costume.api.models.structure
namespace * costume.api.models.structure

include "costume/api/models/vocab_ref.thrift"

struct StructureType {
	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	1: string text;

	2: optional vocab_ref.VocabRef vocab_ref;
}
