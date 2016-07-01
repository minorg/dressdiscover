namespace bean_java org.dressdiscover.gui.models.date
namespace java org.dressdiscover.api.models.date
namespace * dressdiscover.api.models.date

include "costume/api/models/date/date_time_granularity.thrift"
include "thryft/native/date_time.thrift"

// VRA Core 4.0 date earliestDate or latestDate subelement
struct DateBound {
	// @validation {"minLength": 1}
	1: string text;

	2: optional bool circa;

	3: optional date_time.DateTime parsed_date_time;

	4: optional date_time_granularity.DateTimeGranularity parsed_date_time_granularity;
}
