namespace * dressdiscover.api.models.agent

include "dressdiscover/api/models/agent/agent_dates_type.thrift"
include "thryft/native/date_time.thrift"

// VRA Core 4.0 agent.dates element
struct AgentDates {
	1: agent_dates_type.AgentDatesType type;

	2: optional date_time.DateTime earliest_date;
	3: optional date_time.DateTime latest_date;
}
