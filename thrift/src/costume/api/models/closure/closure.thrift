namespace bean_java net.lab1318.costume.gui.models.closure
namespace java net.lab1318.costume.api.models.closure
namespace * costume.api.models.closure

include "costume/api/models/closure/closure_placement.thrift"
include "costume/api/models/closure/closure_type.thrift"

// Costume Core closure* elements
// @java_implements net.lab1318.costume.api.models.Element
struct Closure {
	1: closure_placement.ClosurePlacement placement;

	2: closure_type.ClosureType type;
}
