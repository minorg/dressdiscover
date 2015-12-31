namespace bean_java net.lab1318.costume.gui.models.cultural_context
namespace java net.lab1318.costume.api.models.cultural_context
namespace * costume.api.models.cultural_context

include "costume/api/models/cultural_context/cultural_context.thrift"

// VRA Core 4.0 culturalContextSet element
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.cultural_context.CulturalContext>
struct CulturalContextSet {
	// @validation {"minLength": 1}
	1: list<cultural_context.CulturalContext> elements;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	2: optional string display;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	3: optional string notes;
}
