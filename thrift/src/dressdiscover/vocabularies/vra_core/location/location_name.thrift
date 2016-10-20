namespace * dressdiscover.vocabularies.vra_core.location

include "dressdiscover/vocabularies/vra_core/vocab_ref.thrift"
include "dressdiscover/api/models/location/location_name_type.thrift"

// VRA Core 4.0 location.name subelement
struct LocationName {
	// @validation {"minLength": 1}
	1: string text;

	2: location_name_type.LocationNameType type;

	// @validation {"minLength": 1}
	3: optional string extent;

	4: optional vocab_ref.VocabRef vocab_ref;
}
