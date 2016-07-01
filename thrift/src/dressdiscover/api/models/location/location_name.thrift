namespace bean_java org.dressdiscover.gui.models.location
namespace java org.dressdiscover.api.models.location
namespace * dressdiscover.api.models.location

include "costume/api/models/vocab_ref.thrift"
include "costume/api/models/location/location_name_type.thrift"

// VRA Core 4.0 location.name subelement
struct LocationName {
	// @validation {"minLength": 1}
	1: string text;

	2: location_name_type.LocationNameType type;

	// @validation {"minLength": 1}
	3: optional string extent;

	4: optional vocab_ref.VocabRef vocab_ref;
}
