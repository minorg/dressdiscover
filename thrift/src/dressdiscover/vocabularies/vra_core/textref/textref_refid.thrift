namespace * dressdiscover.api.models.textref

include "dressdiscover/api/models/textref/textref_refid_type.thrift"
include "thryft/native/url.thrift"

// VRA Core 4.0 textref.refid subelement
struct TextrefRefid {
	// @validation {"minLength": 1}
	1: string text;

	2: textref_refid_type.TextrefRefidType type;

	3: optional url.Url href;
}
