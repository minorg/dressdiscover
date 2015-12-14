namespace bean_java net.lab1318.costume.gui.models.object
namespace java net.lab1318.costume.api.models.object
namespace * costume.api.models.object

include "costume/api/models/model_metadata.thrift"
include "costume/api/models/collection/collection_id.thrift"
include "costume/api/models/institution/institution_id.thrift"
include "costume/api/models/gender/gender.thrift"

// @java_implements org.notaweb.api.models.Model
struct ObjectSummary {
	1: collection_id.CollectionId collection_id;

	2: institution_id.InstitutionId institution_id;

	3: model_metadata.ModelMetadata model_metadata;

	// Dublin Core title
	// @validation {"minLength": 1}
	4: string title;

	// Dublin Core description
	// @validation {"minLength": 1}
	5: optional string description;

	// @validation {"minLength": 1}
	6: optional list<string> agent_name_texts;

	// @validation {"minLength": 1}
	7: optional list<string> categories;

	8: optional gender.Gender gender;

	// @validation {"minLength": 1}
	9: optional list<string> subject_term_texts;

	// @validation {"minLength": 1}
	10: optional list<string> work_type_texts;
}
