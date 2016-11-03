namespace * dressdiscover.api.models.wizard

include "dressdiscover/api/models/wizard/wizard_feature_id.thrift"
include "dressdiscover/api/models/wizard/wizard_feature_state.thrift"

struct WizardFeatureSetState {
    // @validation {"minLength": 1}
    optional map<wizard_feature_id.WizardFeatureId, wizard_feature_state.WizardFeatureState> features;
}
