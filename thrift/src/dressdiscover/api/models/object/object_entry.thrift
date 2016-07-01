namespace bean_java org.dressdiscover.gui.models.object
namespace java org.dressdiscover.api.models.object
namespace * dressdiscover.api.models.object

include "dressdiscover/api/models/object/object.thrift"
include "dressdiscover/api/models/object/object_id.thrift"

// @java_implements org.thryft.waf.api.models.ModelEntry<org.dressdiscover.api.models.object.Object, org.dressdiscover.api.models.object.ObjectId>
struct ObjectEntry {
	object_id.ObjectId id;
	object.Object model;
}
