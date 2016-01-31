namespace bean_java net.lab1318.costume.gui.models.user
namespace java net.lab1318.costume.api.models.user
namespace * costume.api.models.user

include "costume/api/models/model_metadata.thrift"

// @java_implements org.thryft.waf.api.models.Model
struct User {
	1: model_metadata.ModelMetadata model_metadata;
}
