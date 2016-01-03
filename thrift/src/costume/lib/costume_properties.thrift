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

	string home_directory_path;

	u32.u32 object_facets_cache_size = 1024;

	optional string logback_xml_file_path;
}
