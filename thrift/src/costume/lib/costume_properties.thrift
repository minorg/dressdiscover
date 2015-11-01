namespace java net.lab1318.costume.lib
namespace * costume.lib

include "thryft/native/u32.thrift"
include "thryft/native/url.thrift"

// @java_implements org.notaweb.lib.Properties
struct CostumeProperties {
	url.Url api_url = "http://middleware:8082/api/";

	// dev, staging, production, etc.
	string environment;

	string elastic_search_host = "elasticsearch";
	u32.u32 elastic_search_port = 9300;

	string home_directory_path;

	optional string logback_xml_file_path;

	optional string powerhouse_museum_api_key;
}
