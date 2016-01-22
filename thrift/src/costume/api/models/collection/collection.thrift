namespace bean_java net.lab1318.costume.gui.models.collection
namespace java net.lab1318.costume.api.models.collection
namespace * costume.api.models.collection

include "costume/api/models/model_metadata.thrift"
include "costume/api/models/institution/institution_id.thrift"
include "costume/api/models/work_type/work_type_set.thrift"

// @java_implements org.thryft.waf.api.models.Model
struct Collection {
	1: institution_id.InstitutionId institution_id;

	3: model_metadata.ModelMetadata model_metadata;

	// @validation {"minLength": 1}
	2: string title;

	// @validation {"minLength": 1}
	4: optional string description;

	// @validation {"acceptance": true}
	5: optional bool hidden;

	6: optional work_type_set.WorkTypeSet work_types;
}
