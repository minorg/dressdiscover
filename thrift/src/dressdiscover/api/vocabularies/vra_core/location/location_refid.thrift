namespace * dressdiscover.api.vocabularies.vra_core.location

include "dressdiscover/api/vocabularies/vra_core/location/location_refid_type.thrift"

// VRA Core 4.0 location.refid subelement
struct LocationRefid {
	// @validation {"minLength": 1}
	1: string text;

	2: location_refid_type.LocationRefidType type;
}
