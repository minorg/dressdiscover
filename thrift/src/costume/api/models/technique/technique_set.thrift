namespace bean_java net.lab1318.costume.gui.models.technique
namespace java net.lab1318.costume.api.models.technique
namespace * costume.api.models.technique

include "costume/api/models/technique/technique.thrift"

// VRA Core 4.0 techniqueSet element
struct TechniqueSet {
	// @validation {"minLength": 1}
	1: list<technique.Technique> techniques;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
