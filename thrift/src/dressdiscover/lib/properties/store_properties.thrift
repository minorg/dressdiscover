namespace * dressdiscover.lib.properties

// @java_implements org.thryft.waf.lib.Properties
struct StoreProperties {
    bool cache_collections = true;
    bool cache_institutions = true;

    string data_directory_path;

	string elastic_search_host = "elasticsearch";
	i32 elastic_search_port = 9300;

	i32 object_summaries_result_cache_size = 1024;

	i32 object_summary_cache_size = 1024;

	i32 resummarize_objects_bulk_request_size = 1000;
}
