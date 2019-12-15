namespace * dressdiscover.api.vocabularies.vra_core.inscription

include "dressdiscover/api/vocabularies/vra_core/inscription/inscription.thrift"

// VRA Core 4.0 inscriptionSet element
// @java_implements org.dressdiscover.api.vocabularies.vra_core.ElementSet<org.dressdiscover.api.vocabularies.vra_core.inscription.Inscription>
struct InscriptionSet {
	// @validation {"minLength": 1}
	1: list<inscription.Inscription> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
