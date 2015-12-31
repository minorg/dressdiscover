namespace bean_java net.lab1318.costume.gui.models.institution
namespace java net.lab1318.costume.api.models.institution
namespace * costume.api.models.institution

include "costume/api/models/model_metadata.thrift"
include "costume/api/models/rights/rights_set.thrift"
include "thryft/native/url.thrift"

// @java_implements org.thryft.waf.api.models.Model
struct Institution {
	5: rights_set.RightsSet	data_rights;

	4: model_metadata.ModelMetadata model_metadata;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	1: string title;

	3: url.Url url;
}
