namespace * dressdiscover.api.vocabularies.vra_core.technique

include "dressdiscover/api/vocabularies/vra_core/technique/technique.thrift"

// VRA Core 4.0 techniqueSet element
// @java_implements org.dressdiscover.api.vocabularies.vra_core.ElementSet<org.dressdiscover.api.vocabularies.vra_core.technique.Technique>
struct TechniqueSet {
	// @validation {"minLength": 1}
	1: list<technique.Technique> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
