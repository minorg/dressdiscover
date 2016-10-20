namespace * dressdiscover.api.vocabularies.costume_core.closure

include "dressdiscover/api/vocabularies/costume_core/closure/closure.thrift"

// Costume Core closureSet
// @java_implements org.dressdiscover.api.vocabularies.vra_core.ElementSet<org.dressdiscover.api.vocabularies.costume_core.closure.Closure>
struct ClosureSet {
	// @validation {"minLength": 1}
	1: list<closure.Closure> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
