namespace * dressdiscover.api.vocabularies.costume_core.closure

include "dressdiscover/api/vocabularies/costume_core/closure/closure_placement.thrift"
include "dressdiscover/api/vocabularies/costume_core/closure/closure_type.thrift"

// Costume Core closure* elements
// @java_implements org.dressdiscover.api.vocabularies.vra_core.Element
struct Closure {
	1: closure_placement.ClosurePlacement placement;

	2: closure_type.ClosureType type;
}
