namespace bean_java net.lab1318.costume.gui.models.title
namespace java net.lab1318.costume.api.models.title
namespace * costume.api.models.title

include "costume/api/models/title/title_type.thrift"

// VRA Core 4.0 title element
// @java_implements net.lab1318.costume.api.models.Element
struct Title {
	// @validation {"minLength": 1}
	1: string text;

	2: title_type.TitleType type;

	// @validation {"acceptance": true}
	3: optional bool pref;
}
