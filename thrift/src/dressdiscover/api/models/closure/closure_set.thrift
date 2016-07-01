namespace bean_java org.dressdiscover.gui.models.closure
namespace java org.dressdiscover.api.models.closure
namespace * dressdiscover.api.models.closure

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
