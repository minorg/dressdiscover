namespace java net.lab1318.costume.api.models.object
namespace * costume.api.models.object

include "costume/api/models/collection/collection_id.thrift"
include "costume/api/models/institution/institution_id.thrift"

struct ObjectFilters {
	// @validation {"minLength": 1}
	optional set<string> exclude_agent_name_texts;

	// @validation {"minLength": 1}
	optional set<string> exclude_categories;

	// @validation {"minLength": 1}
	optional set<collection_id.CollectionId> exclude_collection_ids;

	// @validation {"minLength": 1}
	optional set<institution_id.InstitutionId> exclude_institution_ids;

	// @validation {"minLength": 1}
	optional set<string> exclude_subject_term_texts;

	// @validation {"minLength": 1}
	optional set<string> include_agent_name_texts;

	// @validation {"minLength": 1}
	optional set<string> include_categories;

	// @validation {"minLength": 1}
	optional set<collection_id.CollectionId> include_collection_ids;

	// @validation {"minLength": 1}
	optional set<institution_id.InstitutionId> include_institution_ids;

	// @validation {"minLength": 1}
	optional set<string> include_subject_term_texts;
}
