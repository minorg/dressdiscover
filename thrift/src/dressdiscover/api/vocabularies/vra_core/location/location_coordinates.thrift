namespace * dressdiscover.api.vocabularies.vra_core.location

include "thryft/native/big_decimal.thrift"

struct LocationCoordinates {
	1: big_decimal.BigDecimal latitude;
	2: big_decimal.BigDecimal longitude;
}
