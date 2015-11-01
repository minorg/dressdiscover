namespace bean_java net.lab1318.costume.gui.models.object
namespace java net.lab1318.costume.api.models.object
namespace * costume.api.models.object

include "costume/api/models/collection/collection_id.thrift"
include "costume/api/models/institution/institution_id.thrift"

// @java_implements org.notaweb.api.models.Model
struct Object {
	1: institution_id.InstitutionId institution_id;

	// @validation {"minLength": 1}
	3: string title;

	2: optional collection_id.CollectionId collection_id;

	4: optional string description;
}
