namespace bean_java net.lab1318.costume.gui.models.agent
namespace java net.lab1318.costume.api.models.agent
namespace * costume.api.models.agent

include "costume/api/models/vocab_ref.thrift"
include "costume/api/models/agent/agent_name_type.thrift"

// VRA Core 4.0 agent.name element
struct AgentName {
	// @elastic_search_mapping {"type": "multi_field", "fields": {"text": {"type": "string"}, "not_analyzed": {"type": "string", "index": "not_analyzed"}}}
	// @validation {"minLength": 1}
	1: string text;

	2: agent_name_type.AgentNameType type;

	5: optional vocab_ref.VocabRef vocab_ref;
}
