namespace * dressdiscover.api.vocabularies.vra_core.measurements

include "dressdiscover/api/vocabularies/vra_core/measurements/measurements_type.thrift"
include "dressdiscover/api/vocabularies/vra_core/measurements/measurements_unit.thrift"

// VRA Core 4.0 measurements element
// @java_implements org.dressdiscover.api.vocabularies.vra_core.Element
struct Measurements {
	// @validation {"minLength": 1}
	1: string text;

	2: measurements_type.MeasurementsType type;

	// @validation {"minLength": 1}
	3: optional string extent;

	4: optional measurements_unit.MeasurementsUnit unit;
}