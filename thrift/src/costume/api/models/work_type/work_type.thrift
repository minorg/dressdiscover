namespace bean_java net.lab1318.costume.gui.models.work_type
namespace java net.lab1318.costume.api.models.work_type
namespace * costume.api.models.work_type

include "costume/api/models/vocab_ref.thrift"

// VRA Core 4.0 workType element
// @java_implements net.lab1318.costume.api.models.Element
struct WorkType {
	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	1: string text;

	2: optional vocab_ref.VocabRef vocab_ref;
}
