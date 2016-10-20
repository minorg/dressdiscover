namespace bean_java org.dressdiscover.gui.models.textref
namespace java org.dressdiscover.api.models.textref
namespace * dressdiscover.api.models.textref

include "dressdiscover/api/models/textref/textref_name.thrift"
include "dressdiscover/api/models/textref/textref_refid.thrift"

// VRA Core 4.0 textref element
// @java_implements org.dressdiscover.api.models.Element
struct Textref {
	1: textref_name.TextrefName name;

	2: textref_refid.TextrefRefid refid;
}
