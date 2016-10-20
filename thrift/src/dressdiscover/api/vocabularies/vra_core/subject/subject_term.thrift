namespace bean_java org.dressdiscover.gui.models.subject
namespace java org.dressdiscover.api.models.subject
namespace * dressdiscover.api.models.subject

include "dressdiscover/api/models/vocab_ref.thrift"
include "dressdiscover/api/models/subject/subject_term_type.thrift"

// VRA Core 4.0 subject term element
struct SubjectTerm {
	// @validation {"minLength": 1}
	1: string text;

	2: subject_term_type.SubjectTermType type;

	5: optional vocab_ref.VocabRef vocab_ref;
}
