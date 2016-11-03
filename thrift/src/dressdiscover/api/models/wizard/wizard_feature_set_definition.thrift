namespace * dressdiscover.api.models.wizard

include "dressdiscover/api/models/wizard/wizard_feature_definition.thrift"
include "dressdiscover/api/models/wizard/wizard_feature_id.thrift"

struct WizardFeatureSetDefinition {
    // @validation {"blank": false, "minLength": 1}
    string display_name;
    // @validation {"minLength": 1}
    map<wizard_feature_id.WizardFeatureId, wizard_feature_definition.WizardFeatureDefinition> features;
}
