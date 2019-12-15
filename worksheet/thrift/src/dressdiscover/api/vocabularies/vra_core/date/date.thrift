namespace * dressdiscover.api.vocabularies.vra_core.date

include "dressdiscover/api/vocabularies/vra_core/date/date_bound.thrift"
include "dressdiscover/api/vocabularies/vra_core/date/date_type.thrift"
include "thryft/native/url.thrift"

// VRA Core 4.0 date element
// @java_implements org.dressdiscover.api.vocabularies.vra_core.Element
struct Date {
	1: date_bound.DateBound earliest_date;

	2: date_bound.DateBound latest_date;

	3: date_type.DateType type;

	4: optional url.Url href;

	// @validation {"minLength": 1}
	5: optional string source;
}
