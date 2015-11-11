namespace bean_java net.lab1318.costume.gui.models.subject
namespace java net.lab1318.costume.api.models.subject
namespace * costume.api.models.subject

include "costume/api/models/subject/subject.thrift"

// VRA Core 4.0 subjectSet element
struct SubjectSet {
	// @validation {"minLength": 1}
	1: list<subject.Subject> subjects;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
