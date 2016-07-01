namespace bean_java org.dressdiscover.gui.models.subject
namespace java org.dressdiscover.api.models.subject
namespace * dressdiscover.api.models.subject

include "costume/api/models/subject/subject_term.thrift"

// VRA Core 4.0 subject element
// @java_implements net.lab1318.costume.api.models.Element
struct Subject {
	// @validation {"minLength": 1}
	1: list<subject_term.SubjectTerm> terms;
}
