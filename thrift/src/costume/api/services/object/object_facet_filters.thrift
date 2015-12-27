namespace java net.lab1318.costume.api.services.object
namespace * costume.api.services.object

include "costume/api/models/collection/collection_id.thrift"
include "costume/api/models/gender/gender.thrift"
include "costume/api/models/institution/institution_id.thrift"

struct ObjectFacetFilters {
	// @validation {"minLength": 1}
	optional set<string> exclude_agent_name_texts;

	// @validation {"acceptance": true}
	optional bool exclude_all;

	// @validation {"minLength": 1}
	optional set<string> exclude_categories;

	// @validation {"minLength": 1}
	optional set<collection_id.CollectionId> exclude_collections;

	// @validation {"minLength": 1}
	optional set<gender.Gender> exclude_genders;

	// @validation {"minLength": 1}
	optional set<institution_id.InstitutionId> exclude_institutions;

	// @validation {"minLength": 1}
	optional set<string> exclude_material_texts;

	// true = exclude missing
	// absent = include missing
	// @validation {"acceptance": true}
	optional bool exclude_missing_agent_name_texts;

	// @validation {"acceptance": true}
	optional bool exclude_missing_categories;

	// @validation {"acceptance": true}
	optional bool exclude_missing_genders;

	// @validation {"acceptance": true}
	optional bool exclude_missing_material_texts;

	// @validation {"acceptance": true}
	optional bool exclude_missing_subject_term_texts;

	// @validation {"acceptance": true}
	optional bool exclude_missing_technique_texts;

	// @validation {"acceptance": true}
	optional bool exclude_missing_work_type_texts;

	// @validation {"minLength": 1}
	optional set<string> exclude_subject_term_texts;

	// @validation {"minLength": 1}
	optional set<string> exclude_technique_texts;

	// @validation {"minLength": 1}
	optional set<string> exclude_work_type_texts;

	// @validation {"minLength": 1}
	optional set<string> include_agent_name_texts;

	// @validation {"minLength": 1}
	optional set<string> include_categories;

	// @validation {"minLength": 1}
	optional set<collection_id.CollectionId> include_collections;

	// @validation {"minLength": 1}
	optional set<gender.Gender> include_genders;

	// @validation {"minLength": 1}
	optional set<institution_id.InstitutionId> include_institutions;

	// @validation {"minLength": 1}
	optional set<string> include_material_texts;

	// @validation {"minLength": 1}
	optional set<string> include_subject_term_texts;

	// @validation {"minLength": 1}
	optional set<string> include_technique_texts;

	// @validation {"minLength": 1}
	optional set<string> include_work_type_texts;
}
