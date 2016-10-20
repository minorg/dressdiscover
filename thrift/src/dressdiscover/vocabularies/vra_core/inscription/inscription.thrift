namespace * dressdiscover.vocabularies.vra_core.inscription

include "dressdiscover/api/models/inscription/inscription_author.thrift"
include "dressdiscover/api/models/inscription/inscription_text.thrift"

// VRA Core 4.0 inscription element
// @java_implements org.dressdiscover.api.models.Element
struct Inscription {
	// @validation {"minLength": 1}
	1: list<inscription_text.InscriptionText> texts;

	2: optional inscription_author.InscriptionAuthor author;

	// @validation {"minLength": 1}
	3: optional string position;
}
