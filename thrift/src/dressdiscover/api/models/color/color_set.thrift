namespace bean_java org.dressdiscover.gui.models.color
namespace java org.dressdiscover.api.models.color
namespace * dressdiscover.api.models.color

include "dressdiscover/api/models/color/color.thrift"

// Costume Core colorSet element
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.color.Color>
struct ColorSet {
	// @validation {"minLength": 1}
	1: list<color.Color> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
