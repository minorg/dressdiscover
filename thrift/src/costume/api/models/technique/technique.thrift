namespace bean_java net.lab1318.costume.gui.models.technique
namespace java net.lab1318.costume.api.models.technique
namespace * costume.api.models.technique

include "costume/api/models/refid.thrift"
include "costume/api/models/vocab.thrift"

// VRA Core 4.0 technique element
struct Technique {
	// @validation {"minLength": 1}
	1: string title;

	2: optional refid.Refid refid;
	3: optional vocab.Vocab vocab;
}
