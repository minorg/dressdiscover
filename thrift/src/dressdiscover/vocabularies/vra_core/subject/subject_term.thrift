namespace * dressdiscover.vocabularies.vra_core.subject

include "dressdiscover/vocabularies/vra_core/vocab_ref.thrift"
include "dressdiscover/api/models/subject/subject_term_type.thrift"

// VRA Core 4.0 subject term element
struct SubjectTerm {
	// @validation {"minLength": 1}
	1: string text;

	2: subject_term_type.SubjectTermType type;

	5: optional vocab_ref.VocabRef vocab_ref;
}
