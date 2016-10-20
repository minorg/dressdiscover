namespace * dressdiscover.api.vocabularies.vra_core.title

include "dressdiscover/api/vocabularies/vra_core/title/title_type.thrift"

// VRA Core 4.0 title element
// @java_implements org.dressdiscover.api.vocabularies.vra_core.Element
struct Title {
	// @validation {"minLength": 1}
	1: string text;

	2: title_type.TitleType type;

	// @validation {"acceptance": true}
	3: optional bool pref;
}
