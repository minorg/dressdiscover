namespace bean_java net.lab1318.costume.gui.models.institution
namespace java net.lab1318.costume.api.models.institution
namespace * costume.api.models.institution

include "costume/api/models/model_metadata.thrift"
include "thryft/native/url.thrift"

// @java_implements org.notaweb.api.models.Model
struct Institution {
	// @validation {"minLength": 1}
	2: string copyright_notice;

	4: model_metadata.ModelMetadata model_metadata;

	// @validation {"minLength": 1}
	1: string title;

	3: url.Url url;
}
