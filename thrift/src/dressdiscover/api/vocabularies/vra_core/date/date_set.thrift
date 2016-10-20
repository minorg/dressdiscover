namespace * dressdiscover.api.vocabularies.vra_core.date

include "dressdiscover/api/vocabularies/vra_core/date/date.thrift"

// VRA Core 4.0 dateSet element
// @java_implements org.dressdiscover.api.models.ElementSet<org.dressdiscover.api.models.date.Date>
struct DateSet {
	// @validation {"minLength": 1}
	1: list<date.Date> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
