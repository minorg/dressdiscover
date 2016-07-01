namespace bean_java org.dressdiscover.gui.models.work_type
namespace java org.dressdiscover.api.models.work_type
namespace * dressdiscover.api.models.work_type

include "dressdiscover/api/models/vocab_ref.thrift"

// VRA Core 4.0 workType element
// @java_implements org.dressdiscover.api.models.Element
struct WorkType {
	// @validation {"minLength": 1}
	1: string text;

	2: optional vocab_ref.VocabRef vocab_ref;
}
