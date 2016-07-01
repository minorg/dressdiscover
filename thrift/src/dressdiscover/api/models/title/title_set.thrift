namespace bean_java org.dressdiscover.gui.models.title
namespace java org.dressdiscover.api.models.title
namespace * dressdiscover.api.models.title

include "costume/api/models/title/title.thrift"

// VRA Core 4.0 titleSet element
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.title.Title>
struct TitleSet {
	// @validation {"minLength": 1}
	1: list<title.Title> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}