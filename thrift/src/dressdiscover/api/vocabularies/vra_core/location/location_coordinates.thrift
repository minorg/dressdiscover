namespace * dressdiscover.api.vocabularies.vra_core.location

include "thryft/native/decimal.thrift"

struct LocationCoordinates {
	1: decimal.Decimal latitude;
	2: decimal.Decimal longitude;
}
