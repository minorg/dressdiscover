namespace java net.lab1318.costume.api.services.object
namespace * costume.api.services.object

include "costume/api/models/object/object_facets.thrift"
include "costume/api/models/object/object_summary_entry.thrift"
include "thryft/native/u32.thrift"

struct GetObjectSummariesResult {
	list<object_summary_entry.ObjectSummaryEntry> hits;
	u32.u32 total_hits;

	optional object_facets.ObjectFacets facets;
}
