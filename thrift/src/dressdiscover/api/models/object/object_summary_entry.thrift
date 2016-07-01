namespace bean_java org.dressdiscover.gui.models.object
namespace java org.dressdiscover.api.models.object
namespace * dressdiscover.api.models.object

include "dressdiscover/api/models/object/object_summary.thrift"
include "dressdiscover/api/models/object/object_id.thrift"

// @java_implements org.thryft.waf.api.models.ModelEntry<net.lab1318.costume.api.models.object.ObjectSummary, net.lab1318.costume.api.models.object.ObjectId>
struct ObjectSummaryEntry {
	object_id.ObjectId id;
	object_summary.ObjectSummary model;
}
