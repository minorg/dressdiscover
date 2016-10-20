namespace * dressdiscover.api.models.material

include "dressdiscover/api/models/material/material.thrift"

// VRA Core 4.0 materialSet element
// @java_implements org.dressdiscover.api.models.ElementSet<org.dressdiscover.api.models.material.Material>
struct MaterialSet {
	// @validation {"minLength": 1}
	1: list<material.Material> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
