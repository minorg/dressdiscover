/// <reference path="../../../../../../../typings/index.d.ts" />
module dressdiscover.api.models.wizard {
    export class WizardFeatureSetDefinition extends Backbone.Model {
        constructor(attributes?: {display_name: string, features: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureDefinition}}) {
            super(attributes);
        }

        get display_name(): string {
            return this.get('display_name');
        }

        set display_name(value: string) {
            this.set('display_name', value);
        }

        get features(): {[index: string]: dressdiscover.api.models.wizard.WizardFeatureDefinition} {
            return this.get('features');
        }

        set features(value: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureDefinition}) {
            this.set('features', value);
        }

        static fromThryftJSON(json: any): dressdiscover.api.models.wizard.WizardFeatureSetDefinition {
            var out: dressdiscover.api.models.wizard.WizardFeatureSetDefinition = new dressdiscover.api.models.wizard.WizardFeatureSetDefinition;
            for (var fieldName in json) {
                if (fieldName == "display_name") {
                    out.attributes.display_name = json[fieldName];
                } else if (fieldName == "features") {
                    out.attributes.features = function (json: any): {[index: string]: dressdiscover.api.models.wizard.WizardFeatureDefinition} { var map: any = {}; for (var key in json) { map[key] = dressdiscover.api.models.wizard.WizardFeatureDefinition.fromThryftJSON(json[key]); } return map; }(json[fieldName]);
                }
            }
            return out;
        }

        toThryftJSON(): any {
            var json: {[index: string]: any} = {};
            json["display_name"] = this.display_name;
            json["features"] = function (value: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureDefinition}): {[index: string]: dressdiscover.api.models.wizard.WizardFeatureDefinition} { var outObject: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureDefinition} = {}; for (var key in value) { outObject[key] = json[key].toThryftJSON(); } return outObject; }(this.features);
            return json;
        }
    }
}
