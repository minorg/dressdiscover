namespace bean_java org.dressdiscover.gui.models.agent
namespace java org.dressdiscover.api.models.agent
namespace * dressdiscover.api.models.agent

include "costume/api/models/vocab_ref.thrift"
include "costume/api/models/agent/agent_name_type.thrift"

// VRA Core 4.0 agent.name element
struct AgentName {
	// @validation {"minLength": 1}
	1: string text;

	2: agent_name_type.AgentNameType type;

	5: optional vocab_ref.VocabRef vocab_ref;
}
