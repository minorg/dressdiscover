namespace bean_java org.dressdiscover.gui.models.institution
namespace java org.dressdiscover.api.models.institution
namespace * dressdiscover.api.models.institution

include "dressdiscover/api/vocabularies/vra_core/location/location_set.thrift"
include "dressdiscover/api/vocabularies/vra_core/rights/rights_set.thrift"
include "thryft/native/uri.thrift"
include "thryft/native/url.thrift"

// @java_implements org.thryft.waf.api.models.Model
struct Institution {
	1: string title;

    9: optional uri.Uri collection_store_uri;

	5: optional rights_set.RightsSet	data_rights;

    // @validation {"acceptance": true}
    7: optional bool external;

	// @validation {"acceptance": true}
	6: optional bool hidden;

    8: optional location_set.LocationSet locations;

    // @validation {"minLength": 1}
    10: optional map<string, string> store_parameters;

	3: optional url.Url url;
}
