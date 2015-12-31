namespace bean_java net.lab1318.costume.gui.models.material
namespace java net.lab1318.costume.api.models.material
namespace * costume.api.models.material

include "costume/api/models/material/material.thrift"

// VRA Core 4.0 materialSet element
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.material.Material>
struct MaterialSet {
	// @validation {"minLength": 1}
	1: list<material.Material> elements;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	2: optional string display;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	3: optional string notes;
}
