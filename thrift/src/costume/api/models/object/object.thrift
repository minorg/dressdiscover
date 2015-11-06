namespace bean_java net.lab1318.costume.gui.models.object
namespace java net.lab1318.costume.api.models.object
namespace * costume.api.models.object

include "costume/api/models/model_metadata.thrift"
include "costume/api/models/collection/collection_id.thrift"
include "costume/api/models/image/image.thrift"
include "costume/api/models/institution/institution_id.thrift"
include "thryft/native/date_time.thrift"
include "thryft/native/url.thrift"

// @java_implements org.notaweb.api.models.Model
struct Object {
	1: collection_id.CollectionId collection_id;

	2: institution_id.InstitutionId institution_id;

	12: model_metadata.ModelMetadata model_metadata;

	// @validation {"minLength": 1}
	3: string title;

	10: optional date_time.DateTime date;

	// @validation {"minLength": 1}
	11: optional string date_text;

	// @validation {"minLength": 1}
	4: optional string description;

	// @validation {"minLength": 1}
	5: optional string provenance;

	// @validation {"minLength": 1}
	7: optional string summary;

	8: optional image.Image thumbnail;

	9: optional url.Url url;
}
