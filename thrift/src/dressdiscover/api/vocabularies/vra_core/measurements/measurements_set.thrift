namespace * dressdiscover.api.vocabularies.vra_core.measurements

include "dressdiscover/api/vocabularies/vra_core/measurements/measurements.thrift"

// VRA Core 4.0 measurementsSet element
// @java_implements org.dressdiscover.api.vocabularies.vra_core.ElementSet<org.dressdiscover.api.vocabularies.vra_core.measurements.Measurements>
struct MeasurementsSet {
	// @validation {"minLength": 1}
	1: list<measurements.Measurements> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}