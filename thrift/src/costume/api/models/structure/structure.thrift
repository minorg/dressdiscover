namespace bean_java net.lab1318.costume.gui.models.structure
namespace java net.lab1318.costume.api.models.structure
namespace * costume.api.models.structure

include "costume/api/models/vocab_ref.thrift"
include "costume/api/models/structure/structure_type.thrift"

// Costume Core structure* elements
// @java_implements net.lab1318.costume.api.models.Element
struct Structure {
	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	1: string text;

	2: structure_type.StructureType type;

	3: optional vocab_ref.VocabRef vocab_ref;
}
