namespace bean_java net.lab1318.costume.gui.models.location
namespace java net.lab1318.costume.api.models.location
namespace * costume.api.models.location

include "thryft/native/decimal.thrift"

struct LocationCoordinates {
	1: decimal.Decimal latitude;
	2: decimal.Decimal longitude;
}
