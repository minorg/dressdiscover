namespace bean_java org.dressdiscover.gui.models.description
namespace java org.dressdiscover.api.models.description
namespace * costume.api.models.description

include "costume/api/models/description/description.thrift"

// VRA Core 4.0 descriptionSet element
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.description.Description>
struct DescriptionSet {
	// @validation {"minLength": 1}
	1: list<description.Description> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
