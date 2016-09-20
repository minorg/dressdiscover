namespace java org.dressdiscover.lib
namespace * dressdiscover.lib

include "thryft/native/url.thrift"

// @java_implements org.thryft.waf.lib.Properties
struct DressDiscoverProperties {
	url.Url api_url = "http://middleware:8082/api/";

    bool cache_collections = true;
    bool cache_institutions = true;

	string elastic_search_host = "elasticsearch";
	i32 elastic_search_port = 9300;

	// dev, staging, production, etc.
	string environment;

    // @validation {"minLength": 1}
	string google_api_key;

	// @validation {"minLength": 1}
	string google_oauth_key;
	// @validation {"minLength": 1}
	string google_oauth_secret;

	string home_directory_path;

	i32 object_summaries_result_cache_size = 1024;

	i32 object_summary_cache_size = 1024;

	i32 resummarize_objects_bulk_request_size = 1000;
}
