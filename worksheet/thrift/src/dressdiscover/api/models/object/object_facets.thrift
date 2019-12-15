namespace * dressdiscover.api.models.object

include "dressdiscover/api/models/collection/collection_id.thrift"
include "dressdiscover/api/models/institution/institution_id.thrift"
include "dressdiscover/api/vocabularies/costume_core/gender/gender.thrift"

struct ObjectFacets {
	map<string, i32> categories;
	map<collection_id.CollectionId, i32> collections;
	map<string, i32> color_texts;
	map<string, i32> cultural_context_texts;
	map<gender.Gender, i32> genders;
	map<institution_id.InstitutionId, i32> institutions;
	map<string, i32> location_name_texts;
	map<string, i32> material_texts;
	map<string, i32> subject_term_texts;
	map<string, i32> technique_texts;
	map<string, i32> work_type_texts;
}
