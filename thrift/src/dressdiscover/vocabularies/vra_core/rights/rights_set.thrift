namespace * dressdiscover.vocabularies.vra_core.rights

include "dressdiscover/api/models/rights/rights.thrift"

// VRA Core 4.0 rightsSet element
// @java_implements org.dressdiscover.api.models.ElementSet<org.dressdiscover.api.models.rights.Rights>
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
