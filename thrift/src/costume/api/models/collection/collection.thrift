namespace bean_java net.lab1318.costume.gui.models.collection
namespace java net.lab1318.costume.api.models.collection
namespace * costume.api.models.collection

include "costume/api/models/model_metadata.thrift"
include "costume/api/models/institution/institution_id.thrift"

// @java_implements org.notaweb.api.models.Model
struct Collection {
	3: model_metadata.ModelMetadata model_metadata;

	1: institution_id.InstitutionId institution_id;

	// @validation {"minLength": 1}
	2: string title;
}
