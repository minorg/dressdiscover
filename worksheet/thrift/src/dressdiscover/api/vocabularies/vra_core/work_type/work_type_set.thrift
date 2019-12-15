namespace * dressdiscover.api.vocabularies.vra_core.work_type

include "dressdiscover/api/vocabularies/vra_core/work_type/work_type.thrift"

// VRA Core 4.0 workTypeSet element
// @java_implements org.dressdiscover.api.vocabularies.vra_core.ElementSet<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkType>
struct WorkTypeSet {
	// @validation {"minLength": 1}
	1: list<work_type.WorkType> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
