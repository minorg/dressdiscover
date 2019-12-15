namespace * dressdiscover.lib.properties

include "dressdiscover/lib/properties/environment.thrift"

// @java_implements org.thryft.waf.lib.Properties
struct GlobalProperties {
	environment.Environment environment;

    optional list<string> python_path;
}
