namespace bean_java net.lab1318.costume.gui.models
namespace java net.lab1318.costume.api.models
namespace * costume.api.models

include "thryft/native/date_time.thrift"

struct ModelMetadata {
	1: date_time.DateTime ctime;
	2: date_time.DateTime mtime;
}
