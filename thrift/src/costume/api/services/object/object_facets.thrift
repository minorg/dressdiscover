namespace java net.lab1318.costume.api.services.object
namespace * costume.api.services.object

include "costume/api/models/collection/collection_id.thrift"
include "costume/api/models/institution/institution_id.thrift"
include "thryft/native/u32.thrift"

struct ObjectFacets {
	map<collection_id.CollectionId, u32.u32> collection_hits;
	map<institution_id.InstitutionId, u32.u32> institution_hits;
	map<string, u32.u32> subject_term_texts;
}
