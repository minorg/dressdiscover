namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_extent_id.thrift"
include "thryft/waf/api/models/non_blank_string.thrift"

struct WorksheetExtentDefinition {
	worksheet_extent_id.WorksheetExtentId id;

    optional non_blank_string.NonBlankString display_name;
}
