namespace bean_java net.lab1318.costume.gui.models.rights
namespace java net.lab1318.costume.api.models.rights
namespace * costume.api.models.rights

include "costume/api/models/rights/rights_type.thrift"

// VRA Core 4.0 rights element
// @java_implements net.lab1318.costume.api.models.Element
struct Rights {
	// @validation {"minLength": 1}
	1: string rights_holder;

	// @validation {"minLength": 1}
	2: string text;

	3: rights_type.RightsType type;

	// @validation {"minLength": 1}
	4: optional string notes;
}
