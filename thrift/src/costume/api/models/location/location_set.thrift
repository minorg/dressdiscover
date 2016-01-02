namespace bean_java net.lab1318.costume.gui.models.location
namespace java net.lab1318.costume.api.models.location
namespace * costume.api.models.location

include "costume/api/models/location/location.thrift"

// VRA Core 4.0 locationSet element
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.location.Location>
struct LocationSet {
	// @validation {"minLength": 1}
	1: list<location.Location> elements;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	2: optional string display;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	3: optional string notes;
}
