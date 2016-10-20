namespace * dressdiscover.api.vocabularies.vra_core.subject

include "dressdiscover/api/vocabularies/vra_core/subject/subject_term_type.thrift"
include "dressdiscover/api/vocabularies/vra_core/vocab_ref.thrift"

// VRA Core 4.0 subject term element
struct SubjectTerm {
	// @validation {"minLength": 1}
	1: string text;

	2: subject_term_type.SubjectTermType type;

	5: optional vocab_ref.VocabRef vocab_ref;
}
