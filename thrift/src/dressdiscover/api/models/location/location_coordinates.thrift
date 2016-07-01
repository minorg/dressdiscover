namespace bean_java org.dressdiscover.gui.models.location
namespace java org.dressdiscover.api.models.location
namespace * costume.api.models.location

include "thryft/native/decimal.thrift"

struct LocationCoordinates {
	1: decimal.Decimal latitude;
	2: decimal.Decimal longitude;
}
