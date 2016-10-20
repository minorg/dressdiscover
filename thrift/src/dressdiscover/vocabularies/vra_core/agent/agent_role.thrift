namespace * dressdiscover.api.models.agent

include "dressdiscover/api/models/vocab_ref.thrift"

// VRA Core 4.0 agent role= attribute
struct AgentRole {
	// @validation {"minLength": 1}
	1: string text;

	4: optional vocab_ref.VocabRef vocab_ref;
}
