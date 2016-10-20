namespace * dressdiscover.api.models.closure

include "dressdiscover/api/models/closure/closure_placement.thrift"
include "dressdiscover/api/models/closure/closure_type.thrift"

// Costume Core closure* elements
// @java_implements org.dressdiscover.api.models.Element
struct Closure {
	1: closure_placement.ClosurePlacement placement;

	2: closure_type.ClosureType type;
}
