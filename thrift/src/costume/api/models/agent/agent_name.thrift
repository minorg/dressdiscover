namespace bean_java net.lab1318.costume.gui.models.agent
namespace java net.lab1318.costume.api.models.agent
namespace * costume.api.models.agent

include "costume/api/models/refid.thrift"
include "costume/api/models/vocab.thrift"
include "costume/api/models/agent/agent_name_type.thrift"

// VRA Core 4.0 agent.name element
struct AgentName {
	// @validation {"minLength": 1}
	1: string text;

	2: agent_name_type.AgentNameType type;

	3: optional refid.Refid refid;
	4: optional vocab.Vocab vocab;
}
