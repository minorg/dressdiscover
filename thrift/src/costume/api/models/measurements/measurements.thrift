namespace bean_java net.lab1318.costume.gui.models.measurements
namespace java net.lab1318.costume.api.models.measurements
namespace * costume.api.models.measurements

include "costume/api/models/measurements/measurements_type.thrift"
include "costume/api/models/measurements/measurements_unit.thrift"

// VRA Core 4.0 measurements element
// @java_implements net.lab1318.costume.api.models.Element
struct Measurements {
	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	1: string text;

	2: measurements_type.MeasurementsType type;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	3: optional string extent;

	4: optional measurements_unit.MeasurementsUnit unit;
}
