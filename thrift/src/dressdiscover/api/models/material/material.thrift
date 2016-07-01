namespace bean_java org.dressdiscover.gui.models.material
namespace java org.dressdiscover.api.models.material
namespace * costume.api.models.material

include "costume/api/models/vocab_ref.thrift"
include "costume/api/models/material/material_type.thrift"

// VRA Core 4.0 material element
// @java_implements net.lab1318.costume.api.models.Element
struct Material {
	// @validation {"minLength": 1}
	2: string text;

	1: material_type.MaterialType type;

	5: optional vocab_ref.VocabRef vocab_ref;
}
