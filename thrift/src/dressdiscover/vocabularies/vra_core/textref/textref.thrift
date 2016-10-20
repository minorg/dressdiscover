namespace * dressdiscover.vocabularies.vra_core.textref

include "dressdiscover/vocabularies/vra_core/textref/textref_name.thrift"
include "dressdiscover/vocabularies/vra_core/textref/textref_refid.thrift"

// VRA Core 4.0 textref element
// @java_implements org.dressdiscover.api.models.Element
struct Textref {
	1: textref_name.TextrefName name;

	2: textref_refid.TextrefRefid refid;
}
