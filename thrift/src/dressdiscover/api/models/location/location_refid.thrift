namespace bean_java org.dressdiscover.gui.models.location
namespace java org.dressdiscover.api.models.location
namespace * costume.api.models.location

include "costume/api/models/location/location_refid_type.thrift"

// VRA Core 4.0 location.refid subelement
struct LocationRefid {
	// @validation {"minLength": 1}
	1: string text;

	2: location_refid_type.LocationRefidType type;
}
