/// <reference path="../../../../../../../typings/index.d.ts" />
module dressdiscover.api.models.wizard {
    export class WizardFeatureDefinition extends Backbone.Model {
        constructor(attributes?: {display_name: string, type: dressdiscover.api.models.wizard.WizardFeatureType, feature_values?: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureValueDefinition}}) {
            super(attributes);
        }

        get display_name(): string {
            return this.get('display_name');
        }

        set display_name(value: string) {
            this.set('display_name', value);
        }

        get type(): dressdiscover.api.models.wizard.WizardFeatureType {
            return this.get('type');
        }

        set type(value: dressdiscover.api.models.wizard.WizardFeatureType) {
            this.set('type', value);
        }

        get feature_values(): {[index: string]: dressdiscover.api.models.wizard.WizardFeatureValueDefinition} {
            return this.get('feature_values');
        }

        set feature_values(value: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureValueDefinition}) {
            this.set('feature_values', value);
        }

        static fromThryftJSON(json: any): dressdiscover.api.models.wizard.WizardFeatureDefinition {
            var out: dressdiscover.api.models.wizard.WizardFeatureDefinition = new dressdiscover.api.models.wizard.WizardFeatureDefinition;
            for (var fieldName in json) {
                if (fieldName == "display_name") {
                    out.attributes.display_name = json[fieldName];
                } else if (fieldName == "type") {
                    out.attributes.type = dressdiscover.api.models.wizard.WizardFeatureType[json[fieldName]];
                } else if (fieldName == "feature_values") {
                    out.attributes.feature_values = function (json: any): {[index: string]: dressdiscover.api.models.wizard.WizardFeatureValueDefinition} { var map: any = {}; for (var key in json) { map[key] = dressdiscover.api.models.wizard.WizardFeatureValueDefinition.fromThryftJSON(json[key]); } return map; }(json[fieldName]);
                }
            }
            return out;
        }

        toThryftJSON(): any {
            var json: {[index: string]: any} = {};
            json["display_name"] = this.display_name;
            json["type"] = dressdiscover.api.models.wizard.WizardFeatureType[this.type];
            if (this.has("feature_values")) {
                json["feature_values"] = function (value: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureValueDefinition}): {[index: string]: dressdiscover.api.models.wizard.WizardFeatureValueDefinition} { var outObject: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureValueDefinition} = {}; for (var key in value) { outObject[key] = value[key].toThryftJSON(); } return outObject; }(this.feature_values);
            }
            return json;
        }
    }
}
