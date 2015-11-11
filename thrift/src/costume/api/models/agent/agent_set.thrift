namespace bean_java net.lab1318.costume.gui.models.agent
namespace java net.lab1318.costume.api.models.agent
namespace * costume.api.models.agent

include "costume/api/models/agent/agent.thrift"

// VRA Core 4.0 agentSet element
struct AgentSet {
	// @validation {"minLength": 1}
	1: list<agent.Agent> agents;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
