namespace bean_java net.lab1318.costume.gui.models.location
namespace java net.lab1318.costume.api.models.location
namespace * costume.api.models.location

include "costume/api/models/location/location_refid_type.thrift"

// VRA Core 4.0 location.refid subelement
struct LocationRefid {
	// @validation {"minLength": 1}
	1: string text;

	2: location_refid_type.LocationRefidType type;
}
