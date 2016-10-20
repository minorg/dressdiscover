namespace * dressdiscover.vocabularies.vra_core.inscription

include "dressdiscover/vocabularies/vra_core/inscription/inscription_text_type.thrift"

struct InscriptionText {
	// @validation {"minLength": 1}
	2: string text;

	1: inscription_text_type.InscriptionTextType type;

	// @validation {"minLength": 2, "maxLength": 3}
	3: optional string lang;
}
