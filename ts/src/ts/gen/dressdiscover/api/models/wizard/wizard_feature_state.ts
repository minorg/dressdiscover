/// <reference path="../../../../../../typings/index.d.ts" />
module dressdiscover.api.models.wizard {
    export class WizardFeatureState extends Backbone.Model {
        constructor(attributes?: {values: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureValueState}}) {
            super(attributes);
        }

        get values(): {[index: string]: dressdiscover.api.models.wizard.WizardFeatureValueState} {
            return this.get('values');
        }

        set values(value: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureValueState}) {
            this.set('values', value);
        }

        static fromThryftJSON(json: any): dressdiscover.api.models.wizard.WizardFeatureState {
            var out: dressdiscover.api.models.wizard.WizardFeatureState = new dressdiscover.api.models.wizard.WizardFeatureState;
            for (var fieldName in json) {
                if (fieldName == "values") {
                    out.attributes.values = function (json: any): {[index: string]: dressdiscover.api.models.wizard.WizardFeatureValueState} { var map: any = {}; for (var key in json) { map[key] = dressdiscover.api.models.wizard.WizardFeatureValueState.fromThryftJSON(json[key]); } return map; }(json[fieldName]);
                }
            }
            return out;
        }

        toThryftJSON(): any {
            var json: {[index: string]: any} = {};
            json["values"] = function (value: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureValueState}): {[index: string]: dressdiscover.api.models.wizard.WizardFeatureValueState} { var outObject: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureValueState} = {}; for (var key in value) { outObject[key] = json[key].toThryftJSON(); } return outObject; }(this.values);
            return json;
        }
    }
}
