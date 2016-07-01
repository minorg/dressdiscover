namespace bean_java org.dressdiscover.gui.models.inscription
namespace java org.dressdiscover.api.models.inscription
namespace * costume.api.models.inscription

include "costume/api/models/inscription/inscription_text_type.thrift"

struct InscriptionText {
	// @validation {"minLength": 1}
	2: string text;

	1: inscription_text_type.InscriptionTextType type;

	// @validation {"minLength": 2, "maxLength": 3}
	3: optional string lang;
}
