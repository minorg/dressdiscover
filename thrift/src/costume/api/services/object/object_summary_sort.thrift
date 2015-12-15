namespace java net.lab1318.costume.api.services.object
namespace * costume.api.services.object

include "costume/api/models/sort_order.thrift"
include "costume/api/services/object/object_summary_sort_field.thrift"

struct ObjectSummarySort {
	object_summary_sort_field.ObjectSummarySortField field;
	sort_order.SortOrder order;
}