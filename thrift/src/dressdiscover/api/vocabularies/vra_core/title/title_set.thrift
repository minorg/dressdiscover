namespace * dressdiscover.api.vocabularies.vra_core.title

include "dressdiscover/api/vocabularies/vra_core/title/title.thrift"

// VRA Core 4.0 titleSet element
// @java_implements org.dressdiscover.api.models.ElementSet<org.dressdiscover.api.models.title.Title>
struct TitleSet {
	// @validation {"minLength": 1}
	1: list<title.Title> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
