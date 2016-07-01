namespace bean_java org.dressdiscover.gui.models.date
namespace java org.dressdiscover.api.models.date
namespace * costume.api.models.date

include "costume/api/models/date/date.thrift"

// VRA Core 4.0 dateSet element
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.date.Date>
struct DateSet {
	// @validation {"minLength": 1}
	1: list<date.Date> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
