namespace * dressdiscover.vocabularies.vra_core.measurements

include "dressdiscover/vocabularies/vra_core/measurements/measurements.thrift"

// VRA Core 4.0 measurementsSet element
// @java_implements org.dressdiscover.api.models.ElementSet<org.dressdiscover.api.models.measurements.Measurements>
struct MeasurementsSet {
	// @validation {"minLength": 1}
	1: list<measurements.Measurements> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
