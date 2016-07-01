namespace bean_java org.dressdiscover.gui.models.measurements
namespace java org.dressdiscover.api.models.measurements
namespace * costume.api.models.measurements

include "costume/api/models/measurements/measurements.thrift"

// VRA Core 4.0 measurementsSet element
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.measurements.Measurements>
struct MeasurementsSet {
	// @validation {"minLength": 1}
	1: list<measurements.Measurements> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
