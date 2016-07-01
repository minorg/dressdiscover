namespace bean_java org.dressdiscover.gui.models.technique
namespace java org.dressdiscover.api.models.technique
namespace * costume.api.models.technique

include "costume/api/models/technique/technique.thrift"

// VRA Core 4.0 techniqueSet element
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.technique.Technique>
struct TechniqueSet {
	// @validation {"minLength": 1}
	1: list<technique.Technique> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
