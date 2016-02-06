namespace bean_java net.lab1318.costume.gui.models.rights
namespace java net.lab1318.costume.api.models.rights
namespace * costume.api.models.rights

include "costume/api/models/rights/rights_type.thrift"
include "costume/api/models/vocab_ref.thrift"

// VRA Core 4.0 rights element
// @java_implements net.lab1318.costume.api.models.Element
struct Rights {
	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	2: string text;

	3: rights_type.RightsType type;

	5: optional vocab_ref.VocabRef license_vocab_ref;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	4: optional string notes;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	1: optional string rights_holder;
}
