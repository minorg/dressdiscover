namespace bean_java net.lab1318.costume.gui.models.location
namespace java net.lab1318.costume.api.models.location
namespace * costume.api.models.location

include "costume/api/models/location/location_coordinates.thrift"
include "costume/api/models/location/location_name.thrift"
include "costume/api/models/location/location_refid.thrift"
include "costume/api/models/location/location_type.thrift"

// VRA Core 4.0 location element
// @java_implements net.lab1318.costume.api.models.Element
struct Location {
	1: location_type.LocationType type;

    4: optional location_coordinates.LocationCoordinates coordinates;

	// @validation {"minLength": 1}
	2: optional list<location_name.LocationName> names;

	// @validation {"minLength": 1}
	3: optional list<location_refid.LocationRefid> refids;
}
