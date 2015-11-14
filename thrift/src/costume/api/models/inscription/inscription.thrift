namespace bean_java net.lab1318.costume.gui.models.inscription
namespace java net.lab1318.costume.api.models.inscription
namespace * costume.api.models.inscription

include "costume/api/models/inscription/inscription_author.thrift"
include "costume/api/models/inscription/inscription_text.thrift"

// VRA Core 4.0 inscription element
struct Inscription {
	// @validation {"minLength": 1}
	1: list<inscription_text.InscriptionText> texts;

	2: optional inscription_author.InscriptionAuthor author;

	// @validation {"minLength": 1}
	3: optional string position;
}