namespace bean_java org.dressdiscover.gui.models.cultural_context
namespace java org.dressdiscover.api.models.cultural_context
namespace * dressdiscover.api.models.cultural_context

include "dressdiscover/api/models/cultural_context/cultural_context.thrift"

// VRA Core 4.0 culturalContextSet element
// @java_implements org.dressdiscover.api.models.ElementSet<org.dressdiscover.api.models.cultural_context.CulturalContext>
struct CulturalContextSet {
	// @validation {"minLength": 1}
	1: list<cultural_context.CulturalContext> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
