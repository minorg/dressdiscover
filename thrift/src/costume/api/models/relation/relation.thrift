namespace bean_java net.lab1318.costume.gui.models.relation
namespace java net.lab1318.costume.api.models.relation
namespace * costume.api.models.relation

include "costume/api/models/object/object_id.thrift"
include "costume/api/models/relation/relation_type.thrift"
include "thryft/native/url.thrift"

// VRA Core 4.0 relation element
// @java_implements net.lab1318.costume.api.models.Element
struct Relation {
	1: relation_type.RelationType type;

	2: optional url.Url href;

	// @validation {"minLength": 1}
	3: optional set<object_id.ObjectId> relids;

	// @validation {"minLength": 1}
	4: optional string text;
}
