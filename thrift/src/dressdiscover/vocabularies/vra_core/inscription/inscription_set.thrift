namespace * dressdiscover.api.models.inscription

include "dressdiscover/api/models/inscription/inscription.thrift"

// VRA Core 4.0 inscriptionSet element
// @java_implements org.dressdiscover.api.models.ElementSet<org.dressdiscover.api.models.inscription.Inscription>
struct InscriptionSet {
	// @validation {"minLength": 1}
	1: list<inscription.Inscription> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
