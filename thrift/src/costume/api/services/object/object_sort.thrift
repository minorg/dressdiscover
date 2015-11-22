namespace java net.lab1318.costume.api.services.object
namespace * costume.api.services.object

include "costume/api/models/sort_order.thrift"
include "costume/api/services/object/object_sort_field.thrift"

struct ObjectSort {
	object_sort_field.ObjectSortField field;
	sort_order.SortOrder order;
}
