namespace bean_java net.lab1318.costume.gui.models.material
namespace java net.lab1318.costume.api.models.material
namespace * costume.api.models.material

include "costume/api/models/material/material.thrift"

// VRA Core 4.0 materialSet element
struct MaterialSet {
	// @validation {"minLength": 1}
	1: list<material.Material> materials;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
