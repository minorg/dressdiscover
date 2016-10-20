namespace bean_java org.dressdiscover.gui.models.subject
namespace java org.dressdiscover.api.models.subject
namespace * dressdiscover.api.models.subject

include "dressdiscover/api/models/subject/subject.thrift"

// VRA Core 4.0 subjectSet element
// @java_implements org.dressdiscover.api.models.ElementSet<org.dressdiscover.api.models.subject.Subject>
struct SubjectSet {
	// @validation {"minLength": 1}
	1: list<subject.Subject> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
