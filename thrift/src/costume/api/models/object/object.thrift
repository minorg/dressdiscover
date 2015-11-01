namespace bean_java net.lab1318.costume.gui.models.object
namespace java net.lab1318.costume.api.models.object
namespace * costume.api.models.object

include "costume/api/models/collection/collection_id.thrift"
include "costume/api/models/institution/institution_id.thrift"
include "thryft/native/url.thrift"

// @java_implements org.notaweb.api.models.Model
struct Object {
	1: collection_id.CollectionId collection_id;

	2: institution_id.InstitutionId institution_id;

	// @validation {"minLength": 1}
	3: string title;

	4: optional string description;

	5: optional string provenance;

	6: optional string source_id;

	7: optional string summary;

	8: optional url.Url thumbnail_url;

	9: optional url.Url url;
}
