namespace * dressdiscover.api.models.collection

include "dressdiscover/api/models/institution/institution_id.thrift"
include "dressdiscover/api/vocabularies/vra_core/location/location_set.thrift"
include "dressdiscover/api/vocabularies/vra_core/work_type/work_type_set.thrift"
include "thryft/native/uri.thrift"
include "thryft/native/url.thrift"

// @java_implements org.thryft.waf.api.models.Model
struct Collection {
	1: institution_id.InstitutionId institution_id;

	// @validation {"minLength": 1}
	2: string title;

	// @validation {"minLength": 1}
	4: optional string description;

    // @validation {"acceptance": true}
    7: optional bool external;

	// @validation {"acceptance": true}
	5: optional bool hidden;

    8: optional location_set.LocationSet locations;

    10: optional uri.Uri object_store_uri;

    9: optional url.Url url;

	6: optional work_type_set.WorkTypeSet work_types;
}
