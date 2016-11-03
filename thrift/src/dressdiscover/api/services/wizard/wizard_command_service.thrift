namespace * dressdiscover.api.services.wizard

include "dressdiscover/api/models/wizard/wizard_feature_set_id.thrift"
include "dressdiscover/api/models/wizard/wizard_feature_set_state.thrift"
include "dressdiscover/api/services/io_exception.thrift"

service WizardCommandService {
    void
    put_wizard_feature_set_states(
        map<wizard_feature_set_id.WizardFeatureSetId, wizard_feature_set_state.WizardFeatureSetState> wizard_feature_set_states
    ) throws (
        io_exception.IoException e
    );
}
