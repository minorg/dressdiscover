namespace java net.lab1318.costume.api.services.object
namespace * costume.api.services.object

include "costume/api/models/collection/collection_id.thrift"
include "costume/api/models/institution/institution_id.thrift"
include "costume/api/models/object/object_entry.thrift"
include "thryft/native/u32.thrift"

struct GetObjectsResult {
	map<collection_id.CollectionId, u32.u32> collection_hits;
	map<institution_id.InstitutionId, u32.u32> institution_hits;
	list<object_entry.ObjectEntry> objects;
	u32.u32 total_hits;
}
