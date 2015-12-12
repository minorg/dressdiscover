namespace bean_java net.lab1318.costume.gui.models.work_type
namespace java net.lab1318.costume.api.models.work_type
namespace * costume.api.models.work_type

include "costume/api/models/work_type/work_type.thrift"

// VRA Core 4.0 workTypeSet element
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.work_type.WorkType>
struct WorkTypeSet {
	// @validation {"minLength": 1}
	1: list<work_type.WorkType> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
