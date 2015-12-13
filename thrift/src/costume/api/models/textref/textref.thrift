namespace bean_java net.lab1318.costume.gui.models.textref
namespace java net.lab1318.costume.api.models.textref
namespace * costume.api.models.textref

include "costume/api/models/textref/textref_name.thrift"
include "costume/api/models/textref/textref_refid.thrift"

// VRA Core 4.0 textref element
// @java_implements net.lab1318.costume.api.models.Element
struct Textref {
	1: textref_name.TextrefName name;

	2: textref_refid.TextrefRefid refid;
}
