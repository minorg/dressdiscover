/// <reference path="../../../../../../typings/index.d.ts" />
module dressdiscover.api.models.wizard {
    export class WizardFeatureValueDefinition extends Backbone.Model {
        constructor(attributes?: {display_name: string}) {
            super(attributes);
        }

        get display_name(): string {
            return this.get('display_name');
        }

        set display_name(value: string) {
            this.set('display_name', value);
        }

        static fromThryftJSON(json: any): dressdiscover.api.models.wizard.WizardFeatureValueDefinition {
            var out: dressdiscover.api.models.wizard.WizardFeatureValueDefinition = new dressdiscover.api.models.wizard.WizardFeatureValueDefinition;
            for (var fieldName in json) {
                if (fieldName == "display_name") {
                    out.attributes.display_name = json[fieldName];
                }
            }
            return out;
        }

        toThryftJSON(): any {
            var json: {[index: string]: any} = {};
            json["display_name"] = this.display_name;
            return json;
        }
    }
}
