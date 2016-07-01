namespace bean_java org.dressdiscover.gui.models.rights
namespace java org.dressdiscover.api.models.rights
namespace * dressdiscover.api.models.rights

include "costume/api/models/rights/rights.thrift"

// VRA Core 4.0 rightsSet element
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.rights.Rights>
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