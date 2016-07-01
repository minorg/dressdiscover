namespace bean_java org.dressdiscover.gui.models.location
namespace java org.dressdiscover.api.models.location
namespace * costume.api.models.location

include "costume/api/models/location/location.thrift"

// VRA Core 4.0 locationSet element
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.location.Location>
struct LocationSet {
	// @validation {"minLength": 1}
	1: list<location.Location> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
