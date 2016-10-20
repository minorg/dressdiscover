namespace * dressdiscover.api.vocabularies.vra_core.subject

include "dressdiscover/api/vocabularies/vra_core/subject/subject_term.thrift"

// VRA Core 4.0 subject element
// @java_implements org.dressdiscover.api.vocabularies.vra_core.Element
struct Subject {
	// @validation {"minLength": 1}
	1: list<subject_term.SubjectTerm> terms;
}
