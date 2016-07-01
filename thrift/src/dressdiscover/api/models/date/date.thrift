namespace bean_java org.dressdiscover.gui.models.date
namespace java org.dressdiscover.api.models.date
namespace * dressdiscover.api.models.date

include "costume/api/models/date/date_bound.thrift"
include "costume/api/models/date/date_type.thrift"
include "thryft/native/url.thrift"

// VRA Core 4.0 date element
// @java_implements net.lab1318.costume.api.models.Element
struct Date {
	1: date_bound.DateBound earliest_date;

	2: date_bound.DateBound latest_date;

	3: date_type.DateType type;

	4: optional url.Url href;

	// @validation {"minLength": 1}
	5: optional string source;
}
