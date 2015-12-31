namespace bean_java net.lab1318.costume.gui.models.date
namespace java net.lab1318.costume.api.models.date
namespace * costume.api.models.date

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

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	5: optional string source;
}
