namespace * dressdiscover.api.vocabularies.vra_core.agent

include "dressdiscover/api/vocabularies/vra_core/agent/agent.thrift"

// VRA Core 4.0 agentSet element
// @java_implements org.dressdiscover.api.models.ElementSet<org.dressdiscover.api.models.agent.Agent>
struct AgentSet {
	// @validation {"minLength": 1}
	1: list<agent.Agent> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
