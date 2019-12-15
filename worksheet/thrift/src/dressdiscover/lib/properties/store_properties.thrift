namespace * dressdiscover.lib.properties

include "thryft/native/host_and_port.thrift"

// @java_implements org.thryft.waf.lib.Properties
struct StoreProperties {
    bool cache_collections = true;
    bool cache_institutions = true;

    string data_directory_path;

    host_and_port.HostAndPort elastic_search_host = "elasticsearch:9300";

    list<host_and_port.HostAndPort> mongo_hosts = ["mongodb:27017"];

	i32 object_summaries_result_cache_size = 1024;

	i32 object_summary_cache_size = 1024;

	i32 resummarize_objects_bulk_request_size = 1000;
}
