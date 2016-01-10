namespace bean_java net.lab1318.costume.gui.models.institution
namespace java net.lab1318.costume.api.models.institution
namespace * costume.api.models.institution

include "costume/api/models/model_metadata.thrift"
include "costume/api/models/rights/rights_set.thrift"
include "thryft/native/url.thrift"

// @java_implements org.thryft.waf.api.models.Model
struct Institution {
	4: model_metadata.ModelMetadata model_metadata;

	1: string title;

	5: optional rights_set.RightsSet	data_rights;

	// @validation {"acceptance": true}
	6: optional bool hidden;

	3: optional url.Url url;
}
