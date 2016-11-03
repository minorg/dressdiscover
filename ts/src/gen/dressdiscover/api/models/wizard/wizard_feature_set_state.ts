/// <reference path="../../../../../../typings/index.d.ts" />
module dressdiscover.api.models.wizard {
    export class WizardFeatureSetState extends Backbone.Model {
        constructor(attributes?: {features?: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureState}}) {
            super(attributes);
        }

        get features(): {[index: string]: dressdiscover.api.models.wizard.WizardFeatureState} {
            return this.get('features');
        }

        set features(value: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureState}) {
            this.set('features', value);
        }

        static fromThryftJSON(json: any): dressdiscover.api.models.wizard.WizardFeatureSetState {
            var out: dressdiscover.api.models.wizard.WizardFeatureSetState = new dressdiscover.api.models.wizard.WizardFeatureSetState;
            for (var fieldName in json) {
                if (fieldName == "features") {
                    out.attributes.features = function (json: any): {[index: string]: dressdiscover.api.models.wizard.WizardFeatureState} { var map: any = {}; for (var key in json) { map[key] = dressdiscover.api.models.wizard.WizardFeatureState.fromThryftJSON(json[key]); } return map; }(json[fieldName]);
                }
            }
            return out;
        }

        toThryftJSON(): any {
            var json: {[index: string]: any} = {};
            if (this.has("features")) {
                json["features"] = function (value: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureState}): {[index: string]: dressdiscover.api.models.wizard.WizardFeatureState} { var outObject: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureState} = {}; for (var key in value) { outObject[key] = json[key].toThryftJSON(); } return outObject; }(this.features);
            }
            return json;
        }
    }
}
