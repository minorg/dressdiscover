namespace bean_java net.lab1318.costume.gui.models.object
namespace java net.lab1318.costume.api.models.object
namespace * costume.api.models.object

include "costume/api/models/object/object_summary.thrift"
include "costume/api/models/object/object_id.thrift"

// @java_implements org.thryft.waf.api.models.ModelEntry<net.lab1318.costume.api.models.object.ObjectSummary, net.lab1318.costume.api.models.object.ObjectId>
struct ObjectSummaryEntry {
	object_id.ObjectId id;
	object_summary.ObjectSummary model;
}
