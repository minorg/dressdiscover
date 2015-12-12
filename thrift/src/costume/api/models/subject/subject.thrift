namespace bean_java net.lab1318.costume.gui.models.subject
namespace java net.lab1318.costume.api.models.subject
namespace * costume.api.models.subject

include "costume/api/models/subject/subject_term.thrift"

// VRA Core 4.0 subject element
// @java_implements net.lab1318.costume.api.models.Element
struct Subject {
	// @validation {"minLength": 1}
	1: list<subject_term.SubjectTerm> terms;
}
