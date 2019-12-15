namespace * dressdiscover.api.vocabularies.vra_core.rights

include "dressdiscover/api/vocabularies/vra_core/rights/rights.thrift"

// VRA Core 4.0 rightsSet element
// @java_implements org.dressdiscover.api.vocabularies.vra_core.ElementSet<org.dressdiscover.api.vocabularies.vra_core.rights.Rights>
struct RightsSet {
	// @validation {"minLength": 1}
	1: list<rights.Rights> elements;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	2: optional string display;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	3: optional string notes;
}
