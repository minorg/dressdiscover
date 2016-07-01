namespace bean_java org.dressdiscover.gui.models.structure
namespace java org.dressdiscover.api.models.structure
namespace * dressdiscover.api.models.structure

include "costume/api/models/vocab_ref.thrift"
include "costume/api/models/structure/structure_type.thrift"

// Costume Core structure* elements
// @java_implements net.lab1318.costume.api.models.Element
struct Structure {
	// @validation {"minLength": 1}
	1: string text;

	2: structure_type.StructureType type;

	3: optional vocab_ref.VocabRef vocab_ref;
}
