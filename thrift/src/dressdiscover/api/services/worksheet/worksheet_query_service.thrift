namespace * dressdiscover.api.services.worksheet

include "dressdiscover/api/models/worksheet/worksheet_feature_set_definition.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_set_id.thrift"
include "dressdiscover/api/models/worksheet/worksheet_feature_set_state.thrift"
include "dressdiscover/api/services/io_exception.thrift"

service WorksheetQueryService {
    map<worksheet_feature_set_id.WorksheetFeatureSetId, worksheet_feature_set_definition.WorksheetFeatureSetDefinition>
    get_worksheet_feature_set_definitions(
    ) throws (
        io_exception.IoException e
    );

    map<worksheet_feature_set_id.WorksheetFeatureSetId, worksheet_feature_set_state.WorksheetFeatureSetState>
    get_worksheet_feature_set_states(
    ) throws (
        io_exception.IoException e
    );
}
