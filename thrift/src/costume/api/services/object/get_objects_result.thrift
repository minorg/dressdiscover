namespace java net.lab1318.costume.api.services.object
namespace * costume.api.services.object

include "costume/api/models/object/object_entry.thrift"
include "thryft/native/u32.thrift"

struct GetObjectsResult {
	list<object_entry.ObjectEntry> objects;
	u32.u32 total_hits;
}
