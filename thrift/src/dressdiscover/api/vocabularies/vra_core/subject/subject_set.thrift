namespace * dressdiscover.api.vocabularies.vra_core.subject

include "dressdiscover/api/vocabularies/vra_core/subject/subject.thrift"

// VRA Core 4.0 subjectSet element
// @java_implements org.dressdiscover.api.vocabularies.vra_core.ElementSet<org.dressdiscover.api.vocabularies.vra_core.subject.Subject>
struct SubjectSet {
	// @validation {"minLength": 1}
	1: list<subject.Subject> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}