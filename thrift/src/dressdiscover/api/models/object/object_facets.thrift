namespace java org.dressdiscover.api.models.object
namespace * dressdiscover.api.models.object

include "costume/api/models/collection/collection_id.thrift"
include "costume/api/models/gender/gender.thrift"
include "costume/api/models/institution/institution_id.thrift"
include "thryft/native/u32.thrift"

struct ObjectFacets {
	map<string, u32.u32> categories;
	map<collection_id.CollectionId, u32.u32> collections;
	map<string, u32.u32> color_texts;
	map<string, u32.u32> cultural_context_texts;
	map<gender.Gender, u32.u32> genders;
	map<institution_id.InstitutionId, u32.u32> institutions;
	map<string, u32.u32> location_name_texts;
	map<string, u32.u32> material_texts;
	map<string, u32.u32> subject_term_texts;
	map<string, u32.u32> technique_texts;
	map<string, u32.u32> work_type_texts;
}
