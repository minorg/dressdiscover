namespace * dressdiscover.api.services.wizard

include "dressdiscover/api/models/wizard/wizard_feature_set_definition.thrift"
include "dressdiscover/api/models/wizard/wizard_feature_set_id.thrift"
include "dressdiscover/api/models/wizard/wizard_feature_set_state.thrift"
include "dressdiscover/api/services/io_exception.thrift"

service WizardQueryService {
    map<wizard_feature_set_id.WizardFeatureSetId, wizard_feature_set_definition.WizardFeatureSetDefinition>
    get_wizard_feature_set_definitions(
    ) throws (
        io_exception.IoException e
    );

    map<wizard_feature_set_id.WizardFeatureSetId, wizard_feature_set_state.WizardFeatureSetState>
    get_wizard_feature_set_states(
    ) throws (
        io_exception.IoException e
    );
}
