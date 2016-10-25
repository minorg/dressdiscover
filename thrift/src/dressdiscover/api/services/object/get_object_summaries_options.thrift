namespace * dressdiscover.api.services.object

include "dressdiscover/api/services/object/object_summary_sort.thrift"

struct GetObjectSummariesOptions {
	optional i32 from_;

	// @validation {"acceptance": true}
	optional bool include_facets;

	optional i32 size;

	// @validation {"minLength": 1}
	optional list<object_summary_sort.ObjectSummarySort> sorts;
}
