namespace bean_java net.lab1318.costume.gui.models.material
namespace java net.lab1318.costume.api.models.material
namespace * costume.api.models.material

include "costume/api/models/refid.thrift"
include "costume/api/models/vocab.thrift"
include "costume/api/models/material/material_type.thrift"

// VRA Core 4.0 material element
struct Material {
	1: material_type.MaterialType type;

	// @validation {"minLength": 1}
	2: string text;

	3: optional refid.Refid refid;
	4: optional vocab.Vocab vocab;
}
