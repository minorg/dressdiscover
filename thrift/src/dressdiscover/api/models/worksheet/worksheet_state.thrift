namespace cs DressDiscover.Api.Models.Worksheet
namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_accession_number.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_set_state.thrift"

struct WorksheetState {
    worksheet_accession_number.WorksheetAccessionNumber accession_number;
    optional worksheet_feature_set_state.WorksheetFeatureSetState root_feature_set;
}
