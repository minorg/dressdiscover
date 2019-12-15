namespace * dressdiscover.api.services.object

include "dressdiscover/api/models/object/object_facets.thrift"
include "dressdiscover/api/models/object/object_summary_entry.thrift"

struct GetObjectSummariesResult {
	list<object_summary_entry.ObjectSummaryEntry> hits;
	i32 total_hits;

	optional object_facets.ObjectFacets facets;
}
