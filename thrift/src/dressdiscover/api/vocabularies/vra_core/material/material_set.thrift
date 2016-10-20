namespace * dressdiscover.api.vocabularies.vra_core.material

include "dressdiscover/api/vocabularies/vra_core/material/material.thrift"

// VRA Core 4.0 materialSet element
// @java_implements org.dressdiscover.api.vocabularies.vra_core.ElementSet<org.dressdiscover.api.vocabularies.vra_core.material.Material>
struct MaterialSet {
	// @validation {"minLength": 1}
	1: list<material.Material> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
