namespace * dressdiscover.api.vocabularies.vra_core.location

include "dressdiscover/api/vocabularies/vra_core/location/location_name_type.thrift"
include "dressdiscover/api/vocabularies/vra_core/vocab_ref.thrift"

// VRA Core 4.0 location.name subelement
struct LocationName {
	// @validation {"minLength": 1}
	1: string text;

	2: location_name_type.LocationNameType type;

	// @validation {"minLength": 1}
	3: optional string extent;

	4: optional vocab_ref.VocabRef vocab_ref;
}
