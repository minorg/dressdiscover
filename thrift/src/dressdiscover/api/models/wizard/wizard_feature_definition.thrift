namespace * dressdiscover.api.models.wizard

include "dressdiscover/api/models/wizard_feature_type.thrift"
include "dressdiscover/api/models/wizard_feature_value_definition.thrift"
include "dressdiscover/api/models/wizard_feature_value_id.thrift"

struct WizardFeatureDefinition {
    // @validation {"blank": false, "minLength": 1}
    string display_name;

    wizard_feature_type.WizardFeatureType type;

    // @validation {"minLength": 1}
    optional map<wizard_feature_value_id.WizardFeatureValueId, wizard_feature_value_definition.WizardFeatureValueDefinition> values;
}
