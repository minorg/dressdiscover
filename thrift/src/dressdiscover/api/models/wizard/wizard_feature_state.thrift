namespace * dressdiscover.api.models.wizard

include "dressdiscover/api/models/wizard/wizard_feature_value_id.thrift"
include "dressdiscover/api/models/wizard/wizard_feature_value_state.thrift"

struct WizardFeatureState {
    // @validation {"minLength": 1}
    map<wizard_feature_value_id.WizardFeatureValueId, wizard_feature_value_state.WizardFeatureValueState> values;
}
