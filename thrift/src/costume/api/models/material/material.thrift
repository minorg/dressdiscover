namespace bean_java net.lab1318.costume.gui.models.material
namespace java net.lab1318.costume.api.models.material
namespace * costume.api.models.material

include "costume/api/models/vocab_ref.thrift"
include "costume/api/models/material/material_type.thrift"

// VRA Core 4.0 material element
struct Material {
	1: material_type.MaterialType type;

	// @validation {"minLength": 1}
	2: string text;

	5: optional vocab_ref.VocabRef vocab_ref;
}
