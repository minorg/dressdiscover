namespace bean_java org.dressdiscover.gui.models.rights
namespace java org.dressdiscover.api.models.rights
namespace * dressdiscover.api.models.rights

include "dressdiscover/api/models/rights/rights_type.thrift"
include "dressdiscover/api/models/vocab_ref.thrift"

// VRA Core 4.0 rights element
// @java_implements org.dressdiscover.api.models.Element
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
