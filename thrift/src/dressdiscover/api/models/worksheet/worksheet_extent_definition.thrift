namespace cs DressDiscover.Api.Models.Worksheet
namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_description.thrift"
include "dressdiscover/api/models/worksheet/worksheet_extent_id.thrift"
include "thryft/waf/api/models/non_blank_string.thrift"

struct WorksheetExtentDefinition {
	worksheet_extent_id.WorksheetExtentId id;

    optional worksheet_description.WorksheetDescription description;

    optional non_blank_string.NonBlankString display_name;
}
