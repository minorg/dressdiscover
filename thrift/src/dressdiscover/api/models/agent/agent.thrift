namespace bean_java org.dressdiscover.gui.models.agent
namespace java org.dressdiscover.api.models.agent
namespace * dressdiscover.api.models.agent

include "dressdiscover/api/models/agent/agent_dates.thrift"
include "dressdiscover/api/models/agent/agent_name.thrift"
include "dressdiscover/api/models/agent/agent_role.thrift"

// VRA Core 4.0 agent element
// @java_implements net.lab1318.costume.api.models.Element
struct Agent {
	1: agent_name.AgentName name;

	// @validation {"minLength": 1}
	2: optional string attribution;

	// @validation {"minLength": 1}
	3: optional string culture;

	// @validation {"minLength": 1}
	4: optional list<agent_dates.AgentDates> dates;

	5: optional agent_role.AgentRole role;
}
