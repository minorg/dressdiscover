/// <reference path="../../../../../../../typings/index.d.ts" />
module dressdiscover.api.models.wizard {
    export class WizardFeatureState extends Backbone.Model {
        constructor(attributes?: {feature_values: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureValueState}}) {
            super(attributes);
        }

        get feature_values(): {[index: string]: dressdiscover.api.models.wizard.WizardFeatureValueState} {
            return this.get('feature_values');
        }

        set feature_values(value: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureValueState}) {
            this.set('feature_values', value);
        }

        static fromThryftJSON(json: any): dressdiscover.api.models.wizard.WizardFeatureState {
            var out: dressdiscover.api.models.wizard.WizardFeatureState = new dressdiscover.api.models.wizard.WizardFeatureState;
            for (var fieldName in json) {
                if (fieldName == "feature_values") {
                    out.attributes.feature_values = function (json: any): {[index: string]: dressdiscover.api.models.wizard.WizardFeatureValueState} { var map: any = {}; for (var key in json) { map[key] = dressdiscover.api.models.wizard.WizardFeatureValueState.fromThryftJSON(json[key]); } return map; }(json[fieldName]);
                }
            }
            return out;
        }

        toThryftJSON(): any {
            var json: {[index: string]: any} = {};
            json["feature_values"] = function (value: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureValueState}): {[index: string]: dressdiscover.api.models.wizard.WizardFeatureValueState} { var outObject: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureValueState} = {}; for (var key in value) { outObject[key] = value[key].toThryftJSON(); } return outObject; }(this.feature_values);
            return json;
        }
    }
}
