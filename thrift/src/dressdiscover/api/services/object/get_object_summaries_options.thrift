namespace java org.dressdiscover.api.services.object
namespace * dressdiscover.api.services.object

include "dressdiscover/api/services/object/object_summary_sort.thrift"
include "thryft/native/u32.thrift"

struct GetObjectSummariesOptions {
	optional u32.u32 from_;

	// @validation {"acceptance": true}
	optional bool include_facets;

	optional u32.u32 size;

	// @validation {"minLength": 1}
	optional list<object_summary_sort.ObjectSummarySort> sorts;
}
