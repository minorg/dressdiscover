namespace bean_java org.dressdiscover.gui.models.description
namespace java org.dressdiscover.api.models.description
namespace * dressdiscover.api.models.description

include "costume/api/models/description/description_type.thrift"

// VRA Core 4.0 description element
// @java_implements net.lab1318.costume.api.models.Element
struct Description {
	// @validation {"minLength": 1}
	1: string text;

	// @validation {"minLength": 1}
	2: optional string source;

	3: optional description_type.DescriptionType type;
}
