namespace * dressdiscover.api.services.worksheet

include "dressdiscover/api/models/worksheet/worksheet_feature_set_id.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_set_state.thrift"
include "dressdiscover/api/services/io_exception.thrift"

service WorksheetCommandService {
    void
    put_worksheet_feature_set_states(
        map<worksheet_feature_set_id.WorksheetFeatureSetId, worksheet_feature_set_state.WorksheetFeatureSetState> worksheet_feature_set_states
    ) throws (
        io_exception.IoException e
    );
}
