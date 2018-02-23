namespace * dressdiscover.api.models.worksheet

include "dressdiscover/api/models/worksheet/worksheet_accession_number.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_set_id.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_set_state.thrift"

struct WorksheetState {
    worksheet_accession_number.WorksheetAccessionNumber accession_number;
    optional map<worksheet_feature_set_id.WorksheetFeatureSetId, worksheet_feature_set_state.WorksheetFeatureSetState> feature_sets;
}
