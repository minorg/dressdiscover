namespace bean_java net.lab1318.costume.gui.models.agent
namespace java net.lab1318.costume.api.models.agent
namespace * costume.api.models.agent

include "costume/api/models/agent/agent_dates.thrift"
include "costume/api/models/agent/agent_name.thrift"
include "costume/api/models/agent/agent_role.thrift"

// VRA Core 4.0 agent element
// @java_implements net.lab1318.costume.api.models.Element
struct Agent {
	1: agent_name.AgentName name;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	2: optional string attribution;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	3: optional string culture;

	// @validation {"minLength": 1}
	4: optional list<agent_dates.AgentDates> dates;

	5: optional agent_role.AgentRole role;
}
