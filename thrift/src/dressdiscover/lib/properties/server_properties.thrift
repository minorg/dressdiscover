namespace * dressdiscover.lib.properties

// @java_implements org.thryft.waf.lib.Properties
struct ServerProperties {
    // @validation {"minLength": 1}
	string google_api_key;

	// @validation {"minLength": 1}
	string google_oauth_key;
	// @validation {"minLength": 1}
	string google_oauth_secret;
}
