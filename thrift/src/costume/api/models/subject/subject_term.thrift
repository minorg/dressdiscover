namespace bean_java net.lab1318.costume.gui.models.subject
namespace java net.lab1318.costume.api.models.subject
namespace * costume.api.models.subject

include "costume/api/models/refid.thrift"
include "costume/api/models/vocab.thrift"
include "costume/api/models/subject/subject_term_type.thrift"

// VRA Core 4.0 subject term element
struct SubjectTerm {
	// @validation {"minLength": 1}
	1: string text;

	2: subject_term_type.SubjectTermType type;

	3: optional refid.Refid refid;
	4: optional vocab.Vocab vocab;
}
