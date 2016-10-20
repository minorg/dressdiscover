namespace * dressdiscover.vocabularies.costume_core.closure

include "dressdiscover/api/models/closure/closure.thrift"

// Costume Core closureSet
// @java_implements org.dressdiscover.api.models.ElementSet<org.dressdiscover.api.models.closure.Closure>
struct ClosureSet {
	// @validation {"minLength": 1}
	1: list<closure.Closure> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
