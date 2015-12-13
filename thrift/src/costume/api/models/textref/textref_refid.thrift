namespace bean_java net.lab1318.costume.gui.models.textref
namespace java net.lab1318.costume.api.models.textref
namespace * costume.api.models.textref

include "costume/api/models/textref/textref_refid_type.thrift"
include "thryft/native/url.thrift"

// VRA Core 4.0 textref.refid subelement
struct TextrefRefid {
	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	1: string text;

	2: textref_refid_type.TextrefRefidType type;

	3: optional url.Url href;
}
