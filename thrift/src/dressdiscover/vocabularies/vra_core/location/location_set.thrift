namespace * dressdiscover.vocabularies.vra_core.location

include "dressdiscover/vocabularies/vra_core/location/location.thrift"

// VRA Core 4.0 locationSet element
// @java_implements org.dressdiscover.api.models.ElementSet<org.dressdiscover.api.models.location.Location>
struct LocationSet {
	// @validation {"minLength": 1}
	1: list<location.Location> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
