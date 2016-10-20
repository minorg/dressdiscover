namespace * dressdiscover.api.vocabularies.vra_core.agent

include "dressdiscover/api/vocabularies/vra_core/vocab_ref.thrift"
include "dressdiscover/api/vocabularies/vra_core/agent/agent_name_type.thrift"

// VRA Core 4.0 agent.name element
struct AgentName {
	// @validation {"minLength": 1}
	1: string text;

	2: agent_name_type.AgentNameType type;

	5: optional vocab_ref.VocabRef vocab_ref;
}
