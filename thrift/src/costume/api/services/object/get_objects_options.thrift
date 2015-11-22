namespace java net.lab1318.costume.api.services.object
namespace * costume.api.services.object

include "costume/api/services/object/object_sort.thrift"
include "thryft/native/u32.thrift"

struct GetObjectsOptions {
	optional u32.u32 from_;
	optional u32.u32 size;

	// @validation {"minLength": 1}
	optional list<object_sort.ObjectSort> sorts;
}
