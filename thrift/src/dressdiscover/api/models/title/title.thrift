namespace bean_java org.dressdiscover.gui.models.title
namespace java org.dressdiscover.api.models.title
namespace * dressdiscover.api.models.title

include "dressdiscover/api/models/title/title_type.thrift"

// VRA Core 4.0 title element
// @java_implements net.lab1318.costume.api.models.Element
struct Title {
	// @validation {"minLength": 1}
	1: string text;

	2: title_type.TitleType type;

	// @validation {"acceptance": true}
	3: optional bool pref;
}
