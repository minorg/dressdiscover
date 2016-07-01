namespace bean_java org.dressdiscover.gui.models.closure
namespace java org.dressdiscover.api.models.closure
namespace * dressdiscover.api.models.closure

include "costume/api/models/closure/closure.thrift"

// Costume Core closureSet
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.closure.Closure>
struct ClosureSet {
	// @validation {"minLength": 1}
	1: list<closure.Closure> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
