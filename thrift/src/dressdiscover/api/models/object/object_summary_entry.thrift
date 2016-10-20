namespace * dressdiscover.api.models.object

include "dressdiscover/api/models/object/object_summary.thrift"
include "dressdiscover/api/models/object/object_id.thrift"

// @java_implements org.thryft.waf.api.models.ModelEntry<org.dressdiscover.api.models.object.ObjectSummary, org.dressdiscover.api.models.object.ObjectId>
struct ObjectSummaryEntry {
	object_id.ObjectId id;
	object_summary.ObjectSummary model;
}
