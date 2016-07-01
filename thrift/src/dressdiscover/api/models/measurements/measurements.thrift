namespace bean_java org.dressdiscover.gui.models.measurements
namespace java org.dressdiscover.api.models.measurements
namespace * costume.api.models.measurements

include "costume/api/models/measurements/measurements_type.thrift"
include "costume/api/models/measurements/measurements_unit.thrift"

// VRA Core 4.0 measurements element
// @java_implements net.lab1318.costume.api.models.Element
struct Measurements {
	// @validation {"minLength": 1}
	1: string text;

	2: measurements_type.MeasurementsType type;

	// @validation {"minLength": 1}
	3: optional string extent;

	4: optional measurements_unit.MeasurementsUnit unit;
}
