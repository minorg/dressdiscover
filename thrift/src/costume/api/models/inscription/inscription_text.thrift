namespace bean_java net.lab1318.costume.gui.models.inscription
namespace java net.lab1318.costume.api.models.inscription
namespace * costume.api.models.inscription

include "costume/api/models/inscription/inscription_text_type.thrift"

struct InscriptionText {
	1: inscription_text_type.InscriptionTextType type;
	2: string value;

	// @validation {"minLength": 2, "maxLength": 3}
	3: optional string lang;
}
