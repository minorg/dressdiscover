namespace java net.lab1318.costume.lib
namespace * costume.lib

include "thryft/native/u32.thrift"
include "thryft/native/url.thrift"

// @java_implements org.thryft.waf.lib.Properties
struct CostumeProperties {
	url.Url api_url = "http://middleware:8082/api/";

	// dev, staging, production, etc.
	string environment;

	string elastic_search_host = "elasticsearch";
	u32.u32 elastic_search_port = 9300;

	// @validation {"minLength": 1}
	string google_oauth_key;
	// @validation {"minLength": 1}
	string google_oauth_secret;

	string home_directory_path;

	u32.u32 object_summaries_result_cache_size = 1024;

	u32.u32 object_summary_cache_size = 1024;
}
