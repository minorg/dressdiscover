namespace bean_java net.lab1318.costume.gui.models.agent
namespace java net.lab1318.costume.api.models.agent
namespace * costume.api.models.agent

include "costume/api/models/vocab_ref.thrift"

// VRA Core 4.0 agent role= attribute
struct AgentRole {
	// @validation {"minLength": 1}
	1: string text;

	4: optional vocab_ref.VocabRef vocab_ref;
}
