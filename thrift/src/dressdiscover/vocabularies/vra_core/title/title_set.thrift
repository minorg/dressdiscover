namespace * dressdiscover.api.models.title

include "dressdiscover/api/models/title/title.thrift"

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
