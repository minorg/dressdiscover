namespace bean_java org.dressdiscover.gui.models.material
namespace java org.dressdiscover.api.models.material
namespace * dressdiscover.api.models.material

include "dressdiscover/api/models/material/material.thrift"

// VRA Core 4.0 materialSet element
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.material.Material>
struct MaterialSet {
	// @validation {"minLength": 1}
	1: list<material.Material> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
