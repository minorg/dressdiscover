namespace java net.lab1318.costume.api.services.object
namespace * costume.api.services.object

include "thryft/native/u32.thrift"

struct GetObjectsOptions {
	u32.u32 from_;
	u32.u32 size;
}
