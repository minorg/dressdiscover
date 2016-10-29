namespace * dressdiscover.api.models.object

include "dressdiscover/api/models/image/image.thrift"
include "dressdiscover/api/vocabularies/costume_core/costume_core_object.thrift"
include "dressdiscover/api/vocabularies/dublin_core/dublin_core_object.thrift"
include "dressdiscover/api/vocabularies/vra_core/vra_core_object.thrift"

// @java_implements org.thryft.waf.api.models.Model
struct Object {
    1: optional costume_core_object.CostumeCoreObject costume_core;

    2: optional dublin_core_object.DublinCoreObject dublin_core;

	// @validation {"acceptance": true}
	3: optional bool hidden;

	// @validation {"minLength": 1}
	4: optional list<image.Image> images;

    6: optional vra_core_object.VraCoreObject vra_core;
}
