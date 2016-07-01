namespace bean_java org.dressdiscover.gui.models.agent
namespace java org.dressdiscover.api.models.agent
namespace * dressdiscover.api.models.agent

include "costume/api/models/agent/agent.thrift"

// VRA Core 4.0 agentSet element
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.agent.Agent>
struct AgentSet {
	// @validation {"minLength": 1}
	1: list<agent.Agent> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}