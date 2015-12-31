namespace bean_java net.lab1318.costume.gui.models.description
namespace java net.lab1318.costume.api.models.description
namespace * costume.api.models.description

include "costume/api/models/description/description.thrift"

// VRA Core 4.0 descriptionSet element
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.description.Description>
struct DescriptionSet {
	// @validation {"minLength": 1}
	1: list<description.Description> elements;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	2: optional string display;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	3: optional string notes;
}
