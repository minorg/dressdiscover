namespace bean_java net.lab1318.costume.gui.models.inscription
namespace java net.lab1318.costume.api.models.inscription
namespace * costume.api.models.inscription

include "costume/api/models/inscription/inscription.thrift"

// VRA Core 4.0 inscriptionSet element
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.inscription.Inscription>
struct InscriptionSet {
	// @validation {"minLength": 1}
	1: list<inscription.Inscription> elements;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	2: optional string display;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	3: optional string notes;
}
