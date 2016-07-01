namespace java org.dressdiscover.api.services.object
namespace * dressdiscover.api.services.object

include "dressdiscover/api/models/object/object_facets.thrift"
include "dressdiscover/api/models/object/object_summary_entry.thrift"
include "thryft/native/u32.thrift"

struct GetObjectSummariesResult {
	list<object_summary_entry.ObjectSummaryEntry> hits;
	u32.u32 total_hits;

	optional object_facets.ObjectFacets facets;
}
